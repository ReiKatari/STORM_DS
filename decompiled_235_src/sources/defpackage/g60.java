package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g60  reason: default package */
/* loaded from: classes.dex */
public class g60 implements ae4, a54 {
    public boolean A;
    public Object B;

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g60(Context context, mh0 mh0Var) {
        boolean z;
        Integer num;
        boolean hasSystemFeature;
        boolean hasSystemFeature2;
        boolean z2;
        int deviceId;
        context.getClass();
        boolean z3 = false;
        if (Build.VERSION.SDK_INT >= 34) {
            deviceId = context.getDeviceId();
            if (deviceId != 0) {
                z = true;
                this.A = z;
                PackageManager packageManager = context.getPackageManager();
                if (mh0Var == null) {
                    num = mh0Var.b();
                } else {
                    num = null;
                }
                hasSystemFeature = packageManager.hasSystemFeature("android.hardware.camera");
                hasSystemFeature2 = packageManager.hasSystemFeature("android.hardware.camera.front");
                if (!hasSystemFeature && (num == null || num.intValue() == 1)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (hasSystemFeature2 && (num == null || num.intValue() == 0)) {
                    z3 = true;
                }
                this.B = new cj0(z2, z3);
            }
        }
        z = false;
        this.A = z;
        PackageManager packageManager2 = context.getPackageManager();
        if (mh0Var == null) {
        }
        hasSystemFeature = packageManager2.hasSystemFeature("android.hardware.camera");
        hasSystemFeature2 = packageManager2.hasSystemFeature("android.hardware.camera.front");
        if (!hasSystemFeature) {
        }
        z2 = false;
        if (hasSystemFeature2) {
            z3 = true;
        }
        this.B = new cj0(z2, z3);
    }

    public static boolean b(Set set, mh0 mh0Var) {
        try {
            mh0Var.c(new LinkedHashSet(set));
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // defpackage.a54
    public boolean M(i44 i44Var) {
        ((i87) this.B).m.onMenuOpened(108, i44Var);
        return true;
    }

    public boolean a() {
        return this.A;
    }

    public boolean c(LinkedHashSet linkedHashSet, Set set) {
        boolean z;
        boolean z2;
        cj0 cj0Var = (cj0) this.B;
        if (!this.A) {
            boolean z3 = cj0Var.a;
            boolean z4 = cj0Var.b;
            if (z3 || z4) {
                mh0 mh0Var = mh0.c;
                mh0Var.getClass();
                boolean b = b(linkedHashSet, mh0Var);
                mh0 mh0Var2 = mh0.b;
                mh0Var2.getClass();
                boolean b2 = b(linkedHashSet, mh0Var2);
                Set<yf0> set2 = set;
                ArrayList arrayList = new ArrayList(ht0.v0(set2, 10));
                for (yf0 yf0Var : set2) {
                    arrayList.add(yf0Var.a());
                }
                Set p1 = gt0.p1(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : linkedHashSet) {
                    if (!p1.contains(((eg0) obj).q().d())) {
                        arrayList2.add(obj);
                    }
                }
                Set p12 = gt0.p1(arrayList2);
                mh0 mh0Var3 = mh0.c;
                mh0Var3.getClass();
                boolean b3 = b(p12, mh0Var3);
                mh0 mh0Var4 = mh0.b;
                mh0Var4.getClass();
                boolean b4 = b(p12, mh0Var4);
                if (cj0Var.a && b && !b3) {
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

    @Override // defpackage.a54
    public void d(i44 i44Var, boolean z) {
        g8 g8Var;
        i87 i87Var = (i87) this.B;
        if (this.A) {
            return;
        }
        this.A = true;
        ActionMenuView actionMenuView = i87Var.l.a.A;
        if (actionMenuView != null && (g8Var = actionMenuView.s0) != null) {
            g8Var.e();
            d8 d8Var = g8Var.p0;
            if (d8Var != null && d8Var.b()) {
                d8Var.i.dismiss();
            }
        }
        i87Var.m.onPanelClosed(108, i44Var);
        this.A = false;
    }

    public boolean e(int i, CharSequence charSequence) {
        if (charSequence != null && i >= 0 && charSequence.length() - i >= 0) {
            if (((xd5) this.B) == null) {
                return a();
            }
            boolean z = true;
            for (int i2 = 0; i2 < i && z; i2++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i2));
                g60 g60Var = f17.a;
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        switch (directionality) {
                            case 14:
                            case 15:
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
        u34.t();
        return false;
    }

    public void f() {
        this.A = false;
    }

    public void g(byte b) {
        ((ja3) this.B).writeLong(b);
    }

    public void h(char c) {
        ((ja3) this.B).d(c);
    }

    public void i(int i) {
        ((ja3) this.B).writeLong(i);
    }

    public void j(long j) {
        ((ja3) this.B).writeLong(j);
    }

    public void k(short s) {
        ((ja3) this.B).writeLong(s);
    }

    public void l(String str) {
        str.getClass();
        ((ja3) this.B).e(str);
    }

    public void o(kh0 kh0Var) {
        cj0 cj0Var = (cj0) this.B;
        kh0Var.getClass();
        if (this.A) {
            kj2.t("CameraValidator", "Virtual device with " + kh0Var.c().size() + " cameras. Skipping validation.");
            return;
        }
        kj2.t("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE);
        if (cj0Var.a) {
            try {
                mh0.c.c(kh0Var.c()).getClass();
            } catch (RuntimeException e) {
                e = e;
                kj2.g0("CameraValidator", "Camera LENS_FACING_BACK verification failed", e);
            }
        }
        e = null;
        if (cj0Var.b) {
            try {
                mh0.b.c(kh0Var.c()).getClass();
            } catch (RuntimeException e2) {
                kj2.g0("CameraValidator", "Camera LENS_FACING_FRONT verification failed", e2);
                if (e == null) {
                    e = e2;
                }
            }
        }
        if (e == null) {
            return;
        }
        throw new bj0(kh0Var.c().size(), e);
    }

    @Override // defpackage.ae4
    public long w0(long j, long j2, int i) {
        if (this.A) {
            m86 m86Var = (m86) this.B;
            if (!m86Var.a.a()) {
                return m86Var.h(m86Var.d(m86Var.a.e(m86Var.d(m86Var.g(j2)))));
            }
            return 0L;
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    @Override // defpackage.ae4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object z0(long j, long j2, r41 r41Var) {
        z76 z76Var;
        int i;
        long j3;
        if (r41Var instanceof z76) {
            z76Var = (z76) r41Var;
            int i2 = z76Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z76Var.Z = i2 - Integer.MIN_VALUE;
                Object obj = z76Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = z76Var.Z;
                if (i == 0) {
                    if (i == 1) {
                        j2 = z76Var.R;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    j3 = 0;
                    if (this.A) {
                        m86 m86Var = (m86) this.B;
                        if (!m86Var.i) {
                            z76Var.R = j2;
                            z76Var.Z = 1;
                            obj = m86Var.a(j2, z76Var);
                            if (obj == x61Var) {
                                return x61Var;
                            }
                        }
                        j3 = ol7.d(j2, j3);
                    }
                    return new ol7(j3);
                }
                j3 = ((ol7) obj).a;
                j3 = ol7.d(j2, j3);
                return new ol7(j3);
            }
        }
        z76Var = new z76(this, (s41) r41Var);
        Object obj2 = z76Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = z76Var.Z;
        if (i == 0) {
        }
        j3 = ((ol7) obj2).a;
        j3 = ol7.d(j2, j3);
        return new ol7(j3);
    }

    public void m() {
    }

    public void n() {
    }

    public /* synthetic */ g60(Object obj, byte b) {
        this.B = obj;
    }

    public /* synthetic */ g60(boolean z, Object obj) {
        this.B = obj;
        this.A = z;
    }

    public g60(String str, boolean z) {
        this.A = z;
        this.B = str;
    }

    public /* synthetic */ g60(Object obj) {
        this.B = obj;
        this.A = true;
    }

    public g60(xd5 xd5Var, boolean z) {
        this(xd5Var, (byte) 0);
        this.A = z;
    }
}
