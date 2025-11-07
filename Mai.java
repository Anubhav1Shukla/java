import java.io.*;
import java.util.*;

public class Mai {
    static final long MOD = 1_000_000_007L;
    static final int MAX_BITS = 60; // since ti ≤ 1e18

    static class Edge {
        int to;
        long w;
        Edge(int t, long w) { this.to = t; this.w = w; }
    }

    static List<Edge>[] g;
    static boolean[] vis;
    static long[] xorDist;
    static List<Long> basis;
    static List<Integer> nodes;

    static void dfs(int u, long curXor) {
        vis[u] = true;
        xorDist[u] = curXor;
        nodes.add(u);
        for (Edge e : g[u]) {
            if (!vis[e.to]) {
                dfs(e.to, curXor ^ e.w);
            } else {
                long cyc = curXor ^ xorDist[e.to] ^ e.w;
                addBasis(cyc);
            }
        }
    }

    static void addBasis(long x) {
        for (long b : basis) {
            x = Math.min(x, x ^ b);
        }
        if (x != 0) basis.add(x);
    }

    static long modPow(long a, long b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) != 0) res = (res * a) % MOD;
            a = (a * a) % MOD;
            b >>= 1;
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        StringTokenizer st;
        while ((line = br.readLine()) != null) {
            if (line.isEmpty()) continue;
            st = new StringTokenizer(line);
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            g = new ArrayList[n + 1];
            for (int i = 1; i <= n; i++) g[i] = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                long w = Long.parseLong(st.nextToken());
                g[u].add(new Edge(v, w));
                g[v].add(new Edge(u, w));
            }

            vis = new boolean[n + 1];
            xorDist = new long[n + 1];
            long ans = 0;

            for (int i = 1; i <= n; i++) {
                if (!vis[i]) {
                    basis = new ArrayList<>();
                    nodes = new ArrayList<>();
                    dfs(i, 0);

                    int k = basis.size();
                    long pow2k = modPow(2, k);
                    long pow2k_1 = modPow(2, k - 1 < 0 ? 0 : k - 1);
                    int sz = nodes.size();

                    long[] cnt = new long[MAX_BITS];
                    for (int v : nodes)
                        for (int b = 0; b < MAX_BITS; b++)
                            if (((xorDist[v] >> b) & 1) == 1)
                                cnt[b]++;

                    for (int b = 0; b < MAX_BITS; b++) {
                        long bitVal = (1L << b) % MOD;
                        boolean free = false;
                        for (long x : basis)
                            if (((x >> b) & 1) == 1) {
                                free = true;
                                break;
                            }
                        long contrib;
                        if (free) {
                            long totalPairs = (long) sz * (sz - 1) / 2 % MOD;
                            contrib = (totalPairs % MOD) * ((pow2k_1 * bitVal) % MOD) % MOD;
                        } else {
                            long ones = cnt[b], zeros = sz - ones;
                            long pairs = ones * zeros % MOD;
                            contrib = (pairs * (pow2k % MOD) % MOD * bitVal) % MOD;
                        }
                        ans = (ans + contrib) % MOD;
                    }
                }
            }

            System.out.println(ans % MOD);
        }
    }
}
