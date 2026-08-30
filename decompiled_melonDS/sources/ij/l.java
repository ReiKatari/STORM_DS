package ij;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: j  reason: collision with root package name */
    public static final l[] f7097j = new l[0];

    /* renamed from: a  reason: collision with root package name */
    public f[] f7098a;

    /* renamed from: b  reason: collision with root package name */
    public long f7099b;

    /* renamed from: c  reason: collision with root package name */
    public long f7100c;

    /* renamed from: d  reason: collision with root package name */
    public gj.f[] f7101d;

    /* renamed from: e  reason: collision with root package name */
    public long[] f7102e;

    /* renamed from: f  reason: collision with root package name */
    public long[] f7103f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f7104g;

    /* renamed from: h  reason: collision with root package name */
    public long f7105h;

    /* renamed from: i  reason: collision with root package name */
    public int f7106i;

    public final List a() {
        f[] fVarArr;
        int i2;
        long[] jArr = this.f7102e;
        if (jArr != null && (fVarArr = this.f7098a) != null && jArr.length != 0 && fVarArr.length != 0) {
            LinkedList linkedList = new LinkedList();
            long j2 = this.f7102e[0];
            while (true) {
                for (int i10 = (int) j2; i10 >= 0; i10 = -1) {
                    f[] fVarArr2 = this.f7098a;
                    if (i10 < fVarArr2.length) {
                        if (!linkedList.contains(fVarArr2[i10])) {
                            linkedList.addLast(this.f7098a[i10]);
                            if (this.f7101d != null) {
                                i2 = 0;
                                while (true) {
                                    gj.f[] fVarArr3 = this.f7101d;
                                    if (i2 >= fVarArr3.length) {
                                        break;
                                    } else if (fVarArr3[i2].f5691c == i10) {
                                        break;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                            i2 = -1;
                            if (i2 != -1) {
                                break;
                            }
                        } else {
                            fj.j.h("folder uses the same coder more than once in coder chain");
                            return null;
                        }
                    } else {
                        return linkedList;
                    }
                }
                return linkedList;
                j2 = this.f7101d[i2].f5690b;
            }
        } else {
            return Collections.EMPTY_LIST;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002d A[LOOP:0: B:6:0x000c->B:20:0x002d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b() {
        /*
            r8 = this;
            long r0 = r8.f7100c
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L9
            goto L30
        L9:
            int r0 = (int) r0
            int r0 = r0 + (-1)
        Lc:
            if (r0 < 0) goto L30
            gj.f[] r1 = r8.f7101d
            if (r1 == 0) goto L25
            r1 = 0
        L13:
            gj.f[] r4 = r8.f7101d
            int r5 = r4.length
            if (r1 >= r5) goto L25
            r4 = r4[r1]
            long r4 = r4.f5691c
            long r6 = (long) r0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L22
            goto L26
        L22:
            int r1 = r1 + 1
            goto L13
        L25:
            r1 = -1
        L26:
            if (r1 >= 0) goto L2d
            long[] r1 = r8.f7103f
            r0 = r1[r0]
            return r0
        L2d:
            int r0 = r0 + (-1)
            goto Lc
        L30:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ij.l.b():long");
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Folder with ");
        sb2.append(this.f7098a.length);
        sb2.append(" coders, ");
        sb2.append(this.f7099b);
        sb2.append(" input streams, ");
        sb2.append(this.f7100c);
        sb2.append(" output streams, ");
        sb2.append(this.f7101d.length);
        sb2.append(" bind pairs, ");
        sb2.append(this.f7102e.length);
        sb2.append(" packed streams, ");
        sb2.append(this.f7103f.length);
        sb2.append(" unpack sizes, ");
        if (this.f7104g) {
            str = "with CRC " + this.f7105h;
        } else {
            str = "without CRC";
        }
        sb2.append(str);
        sb2.append(" and ");
        return w.d.q(sb2, this.f7106i, " unpack streams");
    }
}
