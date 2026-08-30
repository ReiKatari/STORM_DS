package defpackage;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsetsAnimation;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wv6  reason: default package */
/* loaded from: classes.dex */
public final class wv6 implements bc4, ey5 {
    public final /* synthetic */ int A;
    public Object B;
    public Object L;

    public wv6(int i) {
        this.A = i;
        switch (i) {
            case 1:
                this.B = new jo1(24);
                this.L = new us3(16);
                return;
            case 4:
                this.B = new m66(0);
                this.L = new cs3((Object) null);
                return;
            case ig7.b /* 6 */:
                this.B = new o24(new Reference[16]);
                this.L = new ReferenceQueue();
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a2  */
    @Override // defpackage.bc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.vf7 G(android.view.View r18, defpackage.vf7 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.Object r3 = r0.B
            i40 r3 = (defpackage.i40) r3
            java.lang.Object r0 = r0.L
            bc7 r0 = (defpackage.bc7) r0
            int r4 = r0.a
            int r5 = r0.b
            int r0 = r0.c
            rf7 r6 = r2.a
            r7 = 519(0x207, float:7.27E-43)
            x13 r7 = r6.h(r7)
            r8 = 32
            x13 r6 = r6.h(r8)
            java.lang.Object r8 = r3.B
            com.google.android.material.bottomsheet.BottomSheetBehavior r8 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r8
            int r9 = r7.b
            int r10 = r7.c
            int r11 = r7.a
            r8.w = r9
            int r9 = r1.getLayoutDirection()
            r13 = 1
            if (r9 != r13) goto L37
            r9 = r13
            goto L38
        L37:
            r9 = 0
        L38:
            int r14 = r1.getPaddingBottom()
            int r15 = r1.getPaddingLeft()
            int r16 = r1.getPaddingRight()
            boolean r12 = r8.o
            if (r12 == 0) goto L4f
            int r14 = r2.a()
            r8.v = r14
            int r14 = r14 + r0
        L4f:
            boolean r0 = r8.p
            if (r0 == 0) goto L5a
            if (r9 == 0) goto L57
            r0 = r5
            goto L58
        L57:
            r0 = r4
        L58:
            int r15 = r0 + r11
        L5a:
            boolean r0 = r8.q
            if (r0 == 0) goto L64
            if (r9 == 0) goto L61
            goto L62
        L61:
            r4 = r5
        L62:
            int r16 = r4 + r10
        L64:
            r0 = r16
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            boolean r5 = r8.s
            if (r5 == 0) goto L78
            int r5 = r4.leftMargin
            if (r5 == r11) goto L78
            r4.leftMargin = r11
            r5 = r13
            goto L79
        L78:
            r5 = 0
        L79:
            boolean r9 = r8.t
            if (r9 == 0) goto L84
            int r9 = r4.rightMargin
            if (r9 == r10) goto L84
            r4.rightMargin = r10
            r5 = r13
        L84:
            boolean r9 = r8.u
            if (r9 == 0) goto L91
            int r9 = r4.topMargin
            int r7 = r7.b
            if (r9 == r7) goto L91
            r4.topMargin = r7
            goto L92
        L91:
            r13 = r5
        L92:
            if (r13 == 0) goto L97
            r1.setLayoutParams(r4)
        L97:
            int r4 = r1.getPaddingTop()
            r1.setPadding(r15, r4, r0, r14)
            boolean r0 = r3.A
            if (r0 == 0) goto La6
            int r1 = r6.d
            r8.m = r1
        La6:
            if (r12 != 0) goto Lac
            if (r0 == 0) goto Lab
            goto Lac
        Lab:
            return r2
        Lac:
            r8.I()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wv6.G(android.view.View, vf7):vf7");
    }

    @Override // defpackage.ey5
    public int a(int i) {
        do {
            i = ((xz1) this.L).j(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.B).charAt(i)));
        return i;
    }

