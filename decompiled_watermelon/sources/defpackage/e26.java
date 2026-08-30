package defpackage;

import java.util.BitSet;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e26  reason: default package */
/* loaded from: classes.dex */
public final class e26 {
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
            f81.j("archive with entries but no folders");
        } else if (i2 <= this.e) {
            long b = b() / 1024;
            if (i >= b) {
                return;
            }
            throw new m62(i, b);
        } else {
            f81.j("archive doesn't contain enough substreams for entries");
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
        return wh1.n(sb, b() / 1024, " kB.");
    }
}
