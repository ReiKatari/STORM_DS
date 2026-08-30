package com.squareup.picasso;

import java.io.PrintWriter;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f3231a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3232b;

    /* renamed from: c  reason: collision with root package name */
    public final long f3233c;

    /* renamed from: d  reason: collision with root package name */
    public final long f3234d;

    /* renamed from: e  reason: collision with root package name */
    public final long f3235e;

    /* renamed from: f  reason: collision with root package name */
    public final long f3236f;

    /* renamed from: g  reason: collision with root package name */
    public final long f3237g;

    /* renamed from: h  reason: collision with root package name */
    public final long f3238h;

    /* renamed from: i  reason: collision with root package name */
    public final long f3239i;

    /* renamed from: j  reason: collision with root package name */
    public final long f3240j;

    /* renamed from: k  reason: collision with root package name */
    public final int f3241k;

    /* renamed from: l  reason: collision with root package name */
    public final int f3242l;
    public final int m;

    /* renamed from: n  reason: collision with root package name */
    public final long f3243n;

    public h0(int i2, int i10, long j2, long j10, long j11, long j12, long j13, long j14, long j15, long j16, int i11, int i12, int i13, long j17) {
        this.f3231a = i2;
        this.f3232b = i10;
        this.f3233c = j2;
        this.f3234d = j10;
        this.f3235e = j11;
        this.f3236f = j12;
        this.f3237g = j13;
        this.f3238h = j14;
        this.f3239i = j15;
        this.f3240j = j16;
        this.f3241k = i11;
        this.f3242l = i12;
        this.m = i13;
        this.f3243n = j17;
    }

    public final void a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        int i2 = this.f3231a;
        printWriter.println(i2);
        printWriter.print("  Cache Size: ");
        int i10 = this.f3232b;
        printWriter.println(i10);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((i10 / i2) * 100.0f));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f3233c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f3234d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f3241k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f3235e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f3238h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f3242l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f3236f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f3237g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f3239i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f3240j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public final String toString() {
        return "StatsSnapshot{maxSize=" + this.f3231a + ", size=" + this.f3232b + ", cacheHits=" + this.f3233c + ", cacheMisses=" + this.f3234d + ", downloadCount=" + this.f3241k + ", totalDownloadSize=" + this.f3235e + ", averageDownloadSize=" + this.f3238h + ", totalOriginalBitmapSize=" + this.f3236f + ", totalTransformedBitmapSize=" + this.f3237g + ", averageOriginalBitmapSize=" + this.f3239i + ", averageTransformedBitmapSize=" + this.f3240j + ", originalBitmapCount=" + this.f3242l + ", transformedBitmapCount=" + this.m + ", timeStamp=" + this.f3243n + '}';
    }
}
