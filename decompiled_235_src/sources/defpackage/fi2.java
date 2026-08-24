package defpackage;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fi2  reason: default package */
/* loaded from: classes.dex */
public final class fi2 {
    public static final fi2[] j = new fi2[0];
    public ps0[] a;
    public long b;
    public long c;
    public h40[] d;
    public long[] e;
    public long[] f;
    public boolean g;
    public long h;
    public int i;

    public final List a() {
        ps0[] ps0VarArr;
        int i;
        long[] jArr = this.e;
        if (jArr != null && (ps0VarArr = this.a) != null && jArr.length != 0 && ps0VarArr.length != 0) {
            LinkedList linkedList = new LinkedList();
            long j2 = this.e[0];
            loop0: while (true) {
                for (int i2 = (int) j2; i2 >= 0; i2 = -1) {
                    ps0[] ps0VarArr2 = this.a;
                    if (i2 >= ps0VarArr2.length) {
                        break loop0;
                    } else if (!linkedList.contains(ps0VarArr2[i2])) {
                        linkedList.addLast(this.a[i2]);
                        if (this.d != null) {
                            i = 0;
                            while (true) {
                                h40[] h40VarArr = this.d;
                                if (i >= h40VarArr.length) {
                                    break;
                                } else if (h40VarArr[i].c == i2) {
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
                        e41.i("folder uses the same coder more than once in coder chain");
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
    */
    public final long b() {
        int i;
        long j2 = this.c;
        if (j2 != 0) {
            for (int i2 = ((int) j2) - 1; i2 >= 0; i2--) {
                if (this.d != null) {
                    i = 0;
                    while (true) {
                        h40[] h40VarArr = this.d;
                        if (i >= h40VarArr.length) {
                            break;
                        } else if (h40VarArr[i].c == i2) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i >= 0) {
                        return this.f[i2];
                    }
                }
                i = -1;
                if (i >= 0) {
                }
            }
        }
        return 0L;
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
        return lb1.o(sb, this.i, " unpack streams");
    }
}
