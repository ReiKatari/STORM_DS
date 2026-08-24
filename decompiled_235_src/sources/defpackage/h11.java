package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h11  reason: default package */
/* loaded from: classes.dex */
public final class h11 {
    public int b;
    public boolean c;
    public final l21 d;
    public final g11 e;
    public h11 f;
    public en6 i;
    public HashSet a = null;
    public int g = 0;
    public int h = Integer.MIN_VALUE;

    public h11(l21 l21Var, g11 g11Var) {
        this.d = l21Var;
        this.e = g11Var;
    }

    public final void a(h11 h11Var, int i) {
        b(h11Var, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(h11 h11Var, int i, int i2, boolean z) {
        if (h11Var == null) {
            j();
            return true;
        } else if (!z && !i(h11Var)) {
            return false;
        } else {
            this.f = h11Var;
            if (h11Var.a == null) {
                h11Var.a = new HashSet();
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

    public final void c(int i, zs7 zs7Var, ArrayList arrayList) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                kj2.x(((h11) it.next()).d, i, arrayList, zs7Var);
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
        h11 h11Var;
        if (this.d.h0 == 8) {
            return 0;
        }
        int i = this.h;
        if (i != Integer.MIN_VALUE && (h11Var = this.f) != null && h11Var.d.h0 == 8) {
            return i;
        }
        return this.g;
    }

    public final h11 f() {
        g11 g11Var = this.e;
        int ordinal = g11Var.ordinal();
        l21 l21Var = this.d;
        switch (ordinal) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return l21Var.K;
            case 2:
                return l21Var.L;
            case 3:
                return l21Var.I;
            case 4:
                return l21Var.J;
            default:
                throw new AssertionError(g11Var.name());
        }
    }

    public final boolean g() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((h11) it.next()).f().h()) {
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
    */
    public final boolean i(h11 h11Var) {
        boolean z;
        boolean z2;
        if (h11Var != null) {
            l21 l21Var = h11Var.d;
            g11 g11Var = h11Var.e;
            g11 g11Var2 = this.e;
            if (g11Var == g11Var2) {
                if (g11Var2 != g11.BASELINE || (l21Var.E && this.d.E)) {
                    return true;
                }
            } else {
                switch (g11Var2.ordinal()) {
                    case 0:
                    case 7:
                    case 8:
                        break;
                    case 1:
                    case 3:
                        if (g11Var != g11.LEFT && g11Var != g11.RIGHT) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (l21Var instanceof av2) {
                            if (z || g11Var == g11.CENTER_X) {
                            }
                        } else {
                            return z;
                        }
                        break;
                    case 2:
                    case 4:
                        if (g11Var != g11.TOP && g11Var != g11.BOTTOM) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (l21Var instanceof av2) {
                            if (z2 || g11Var == g11.CENTER_Y) {
                            }
                        } else {
                            return z2;
                        }
                        break;
                    case 5:
                        if (g11Var == g11.LEFT || g11Var == g11.RIGHT) {
                        }
                        break;
                    case 6:
                        if (g11Var == g11.BASELINE || g11Var == g11.CENTER_X || g11Var == g11.CENTER_Y) {
                        }
                        break;
                    default:
                        throw new AssertionError(g11Var2.name());
                }
            }
        }
        return false;
    }

    public final void j() {
        HashSet hashSet;
        h11 h11Var = this.f;
        if (h11Var != null && (hashSet = h11Var.a) != null) {
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
        en6 en6Var = this.i;
        if (en6Var == null) {
            this.i = new en6(dn6.UNRESTRICTED);
        } else {
            en6Var.c();
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
