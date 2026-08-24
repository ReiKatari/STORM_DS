package defpackage;

import java.util.BitSet;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qd6  reason: default package */
/* loaded from: classes.dex */
public final class qd6 {
    public int a;
    public long b;
    public long c;
    public long d;
    public long e;
    public int f;
    public BitSet g;
    public int h;
    public int i;

    public final void a(int i) {
        int i2 = this.i;
        if (i2 > 0 && this.f == 0) {
            e41.i("archive with entries but no folders");
        } else if (i2 <= this.e) {
            long b = b() / 1024;
            if (i >= b) {
                return;
            }
            throw new gb2(i, b);
        } else {
            e41.i("archive doesn't contain enough substreams for entries");
        }
    }

    public final long b() {
        int i = this.a;
        int i2 = this.f;
        long j = (this.b * 22) + (i2 * 30) + (i * 16) + (i / 8);
        long j2 = this.c;
        long j3 = ((j2 - i2) * 16) + j;
        long j4 = (j2 * 8) + (((this.d - j2) + i2) * 8) + j3;
        int i3 = this.h;
        return ((i3 * 100) + j4 + (i3 * 4) + (i * 8) + (i2 * 8)) * 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Archive with ");
        sb.append(this.h);
        sb.append(" entries in ");
        sb.append(this.f);
        sb.append(" folders. Estimated size ");
        return lb1.p(sb, b() / 1024, " kB.");
    }
}
