package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cy0  reason: default package */
/* loaded from: classes.dex */
public final class cy0 {
    public int b;
    public boolean c;
    public final gz0 d;
    public final by0 e;
    public cy0 f;
    public ob6 i;
    public HashSet a = null;
    public int g = 0;
    public int h = Integer.MIN_VALUE;

    public cy0(gz0 gz0Var, by0 by0Var) {
        this.d = gz0Var;
        this.e = by0Var;
    }

    public final void a(cy0 cy0Var, int i) {
        b(cy0Var, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(cy0 cy0Var, int i, int i2, boolean z) {
        if (cy0Var == null) {
            j();
            return true;
        } else if (!z && !i(cy0Var)) {
            return false;
        } else {
            this.f = cy0Var;
            if (cy0Var.a == null) {
                cy0Var.a = new HashSet();
            }
            HashSet hashSet = this.f.a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.g = i;
            this.h = i2;
            return true;
        }
    }

    public final void c(int i, yd7 yd7Var, ArrayList arrayList) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                oo2.E(((cy0) it.next()).d, i, arrayList, yd7Var);
            }
        }
    }

    public final int d() {
        if (!this.c) {
            return 0;
        }
        return this.b;
    }

    public final int e() {
        cy0 cy0Var;
        if (this.d.h0 == 8) {
            return 0;
        }
        int i = this.h;
        if (i != Integer.MIN_VALUE && (cy0Var = this.f) != null && cy0Var.d.h0 == 8) {
            return i;
        }
        return this.g;
    }

    public final cy0 f() {
        by0 by0Var = this.e;
        int ordinal = by0Var.ordinal();
        gz0 gz0Var = this.d;
        switch (ordinal) {
            case 0:
            case 5:
            case ig7.b /* 6 */:
            case 7:
            case 8:
                return null;
            case 1:
                return gz0Var.K;
            case 2:
                return gz0Var.L;
            case 3:
                return gz0Var.I;
            case 4:
                return gz0Var.J;
            default:
                throw new AssertionError(by0Var.name());
        }
    }

    public final boolean g() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((cy0) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        if (this.f != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0072 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(defpackage.cy0 r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L5
            goto L74
        L5:
            gz0 r1 = r5.d
            by0 r5 = r5.e
            by0 r2 = r4.e
            r3 = 1
            if (r5 != r2) goto L1d
            by0 r5 = defpackage.by0.BASELINE
            if (r2 != r5) goto L72
            boolean r5 = r1.E
            if (r5 == 0) goto L74
            gz0 r4 = r4.d
            boolean r4 = r4.E
            if (r4 != 0) goto L72
            goto L74
        L1d:
            int r4 = r2.ordinal()
            switch(r4) {
                case 0: goto L74;
                case 1: goto L5c;
                case 2: goto L44;
                case 3: goto L5c;
                case 4: goto L44;
                case 5: goto L3b;
                case 6: goto L2e;
                case 7: goto L74;
                case 8: goto L74;
                default: goto L24;
            }
        L24:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.String r5 = r2.name()
            r4.<init>(r5)
            throw r4
        L2e:
            by0 r4 = defpackage.by0.BASELINE
            if (r5 == r4) goto L74
            by0 r4 = defpackage.by0.CENTER_X
            if (r5 == r4) goto L74
            by0 r4 = defpackage.by0.CENTER_Y
            if (r5 == r4) goto L74
            goto L72
        L3b:
            by0 r4 = defpackage.by0.LEFT
            if (r5 == r4) goto L74
            by0 r4 = defpackage.by0.RIGHT
            if (r5 != r4) goto L72
            goto L74
        L44:
            by0 r4 = defpackage.by0.TOP
            if (r5 == r4) goto L4f
            by0 r4 = defpackage.by0.BOTTOM
            if (r5 != r4) goto L4d
            goto L4f
        L4d:
            r4 = r0
            goto L50
        L4f:
            r4 = r3
        L50:
            boolean r1 = r1 instanceof defpackage.yo2
            if (r1 == 0) goto L5b
            if (r4 != 0) goto L72
            by0 r4 = defpackage.by0.CENTER_Y
            if (r5 != r4) goto L74
            goto L72
        L5b:
            return r4
        L5c:
            by0 r4 = defpackage.by0.LEFT
            if (r5 == r4) goto L67
            by0 r4 = defpackage.by0.RIGHT
            if (r5 != r4) goto L65
            goto L67
        L65:
            r4 = r0
            goto L68
        L67:
            r4 = r3
        L68:
            boolean r1 = r1 instanceof defpackage.yo2
            if (r1 == 0) goto L73
            if (r4 != 0) goto L72
            by0 r4 = defpackage.by0.CENTER_X
            if (r5 != r4) goto L74
        L72:
            return r3
        L73:
            return r4
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cy0.i(cy0):boolean");
    }

    public final void j() {
        HashSet hashSet;
        cy0 cy0Var = this.f;
        if (cy0Var != null && (hashSet = cy0Var.a) != null) {
            hashSet.remove(this);
            if (this.f.a.size() == 0) {
                this.f.a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void k() {
        ob6 ob6Var = this.i;
        if (ob6Var == null) {
            this.i = new ob6(nb6.UNRESTRICTED);
        } else {
            ob6Var.c();
        }
    }

    public final void l(int i) {
        this.b = i;
        this.c = true;
    }

    public final String toString() {
        return this.d.j0 + ":" + this.e.toString();
    }
}
