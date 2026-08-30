package ij;

import java.util.BitSet;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public int f7124a;

    /* renamed from: b  reason: collision with root package name */
    public long f7125b;

    /* renamed from: c  reason: collision with root package name */
    public long f7126c;

    /* renamed from: d  reason: collision with root package name */
    public long f7127d;

    /* renamed from: e  reason: collision with root package name */
    public long f7128e;

    /* renamed from: f  reason: collision with root package name */
    public int f7129f;

    /* renamed from: g  reason: collision with root package name */
    public BitSet f7130g;

    /* renamed from: h  reason: collision with root package name */
    public int f7131h;

    /* renamed from: i  reason: collision with root package name */
    public int f7132i;

    public final void a(int i2) {
        int i10 = this.f7132i;
        if (i10 > 0 && this.f7129f == 0) {
            fj.j.h("archive with entries but no folders");
        } else if (i10 <= this.f7128e) {
            long b10 = b() / 1024;
            if (i2 >= b10) {
                return;
            }
            throw new hj.a(i2, b10);
        } else {
            fj.j.h("archive doesn't contain enough substreams for entries");
        }
    }

    public final long b() {
        int i2 = this.f7124a;
        int i10 = this.f7129f;
        long j2 = (this.f7125b * 22) + (i10 * 30) + (i2 * 16) + (i2 / 8);
        long j10 = this.f7126c;
        long j11 = ((j10 - i10) * 16) + j2;
        long j12 = (j10 * 8) + (((this.f7127d - j10) + i10) * 8) + j11;
        int i11 = this.f7131h;
        return ((i11 * 100) + j12 + (i11 * 4) + (i2 * 8) + (i10 * 8)) * 2;
    }

    public final String toString() {
        return "Archive with " + this.f7131h + " entries in " + this.f7129f + " folders. Estimated size " + (b() / 1024) + " kB.";
    }
}
