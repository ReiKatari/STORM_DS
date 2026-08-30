package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m04  reason: default package */
/* loaded from: classes.dex */
public final class m04 implements tv3 {
    public final rb2 a;

    public m04(rb2 rb2Var) {
        this.a = rb2Var;
    }

    @Override // defpackage.tv3
    public final int a(s43 s43Var, List list, int i) {
        mv3 mv3Var;
        ArrayList z = cg2.z(s43Var);
        rb2 rb2Var = this.a;
        pb2 pb2Var = rb2Var.f;
        List list2 = (List) tq0.N0(1, z);
        mv3 mv3Var2 = null;
        if (list2 != null) {
            mv3Var = (mv3) tq0.M0(list2);
        } else {
            mv3Var = null;
        }
        List list3 = (List) tq0.N0(2, z);
        if (list3 != null) {
            mv3Var2 = (mv3) tq0.M0(list3);
        }
        pb2Var.b(mv3Var, mv3Var2, nz0.b(0, i, 0, 0, 13));
        List list4 = (List) tq0.M0(z);
        if (list4 == null) {
            list4 = pp1.A;
        }
        return rb2.a(list4, i, s43Var.Y(rb2Var.c), s43Var.Y(rb2Var.e), rb2Var.f);
    }

    @Override // defpackage.tv3
    public final int b(s43 s43Var, List list, int i) {
        mv3 mv3Var;
        ArrayList z = cg2.z(s43Var);
        rb2 rb2Var = this.a;
        pb2 pb2Var = rb2Var.f;
        List list2 = (List) tq0.N0(1, z);
        mv3 mv3Var2 = null;
        if (list2 != null) {
            mv3Var = (mv3) tq0.M0(list2);
        } else {
            mv3Var = null;
        }
        List list3 = (List) tq0.N0(2, z);
        if (list3 != null) {
            mv3Var2 = (mv3) tq0.M0(list3);
        }
        pb2Var.b(mv3Var, mv3Var2, nz0.b(0, 0, 0, i, 7));
        List list4 = (List) tq0.M0(z);
        if (list4 == null) {
            list4 = pp1.A;
        }
        int Y = s43Var.Y(rb2Var.c);
        int size = list4.size();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 < size) {
            int e0 = ((mv3) list4.get(i2)).e0(i) + Y;
            int i6 = i2 + 1;
            if (i6 - i4 != Integer.MAX_VALUE && i6 != list4.size()) {
                i5 += e0;
            } else {
                i3 = Math.max(i3, (i5 + e0) - Y);
                i4 = i2;
                i5 = 0;
            }
            i2 = i6;
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m04) && b53.x(this.a, ((m04) obj).a)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x036b A[LOOP:1: B:104:0x0369->B:105:0x036b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0214 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0320  */
    @Override // defpackage.tv3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.uv3 f(defpackage.vv3 r61, java.util.List r62, long r63) {
        /*
            Method dump skipped, instructions count: 1079
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m04.f(vv3, java.util.List, long):uv3");
    }

    @Override // defpackage.tv3
    public final int g(s43 s43Var, List list, int i) {
        mv3 mv3Var;
        ArrayList z = cg2.z(s43Var);
        rb2 rb2Var = this.a;
        pb2 pb2Var = rb2Var.f;
        List list2 = (List) tq0.N0(1, z);
        mv3 mv3Var2 = null;
        if (list2 != null) {
            mv3Var = (mv3) tq0.M0(list2);
        } else {
            mv3Var = null;
        }
        List list3 = (List) tq0.N0(2, z);
        if (list3 != null) {
            mv3Var2 = (mv3) tq0.M0(list3);
        }
        pb2Var.b(mv3Var, mv3Var2, nz0.b(0, i, 0, 0, 13));
        List list4 = (List) tq0.M0(z);
        if (list4 == null) {
            list4 = pp1.A;
        }
        return rb2.a(list4, i, s43Var.Y(rb2Var.c), s43Var.Y(rb2Var.e), rb2Var.f);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a2, code lost:
        if (r13.a == defpackage.lb2.ExpandOrCollapseIndicator) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0262 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x024d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4 A[LOOP:1: B:33:0x00b2->B:34:0x00b4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    @Override // defpackage.tv3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(defpackage.s43 r35, java.util.List r36, int r37) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m04.i(s43, java.util.List, int):int");
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.a + ')';
    }
}
