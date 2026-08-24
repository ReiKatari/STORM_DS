package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pn  reason: default package */
/* loaded from: classes.dex */
public final class pn extends aj3 implements eo2 {
    public final /* synthetic */ int B;
    public static final pn L = new pn(2, 0);
    public static final pn R = new pn(2, 1);
    public static final pn X = new pn(2, 2);
    public static final pn Y = new pn(2, 3);
    public static final pn Z = new pn(2, 4);
    public static final pn d0 = new pn(2, 5);
    public static final pn e0 = new pn(2, 6);
    public static final pn f0 = new pn(2, 7);
    public static final pn g0 = new pn(2, 8);
    public static final pn h0 = new pn(2, 9);
    public static final pn i0 = new pn(2, 10);
    public static final pn j0 = new pn(2, 11);
    public static final pn k0 = new pn(2, 12);
    public static final pn l0 = new pn(2, 13);
    public static final pn m0 = new pn(2, 14);
    public static final pn n0 = new pn(2, 15);
    public static final pn o0 = new pn(2, 16);
    public static final pn p0 = new pn(2, 17);
    public static final pn q0 = new pn(2, 18);
    public static final pn r0 = new pn(2, 19);
    public static final pn s0 = new pn(2, 20);
    public static final pn t0 = new pn(2, 21);
    public static final pn u0 = new pn(2, 22);
    public static final pn v0 = new pn(2, 23);
    public static final pn w0 = new pn(2, 24);
    public static final pn x0 = new pn(2, 25);
    public static final pn y0 = new pn(2, 26);
    public static final pn z0 = new pn(2, 27);
    public static final pn A0 = new pn(2, 28);
    public static final pn B0 = new pn(2, 29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pn(int i, int i2) {
        super(i);
        this.B = i2;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.B;
        boolean z = false;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                long j = ((q93) obj).a;
                long j2 = ((q93) obj2).a;
                of5 of5Var = vq7.a;
                return ge7.U(RecyclerView.B1, 400.0f, new q93(4294967297L), 1);
            case 1:
                z42 z42Var = (z42) obj2;
                if (((z42) obj) == z42Var && z42Var == z42.PostExit) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                String str = (String) obj;
                y64 y64Var = (y64) obj2;
                if (str.length() == 0) {
                    return y64Var.toString();
                }
                return str + ", " + y64Var;
            case 3:
                px0 px0Var = (px0) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (!xq2Var.S(intValue & 1, z)) {
                    xq2Var.V();
                }
                return jg7Var;
            case 4:
                px0 px0Var2 = (px0) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (!xq2Var2.S(intValue2 & 1, z)) {
                    xq2Var2.V();
                }
                return jg7Var;
            case 5:
                px0 px0Var3 = (px0) obj;
                int intValue3 = ((Number) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z = true;
                }
                xq2 xq2Var3 = (xq2) px0Var3;
                if (!xq2Var3.S(intValue3 & 1, z)) {
                    xq2Var3.V();
                }
                return jg7Var;
            case 6:
                px0 px0Var4 = (px0) obj;
                int intValue4 = ((Number) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z = true;
                }
                xq2 xq2Var4 = (xq2) px0Var4;
                if (!xq2Var4.S(intValue4 & 1, z)) {
                    xq2Var4.V();
                }
                return jg7Var;
            case 7:
                ((Number) obj2).intValue();
                ((sm3) ((jx0) obj)).getClass();
                return jg7Var;
            case 8:
                ((sm3) ((jx0) obj)).c0((e34) obj2);
                return jg7Var;
            case 9:
                ((sm3) ((jx0) obj)).d0((a74) obj2);
                return jg7Var;
            case 10:
                hy0 hy0Var = (hy0) obj2;
                sm3 sm3Var = (sm3) ((jx0) obj);
                sm3Var.x0 = hy0Var;
                if0 if0Var = sm3Var.B0;
                nq6 nq6Var = ky0.h;
                xv4 xv4Var = (xv4) hy0Var;
                xv4Var.getClass();
                sm3Var.Z((qh1) q60.U(xv4Var, nq6Var));
                xv4 xv4Var2 = (xv4) hy0Var;
                kk3 kk3Var = (kk3) q60.U(xv4Var2, ky0.n);
                if (sm3Var.v0 != kk3Var) {
                    sm3Var.v0 = kk3Var;
                    sm3Var.E();
                    sm3 v = sm3Var.v();
                    if (v != null) {
                        v.C();
                    } else {
                        zp4 zp4Var = sm3Var.k0;
                        if (zp4Var != null) {
                            ((te) zp4Var).invalidate();
                        }
                    }
                    sm3Var.D();
                    for (z64 z64Var = (z64) if0Var.g; z64Var != null; z64Var = z64Var.Y) {
                        z64Var.S();
                    }
                }
                sm3Var.e0((fo7) q60.U(xv4Var2, ky0.t));
                z64 z64Var2 = (z64) if0Var.g;
                if ((z64Var2.R & 32768) != 0) {
                    while (z64Var2 != null) {
                        if ((z64Var2.L & 32768) != 0) {
                            z64 z64Var3 = z64Var2;
                            ua4 ua4Var = null;
                            while (z64Var3 != null) {
                                if (z64Var3 instanceof fy0) {
                                    z64 z64Var4 = ((z64) ((fy0) z64Var3)).A;
                                    if (z64Var4.j0) {
                                        fg4.c(z64Var4);
                                    } else {
                                        z64Var4.f0 = true;
                                    }
                                } else if ((z64Var3.L & 32768) != 0 && (z64Var3 instanceof zg1)) {
                                    int i2 = 0;
                                    for (z64 z64Var5 = ((zg1) z64Var3).l0; z64Var5 != null; z64Var5 = z64Var5.Y) {
                                        if ((z64Var5.L & 32768) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                z64Var3 = z64Var5;
                                            } else {
                                                if (ua4Var == null) {
                                                    ua4Var = new ua4(new z64[16]);
                                                }
                                                if (z64Var3 != null) {
                                                    ua4Var.b(z64Var3);
                                                    z64Var3 = null;
                                                }
                                                ua4Var.b(z64Var5);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                z64Var3 = nc1.A(ua4Var);
                            }
                        }
                        if ((z64Var2.R & 32768) != 0) {
                            z64Var2 = z64Var2.Y;
                        }
                    }
                }
                return jg7Var;
            case 11:
                sm3 sm3Var2 = (sm3) obj;
                ((tz3) obj2).getClass();
                return jg7Var;
            case 12:
                Collection collection = (List) obj;
                List list = (List) obj2;
                if (collection == null) {
                    collection = yt1.A;
                }
                return gt0.V0(collection, list);
            case 13:
                rf rfVar = (rf) obj2;
                return (rf) obj;
            case 14:
                List list2 = (List) obj;
                List list3 = (List) obj2;
                if (list2 != null) {
                    ArrayList arrayList = new ArrayList(list2);
                    arrayList.addAll(list3);
                    return arrayList;
                }
                return list3;
            case 15:
                d41 d41Var = (d41) obj2;
                return (d41) obj;
            case 16:
                oh ohVar = (oh) obj2;
                return (oh) obj;
            case 17:
                jg7 jg7Var2 = (jg7) obj2;
                return (jg7) obj;
            case 18:
                jg7 jg7Var3 = (jg7) obj2;
                return (jg7) obj;
            case 19:
                jg7 jg7Var4 = (jg7) obj;
                jg7 jg7Var5 = (jg7) obj2;
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 20:
                jg7 jg7Var6 = (jg7) obj;
                jg7 jg7Var7 = (jg7) obj2;
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                jg7 jg7Var8 = (jg7) obj2;
                return (jg7) obj;
            case 22:
                String str2 = (String) obj;
                String str3 = (String) obj2;
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case ConnectionResult.API_DISABLED /* 23 */:
                mq5 mq5Var = (mq5) obj;
                int i3 = ((mq5) obj2).a;
                return mq5Var;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                ke6 ke6Var = (ke6) obj2;
                return (ke6) obj;
            case 25:
                String str4 = (String) obj2;
                return (String) obj;
            case SubAllocator.N4 /* 26 */:
                List list4 = (List) obj;
                List list5 = (List) obj2;
                if (list4 != null) {
                    ArrayList arrayList2 = new ArrayList(list4);
                    arrayList2.addAll(list5);
                    return arrayList2;
                }
                return list5;
            case 27:
                Float f = (Float) obj;
                ((Number) obj2).floatValue();
                return f;
            case 28:
                String str5 = (String) obj2;
                return (String) obj;
            default:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
        }
    }
}