    @Override // defpackage.ey5
    public int b(int i) {
        do {
            i = ((xz1) this.L).i(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.B).charAt(i - 1)));
        return i;
    }

    @Override // defpackage.ey5
    public int c(int i) {
        CharSequence charSequence = (CharSequence) this.B;
        do {
            i = ((xz1) this.L).i(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // defpackage.ey5
    public int d(int i) {
        do {
            i = ((xz1) this.L).j(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.B).charAt(i - 1)));
        return i;
    }

    public void e(g75 g75Var, hj7 hj7Var) {
        m66 m66Var = (m66) this.B;
        la7 la7Var = (la7) m66Var.get(g75Var);
        if (la7Var == null) {
            la7Var = la7.a();
            m66Var.put(g75Var, la7Var);
        }
        la7Var.c = hj7Var;
        la7Var.a |= 8;
    }

    public View f(int i, int i2, int i3, int i4) {
        int i5;
        View u;
        m97 m97Var = (m97) this.L;
        o65 o65Var = (o65) this.B;
        int d = o65Var.d();
        int c = o65Var.c();
        if (i2 > i) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        View view = null;
        while (i != i2) {
            switch (o65Var.a) {
                case 0:
                    u = o65Var.b.u(i);
                    break;
                default:
                    u = o65Var.b.u(i);
                    break;
            }
            int b = o65Var.b(u);
            int a = o65Var.a(u);
            m97Var.b = d;
            m97Var.c = c;
            m97Var.d = b;
            m97Var.e = a;
            if (i3 != 0) {
                m97Var.a = i3;
                if (m97Var.a()) {
                    return u;
                }
            }
            if (i4 != 0) {
                m97Var.a = i4;
                if (m97Var.a()) {
                    view = u;
                }
            }
            i += i5;
        }
        return view;
    }

    public boolean g(View view) {
        m97 m97Var = (m97) this.L;
        o65 o65Var = (o65) this.B;
        int d = o65Var.d();
        int c = o65Var.c();
        int b = o65Var.b(view);
        int a = o65Var.a(view);
        m97Var.b = d;
        m97Var.c = c;
        m97Var.d = b;
        m97Var.e = a;
        m97Var.a = 24579;
        return m97Var.a();
    }

    public hj7 h(g75 g75Var, int i) {
        la7 la7Var;
        hj7 hj7Var;
        m66 m66Var = (m66) this.B;
        int d = m66Var.d(g75Var);
        if (d >= 0 && (la7Var = (la7) m66Var.i(d)) != null) {
            int i2 = la7Var.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                la7Var.a = i3;
                if (i == 4) {
                    hj7Var = la7Var.b;
                } else if (i == 8) {
                    hj7Var = la7Var.c;
                } else {
                    i.i("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    m66Var.g(d);
                    la7Var.a = 0;
                    la7Var.b = null;
                    la7Var.c = null;
                    la7.d.c(la7Var);
                }
                return hj7Var;
            }
        }
        return null;
    }

    public void i(g75 g75Var) {
        la7 la7Var = (la7) ((m66) this.B).get(g75Var);
        if (la7Var == null) {
            return;
        }
        la7Var.a &= -2;
    }

    public void j(g75 g75Var) {
        cs3 cs3Var = (cs3) this.L;
        int j = cs3Var.j() - 1;
        while (true) {
            if (j < 0) {
                break;
            } else if (g75Var == cs3Var.k(j)) {
                Object[] objArr = cs3Var.L;
                Object obj = objArr[j];
                Object obj2 = l07.h;
                if (obj != obj2) {
                    objArr[j] = obj2;
                    cs3Var.A = true;
                }
            } else {
                j--;
            }
        }
        la7 la7Var = (la7) ((m66) this.B).remove(g75Var);
        if (la7Var != null) {
            la7Var.a = 0;
            la7Var.b = null;
            la7Var.c = null;
            la7.d.c(la7Var);
        }
    }

    public void k(td6 td6Var, so1 so1Var) {
        td6Var.getClass();
        ((nh7) this.L).a.execute(new u(this, td6Var, so1Var, 19));
    }

    public void l(td6 td6Var, int i) {
        td6Var.getClass();
        ((nh7) this.L).a.execute(new lf6((ku4) this.B, td6Var, false, i));
    }

    public String toString() {
        switch (this.A) {
            case 7:
                return "Bounds{lower=" + ((x13) this.B) + " upper=" + ((x13) this.L) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ wv6(int i, Object obj, Object obj2) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
    }

    public wv6(ku4 ku4Var, nh7 nh7Var) {
        this.A = 9;
        ku4Var.getClass();
        nh7Var.getClass();
        this.B = ku4Var;
        this.L = nh7Var;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, m97] */
    public wv6(o65 o65Var) {
        this.A = 3;
        this.B = o65Var;
        ?? obj = new Object();
        obj.a = 0;
        this.L = obj;
    }

    public wv6(WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        this.A = 7;
        lowerBound = bounds.getLowerBound();
        this.B = x13.d(lowerBound);
        upperBound = bounds.getUpperBound();
        this.L = x13.d(upperBound);
    }
}
