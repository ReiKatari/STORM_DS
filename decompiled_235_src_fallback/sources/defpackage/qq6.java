package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qq6  reason: default package */
/* loaded from: classes.dex */
public final class qq6 {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final int m;
    public final long n;

    public qq6(int r1, int r2, long r3, long r5, long r7, long r9, long r11, long r13, long r15, long r17, int r19, int r20, int r21, long r22) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r5
            r0.e = r7
            r0.f = r9
            r0.g = r11
            r0.h = r13
            r1 = r15
            r0.i = r1
            r1 = r17
            r0.j = r1
            r1 = r19
            r0.k = r1
            r1 = r20
            r0.l = r1
            r1 = r21
            r0.m = r1
            r1 = r22
            r0.n = r1
            return
    }

    public final void a(java.io.PrintWriter r4) {
            r3 = this;
            java.lang.String r0 = "===============BEGIN PICASSO STATS ==============="
            r4.println(r0)
            java.lang.String r0 = "Memory Cache Stats"
            r4.println(r0)
            java.lang.String r0 = "  Max Cache Size: "
            r4.print(r0)
            int r0 = r3.a
            r4.println(r0)
            java.lang.String r1 = "  Cache Size: "
            r4.print(r1)
            int r1 = r3.b
            r4.println(r1)
            java.lang.String r2 = "  Cache % Full: "
            r4.print(r2)
            float r1 = (float) r1
            float r0 = (float) r0
            float r1 = r1 / r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r0
            double r0 = (double) r1
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            r4.println(r0)
            java.lang.String r0 = "  Cache Hits: "
            r4.print(r0)
            long r0 = r3.c
            r4.println(r0)
            java.lang.String r0 = "  Cache Misses: "
            r4.print(r0)
            long r0 = r3.d
            r4.println(r0)
            java.lang.String r0 = "Network Stats"
            r4.println(r0)
            java.lang.String r0 = "  Download Count: "
            r4.print(r0)
            int r0 = r3.k
            r4.println(r0)
            java.lang.String r0 = "  Total Download Size: "
            r4.print(r0)
            long r0 = r3.e
            r4.println(r0)
            java.lang.String r0 = "  Average Download Size: "
            r4.print(r0)
            long r0 = r3.h
            r4.println(r0)
            java.lang.String r0 = "Bitmap Stats"
            r4.println(r0)
            java.lang.String r0 = "  Total Bitmaps Decoded: "
            r4.print(r0)
            int r0 = r3.l
            r4.println(r0)
            java.lang.String r0 = "  Total Bitmap Size: "
            r4.print(r0)
            long r0 = r3.f
            r4.println(r0)
            java.lang.String r0 = "  Total Transformed Bitmaps: "
            r4.print(r0)
            int r0 = r3.m
            r4.println(r0)
            java.lang.String r0 = "  Total Transformed Bitmap Size: "
            r4.print(r0)
            long r0 = r3.g
            r4.println(r0)
            java.lang.String r0 = "  Average Bitmap Size: "
            r4.print(r0)
            long r0 = r3.i
            r4.println(r0)
            java.lang.String r0 = "  Average Transformed Bitmap Size: "
            r4.print(r0)
            long r0 = r3.j
            r4.println(r0)
            java.lang.String r3 = "===============END PICASSO STATS ==============="
            r4.println(r3)
            r4.flush()
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "StatsSnapshot{maxSize="
            r0.<init>(r1)
            int r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", size="
            r0.append(r1)
            int r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", cacheHits="
            r0.append(r1)
            long r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", cacheMisses="
            r0.append(r1)
            long r1 = r3.d
            r0.append(r1)
            java.lang.String r1 = ", downloadCount="
            r0.append(r1)
            int r1 = r3.k
            r0.append(r1)
            java.lang.String r1 = ", totalDownloadSize="
            r0.append(r1)
            long r1 = r3.e
            r0.append(r1)
            java.lang.String r1 = ", averageDownloadSize="
            r0.append(r1)
            long r1 = r3.h
            r0.append(r1)
            java.lang.String r1 = ", totalOriginalBitmapSize="
            r0.append(r1)
            long r1 = r3.f
            r0.append(r1)
            java.lang.String r1 = ", totalTransformedBitmapSize="
            r0.append(r1)
            long r1 = r3.g
            r0.append(r1)
            java.lang.String r1 = ", averageOriginalBitmapSize="
            r0.append(r1)
            long r1 = r3.i
            r0.append(r1)
            java.lang.String r1 = ", averageTransformedBitmapSize="
            r0.append(r1)
            long r1 = r3.j
            r0.append(r1)
            java.lang.String r1 = ", originalBitmapCount="
            r0.append(r1)
            int r1 = r3.l
            r0.append(r1)
            java.lang.String r1 = ", transformedBitmapCount="
            r0.append(r1)
            int r1 = r3.m
            r0.append(r1)
            java.lang.String r1 = ", timeStamp="
            r0.append(r1)
            long r1 = r3.n
            r0.append(r1)
            r3 = 125(0x7d, float:1.75E-43)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
