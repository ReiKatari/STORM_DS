package defpackage;

import android.os.Build;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i40  reason: default package */
/* loaded from: classes.dex */
public class i40 implements u54, lx3 {
    public boolean A;
    public Object B;

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i40(android.content.Context r5, defpackage.df0 r6) {
        /*
            r4 = this;
            r5.getClass()
            r4.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            r2 = 0
            r3 = 1
            if (r0 < r1) goto L16
            int r0 = defpackage.uh.a(r5)
            if (r0 == 0) goto L16
            r0 = r3
            goto L17
        L16:
            r0 = r2
        L17:
            r4.A = r0
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            if (r6 == 0) goto L24
            java.lang.Integer r6 = r6.b()
            goto L25
        L24:
            r6 = 0
        L25:
            java.lang.String r0 = "android.hardware.camera"
            boolean r0 = r5.hasSystemFeature(r0)
            java.lang.String r1 = "android.hardware.camera.front"
            boolean r5 = r5.hasSystemFeature(r1)
            if (r0 == 0) goto L3d
            if (r6 == 0) goto L3b
            int r0 = r6.intValue()
            if (r0 != r3) goto L3d
        L3b:
            r0 = r3
            goto L3e
        L3d:
            r0 = r2
        L3e:
            if (r5 == 0) goto L49
            if (r6 == 0) goto L48
            int r5 = r6.intValue()
            if (r5 != 0) goto L49
        L48:
            r2 = r3
        L49:
            tg0 r5 = new tg0
            r5.<init>(r0, r2)
            r4.B = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i40.<init>(android.content.Context, df0):void");
    }

    public static boolean b(Set set, df0 df0Var) {
        try {
            df0Var.c(new LinkedHashSet(set));
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // defpackage.lx3
    public boolean M(uw3 uw3Var) {
        ((uv6) this.B).p0.onMenuOpened(108, uw3Var);
        return true;
    }

    public boolean a() {
        return this.A;
    }

    public boolean c(LinkedHashSet linkedHashSet, Set set) {
        boolean z;
        boolean z2;
        tg0 tg0Var = (tg0) this.B;
        if (!this.A) {
            boolean z3 = tg0Var.a;
            boolean z4 = tg0Var.b;
            if (z3 || z4) {
                df0 df0Var = df0.c;
                df0Var.getClass();
                boolean b = b(linkedHashSet, df0Var);
                df0 df0Var2 = df0.b;
                df0Var2.getClass();
                boolean b2 = b(linkedHashSet, df0Var2);
                Set<pd0> set2 = set;
                ArrayList arrayList = new ArrayList(uq0.y0(set2, 10));
                for (pd0 pd0Var : set2) {
                    arrayList.add(pd0Var.a());
                }
                Set s1 = tq0.s1(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : linkedHashSet) {
                    if (!s1.contains(((vd0) obj).l().f())) {
                        arrayList2.add(obj);
                    }
                }
                Set s12 = tq0.s1(arrayList2);
                df0 df0Var3 = df0.c;
                df0Var3.getClass();
                boolean b3 = b(s12, df0Var3);
                df0 df0Var4 = df0.b;
                df0Var4.getClass();
                boolean b4 = b(s12, df0Var4);
                if (tg0Var.a && b && !b3) {
                    z = true;
                } else {
                    z = false;
                }
                if (z4 && b2 && !b4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z || z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean d(int i, CharSequence charSequence) {
        if (charSequence != null && i >= 0 && charSequence.length() - i >= 0) {
            if (((sn1) this.B) == null) {
                return a();
            }
            boolean z = true;
            for (int i2 = 0; i2 < i && z; i2++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i2));
                i40 i40Var = uo6.a;
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        switch (directionality) {
                            case 14:
                            case ig7.e /* 15 */:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                z = true;
                                break;
                        }
                    }
                    z = false;
                }
                z = true;
            }
            if (!z) {
                return true;
            }
            if (z) {
                return false;
            }
            return a();
        }
        c44.r();
        return false;
    }

    public void e() {
        this.A = false;
    }

    @Override // defpackage.lx3
    public void f(uw3 uw3Var, boolean z) {
        f8 f8Var;
        uv6 uv6Var = (uv6) this.B;
        if (this.A) {
            return;
        }
        this.A = true;
        ActionMenuView actionMenuView = uv6Var.o0.a.A;
        if (actionMenuView != null && (f8Var = actionMenuView.r0) != null) {
            f8Var.c();
            c8 c8Var = f8Var.o0;
            if (c8Var != null && c8Var.b()) {
                c8Var.i.dismiss();
            }
        }
        uv6Var.p0.onPanelClosed(108, uw3Var);
        this.A = false;
    }

    public void g(byte b) {
        ((b43) this.B).writeLong(b);
    }

    public void h(char c) {
        ((b43) this.B).c(c);
    }

    public void i(int i) {
        ((b43) this.B).writeLong(i);
    }

    public void j(long j) {
        ((b43) this.B).writeLong(j);
    }

    @Override // defpackage.u54
    public long j0(long j, long j2, int i) {
        if (this.A) {
            ax5 ax5Var = (ax5) this.B;
            if (!ax5Var.a.b()) {
                return ax5Var.h(ax5Var.d(ax5Var.a.d(ax5Var.d(ax5Var.g(j2)))));
            }
            return 0L;
        }
        return 0L;
    }

    public void k(short s) {
        ((b43) this.B).writeLong(s);
    }

    public void l(String str) {
        str.getClass();
        ((b43) this.B).e(str);
    }

    public void o(bf0 bf0Var) {
        tg0 tg0Var = (tg0) this.B;
        bf0Var.getClass();
        if (this.A) {
            ve2.v("CameraValidator", "Virtual device with " + bf0Var.c().size() + " cameras. Skipping validation.");
            return;
        }
        ve2.v("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE);
        if (tg0Var.a) {
            try {
                df0.c.c(bf0Var.c()).getClass();
            } catch (RuntimeException e) {
                e = e;
                ve2.d0("CameraValidator", "Camera LENS_FACING_BACK verification failed", e);
            }
        }
        e = null;
        if (tg0Var.b) {
            try {
                df0.b.c(bf0Var.c()).getClass();
            } catch (RuntimeException e2) {
                ve2.d0("CameraValidator", "Camera LENS_FACING_FRONT verification failed", e2);
                if (e == null) {
                    e = e2;
                }
            }
        }
        if (e == null) {
            return;
        }
        throw new sg0(bf0Var.c().size(), e);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    @Override // defpackage.u54
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o0(long r5, long r7, defpackage.j11 r9) {
        /*
            r4 = this;
            boolean r5 = r9 instanceof defpackage.mw5
            if (r5 == 0) goto L13
            r5 = r9
            mw5 r5 = (defpackage.mw5) r5
            int r6 = r5.Z
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r6 & r0
            if (r1 == 0) goto L13
            int r6 = r6 - r0
            r5.Z = r6
            goto L1a
        L13:
            mw5 r5 = new mw5
            k11 r9 = (defpackage.k11) r9
            r5.<init>(r4, r9)
        L1a:
            java.lang.Object r6 = r5.X
            p31 r9 = defpackage.p31.COROUTINE_SUSPENDED
            int r0 = r5.Z
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2b
            long r7 = r5.R
            defpackage.me2.a0(r6)
            goto L4f
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r4)
            r4 = 0
            return r4
        L32:
            defpackage.me2.a0(r6)
            boolean r6 = r4.A
            r2 = 0
            if (r6 == 0) goto L57
            java.lang.Object r4 = r4.B
            ax5 r4 = (defpackage.ax5) r4
            boolean r6 = r4.i
            if (r6 == 0) goto L44
            goto L53
        L44:
            r5.R = r7
            r5.Z = r1
            java.lang.Object r6 = r4.a(r7, r5)
            if (r6 != r9) goto L4f
            return r9
        L4f:
            p77 r6 = (defpackage.p77) r6
            long r2 = r6.a
        L53:
            long r2 = defpackage.p77.d(r7, r2)
        L57:
            p77 r4 = new p77
            r4.<init>(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i40.o0(long, long, j11):java.lang.Object");
    }

    public void m() {
    }

    public void n() {
    }

    public /* synthetic */ i40(Object obj, byte b) {
        this.B = obj;
    }

    public /* synthetic */ i40(boolean z, Object obj) {
        this.B = obj;
        this.A = z;
    }

    public i40(String str, boolean z) {
        this.A = z;
        this.B = str;
    }

    public /* synthetic */ i40(Object obj) {
        this.B = obj;
        this.A = true;
    }

    public i40(sn1 sn1Var, boolean z) {
        this(sn1Var, (byte) 0);
        this.A = z;
    }
}
