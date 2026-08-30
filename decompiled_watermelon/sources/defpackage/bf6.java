package defpackage;

import java.io.PrintWriter;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bf6  reason: default package */
/* loaded from: classes.dex */
public final class bf6 {
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

    public bf6(int i, int i2, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i3, int i4, int i5, long j9) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.h = j6;
        this.i = j7;
        this.j = j8;
        this.k = i3;
        this.l = i4;
        this.m = i5;
        this.n = j9;
    }

    public final void a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        int i = this.a;
        printWriter.println(i);
        printWriter.print("  Cache Size: ");
        int i2 = this.b;
        printWriter.println(i2);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((i2 / i) * 100.0f));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public final String toString() {
        return "StatsSnapshot{maxSize=" + this.a + ", size=" + this.b + ", cacheHits=" + this.c + ", cacheMisses=" + this.d + ", downloadCount=" + this.k + ", totalDownloadSize=" + this.e + ", averageDownloadSize=" + this.h + ", totalOriginalBitmapSize=" + this.f + ", totalTransformedBitmapSize=" + this.g + ", averageOriginalBitmapSize=" + this.i + ", averageTransformedBitmapSize=" + this.j + ", originalBitmapCount=" + this.l + ", transformedBitmapCount=" + this.m + ", timeStamp=" + this.n + '}';
    }
}
