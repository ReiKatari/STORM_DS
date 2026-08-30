package defpackage;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: md2  reason: default package */
/* loaded from: classes.dex */
public final class md2 {
    public static final md2[] j = new md2[0];
    public cq0[] a;
    public long b;
    public long c;
    public m20[] d;
    public long[] e;
    public long[] f;
    public boolean g;
    public long h;
    public int i;

    public final List a() {
        cq0[] cq0VarArr;
        int i;
        long[] jArr = this.e;
        if (jArr != null && (cq0VarArr = this.a) != null && jArr.length != 0 && cq0VarArr.length != 0) {
            LinkedList linkedList = new LinkedList();
            long j2 = this.e[0];
            loop0: while (true) {
                for (int i2 = (int) j2; i2 >= 0; i2 = -1) {
                    cq0[] cq0VarArr2 = this.a;
                    if (i2 >= cq0VarArr2.length) {
                        break loop0;
                    } else if (!linkedList.contains(cq0VarArr2[i2])) {
                        linkedList.addLast(this.a[i2]);
                        if (this.d != null) {
                            i = 0;
                            while (true) {
                                m20[] m20VarArr = this.d;
                                if (i >= m20VarArr.length) {
                                    break;
                                } else if (m20VarArr[i].c == i2) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                        i = -1;
                        if (i != -1) {
                            break;
                        }
                    } else {
                        f81.j("folder uses the same coder more than once in coder chain");
                        return null;
                    }
                }
                j2 = this.d[i].b;
            }
            return linkedList;
        }
        return Collections.EMPTY_LIST;
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
            long r0 = r8.c
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L9
            goto L30
        L9:
            int r0 = (int) r0
            int r0 = r0 + (-1)
        Lc:
            if (r0 < 0) goto L30
            m20[] r1 = r8.d
            if (r1 == 0) goto L25
            r1 = 0
        L13:
            m20[] r4 = r8.d
            int r5 = r4.length
            if (r1 >= r5) goto L25
            r4 = r4[r1]
            long r4 = r4.c
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
            long[] r8 = r8.f
            r0 = r8[r0]
            return r0
        L2d:
            int r0 = r0 + (-1)
            goto Lc
        L30:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.md2.b():long");
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Folder with ");
        sb.append(this.a.length);
        sb.append(" coders, ");
        sb.append(this.b);
        sb.append(" input streams, ");
        sb.append(this.c);
        sb.append(" output streams, ");
        sb.append(this.d.length);
        sb.append(" bind pairs, ");
        sb.append(this.e.length);
        sb.append(" packed streams, ");
        sb.append(this.f.length);
        sb.append(" unpack sizes, ");
        if (this.g) {
            str = "with CRC " + this.h;
        } else {
            str = "without CRC";
        }
        sb.append(str);
        sb.append(" and ");
        return wh1.m(sb, this.i, " unpack streams");
    }
}
