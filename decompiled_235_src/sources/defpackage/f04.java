package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.decode.Compress;
import com.google.mlkit.common.MlKitException;
import com.stormds.emulator.R;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ListIterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import me.magnum.melonds.domain.model.Rect;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f04  reason: default package */
/* loaded from: classes.dex */
public abstract class f04 {
    public static final /* synthetic */ int G = 0;
    public static final /* synthetic */ int H = 0;
    public static volatile Handler a;
    public static final zv0 b = new zv0(-1294981609, false, new kw0(7));
    public static final zv0 c = new zv0(-2049005898, false, new kw0(8));
    public static final zv0 d = new zv0(404635378, false, new kw0(9));
    public static final zv0 e = new zv0(2053005571, false, new kw0(10));
    public static final zv0 f = new zv0(-191875025, false, new kw0(11));
    public static final zv0 g = new zv0(918239687, false, new fn0(4));
    public static final zv0 h = new zv0(1643162878, false, new fn0(5));
    public static final zv0 i = new zv0(207659460, false, new kw0(12));
    public static final zv0 j = new zv0(856421348, false, new kw0(13));
    public static final zv0 k = new zv0(1918584073, false, new fn0(24));
    public static final c72 l = new c72(0);
    public static final wf7 m = new wf7(true, 6);
    public static final wf7 n = new wf7(true, 2);
    public static final wf7 o = new wf7(false, 4);
    public static final wf7 p = new wf7(true, 3);
    public static final wf7 q = new wf7(true, 5);
    public static final wf7 r = new wf7(true, 7);
    public static final wf7 s = new wf7(false, 8);
    public static final za3 t = new za3(true, 2);
    public static final za3 u = new za3(true, 3);
    public static final za3 v = new za3(true, 0);
    public static final za3 w = new za3(true, 1);
    public static final byte[] x = {48, 49, 53, 0};
    public static final byte[] y = {48, 49, 48, 0};
    public static final byte[] z = {48, 48, 57, 0};
    public static final byte[] A = {48, 48, 53, 0};
    public static final byte[] B = {48, 48, 49, 0};
    public static final byte[] C = {48, 48, 49, 0};
    public static final byte[] D = {48, 48, 50, 0};
    public static final int[] E = {R.attr.colorPrimary};
    public static final int[] F = {R.attr.colorPrimaryVariant};

    public static final Object A(ne2 ne2Var, le2 le2Var, hw6 hw6Var) {
        if (!(ne2Var instanceof w57)) {
            Object b2 = le2Var.b(ne2Var, hw6Var);
            if (b2 == x61.COROUTINE_SUSPENDED) {
                return b2;
            }
            return jg7.a;
        }
        throw ((w57) ne2Var).A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARN: Type inference failed for: r8v2, types: [dh5, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object B(le2 le2Var, s41 s41Var) {
        rf2 rf2Var;
        int i2;
        gr1 gr1Var;
        dh5 dh5Var;
        o e2;
        pf2 pf2Var;
        Object obj;
        if (s41Var instanceof rf2) {
            rf2 rf2Var2 = (rf2) s41Var;
            int i3 = rf2Var2.Z;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rf2Var2.Z = i3 - Integer.MIN_VALUE;
                rf2Var = rf2Var2;
                Object obj2 = rf2Var.Y;
                Object obj3 = x61.COROUTINE_SUSPENDED;
                i2 = rf2Var.Z;
                gr1Var = fh4.a;
                if (i2 == 0) {
                    if (i2 == 1) {
                        pf2Var = rf2Var.X;
                        dh5Var = rf2Var.R;
                        try {
                            oi2.Y(obj2);
                        } catch (o e3) {
                            e2 = e3;
                            if (e2.A != pf2Var) {
                                l61 l61Var = rf2Var.B;
                                l61Var.getClass();
                                yh2.o(l61Var);
                                obj = dh5Var.A;
                                if (obj != gr1Var) {
                                }
                            } else {
                                throw e2;
                            }
                        }
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj2);
                    ?? obj4 = new Object();
                    obj4.A = gr1Var;
                    pf2 pf2Var2 = new pf2(0, obj4);
                    try {
                        rf2Var.R = obj4;
                        rf2Var.X = pf2Var2;
                        rf2Var.Z = 1;
                        if (le2Var.b(pf2Var2, rf2Var) == obj3) {
                            return obj3;
                        }
                        dh5Var = obj4;
                    } catch (o e4) {
                        dh5Var = obj4;
                        e2 = e4;
                        pf2Var = pf2Var2;
                        if (e2.A != pf2Var) {
                        }
                    }
                }
                obj = dh5Var.A;
                if (obj != gr1Var) {
                    return obj;
                }
                fa6.e("Expected at least one element");
                return null;
            }
        }
        rf2Var = new s41(s41Var);
        Object obj22 = rf2Var.Y;
        Object obj32 = x61.COROUTINE_SUSPENDED;
        i2 = rf2Var.Z;
        gr1Var = fh4.a;
        if (i2 == 0) {
        }
        obj = dh5Var.A;
        if (obj != gr1Var) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0071  */
    /* JADX WARN: Type inference failed for: r9v2, types: [dh5, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object C(le2 le2Var, eo2 eo2Var, r41 r41Var) {
        sf2 sf2Var;
        int i2;
        gr1 gr1Var;
        dh5 dh5Var;
        o e2;
        zb0 zb0Var;
        Object obj;
        if (r41Var instanceof sf2) {
            sf2 sf2Var2 = (sf2) r41Var;
            int i3 = sf2Var2.Z;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sf2Var2.Z = i3 - Integer.MIN_VALUE;
                sf2Var = sf2Var2;
                Object obj2 = sf2Var.Y;
                Object obj3 = x61.COROUTINE_SUSPENDED;
                i2 = sf2Var.Z;
                gr1Var = fh4.a;
                if (i2 == 0) {
                    if (i2 == 1) {
                        zb0Var = sf2Var.X;
                        dh5Var = sf2Var.R;
                        try {
                            oi2.Y(obj2);
                        } catch (o e3) {
                            e2 = e3;
                            if (e2.A != zb0Var) {
                                l61 l61Var = sf2Var.B;
                                l61Var.getClass();
                                yh2.o(l61Var);
                                obj = dh5Var.A;
                                if (obj != gr1Var) {
                                }
                            } else {
                                throw e2;
                            }
                        }
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj2);
                    ?? obj4 = new Object();
                    obj4.A = gr1Var;
                    zb0 zb0Var2 = new zb0(9, eo2Var, obj4);
                    try {
                        sf2Var.R = obj4;
                        sf2Var.X = zb0Var2;
                        sf2Var.Z = 1;
                        if (le2Var.b(zb0Var2, sf2Var) == obj3) {
                            return obj3;
                        }
                        dh5Var = obj4;
                    } catch (o e4) {
                        dh5Var = obj4;
                        e2 = e4;
                        zb0Var = zb0Var2;
                        if (e2.A != zb0Var) {
                        }
                    }
                }
                obj = dh5Var.A;
                if (obj != gr1Var) {
                    return obj;
                }
                fa6.e("Expected at least one element matching the predicate");
                return null;
            }
        }
        sf2Var = new s41(r41Var);
        Object obj22 = sf2Var.Y;
        Object obj32 = x61.COROUTINE_SUSPENDED;
        i2 = sf2Var.Z;
        gr1Var = fh4.a;
        if (i2 == 0) {
        }
        obj = dh5Var.A;
        if (obj != gr1Var) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Type inference failed for: r5v2, types: [dh5, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object D(le2 le2Var, s41 s41Var) {
        tf2 tf2Var;
        int i2;
        dh5 dh5Var;
        o e2;
        pf2 pf2Var;
        if (s41Var instanceof tf2) {
            tf2 tf2Var2 = (tf2) s41Var;
            int i3 = tf2Var2.Z;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tf2Var2.Z = i3 - Integer.MIN_VALUE;
                tf2Var = tf2Var2;
                Object obj = tf2Var.Y;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                i2 = tf2Var.Z;
                if (i2 == 0) {
                    if (i2 == 1) {
                        pf2Var = tf2Var.X;
                        dh5Var = tf2Var.R;
                        try {
                            oi2.Y(obj);
                        } catch (o e3) {
                            e2 = e3;
                            if (e2.A != pf2Var) {
                            }
                        }
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    ?? obj3 = new Object();
                    pf2 pf2Var2 = new pf2(1, obj3);
                    try {
                        tf2Var.R = obj3;
                        tf2Var.X = pf2Var2;
                        tf2Var.Z = 1;
                        if (le2Var.b(pf2Var2, tf2Var) == obj2) {
                            return obj2;
                        }
                        dh5Var = obj3;
                    } catch (o e4) {
                        dh5Var = obj3;
                        e2 = e4;
                        pf2Var = pf2Var2;
                        if (e2.A != pf2Var) {
                            l61 l61Var = tf2Var.B;
                            l61Var.getClass();
                            yh2.o(l61Var);
                            return dh5Var.A;
                        }
                        throw e2;
                    }
                }
                return dh5Var.A;
            }
        }
        tf2Var = new s41(s41Var);
        Object obj4 = tf2Var.Y;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i2 = tf2Var.Z;
        if (i2 == 0) {
        }
        return dh5Var.A;
    }

    public static final le2 E(le2 le2Var, l61 l61Var) {
        if (l61Var.Z(vs0.h0) == null) {
            if (l61Var.equals(vt1.A)) {
                return le2Var;
            }
            if (le2Var instanceof ro2) {
                return qo2.y((ro2) le2Var, l61Var, 0, null, 6);
            }
            return new yl0(le2Var, l61Var, 0, null, 12);
        }
        u34.w(l61Var, "Flow context cannot contain job in it. Had ");
        return null;
    }

    public static final n61 F(Executor executor) {
        return new f72(executor);
    }

    public static float G(px0 px0Var) {
        xq2 xq2Var = (xq2) px0Var;
        long j2 = ((kt0) xq2Var.j(j31.a)).a;
        if (((ut0) xq2Var.j(vt0.a)).k()) {
            if (hv.N(j2) > 0.5d) {
                return 1.0f;
            }
            return 0.87f;
        } else if (hv.N(j2) < 0.5d) {
            return 1.0f;
        } else {
            return 0.87f;
        }
    }

    public static final void H(l61 l61Var, Throwable th) {
        if (th instanceof mk1) {
            th = ((mk1) th).A;
        }
        try {
            o61 o61Var = (o61) l61Var.Z(cs1.Z);
            if (o61Var != null) {
                o61Var.u(l61Var, th);
            } else {
                nb3.A(l61Var, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                mb3.q(runtimeException, th);
                th = runtimeException;
            }
            nb3.A(l61Var, th);
        }
    }

    public static final void I(mo1 mo1Var) {
        if (((z64) mo1Var).A.j0) {
            nc1.d0(mo1Var, 1).f1();
        }
    }

    public static final dm0 J(le2... le2VarArr) {
        Iterable dvVar;
        int i2 = of2.a;
        if (le2VarArr.length == 0) {
            dvVar = yt1.A;
        } else {
            dvVar = new dv(le2VarArr, 0);
        }
        return new dm0(dvVar, vt1.A, -2, m80.SUSPEND);
    }

    public static TypedArray K(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        r(context, attributeSet, i2, i3);
        s(context, attributeSet, iArr, i2, i3, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
    }

    public static final hm L(on2 on2Var, px0 px0Var, int i2) {
        xq2 xq2Var = (xq2) px0Var;
        View view = (View) xq2Var.j(kf.f);
        boolean f2 = xq2Var.f(view);
        Object P = xq2Var.P();
        vs0 vs0Var = ox0.a;
        if (f2 || P == vs0Var) {
            P = new hm(view, null, on2Var);
            xq2Var.l0(P);
        }
        hm hmVar = (hm) P;
        boolean h2 = xq2Var.h(hmVar);
        Object P2 = xq2Var.P();
        if (h2 || P2 == vs0Var) {
            P2 = new cm(hmVar, 3);
            xq2Var.l0(P2);
        }
        mb3.d(hmVar, (qn2) P2, xq2Var);
        return hmVar;
    }

    public static final byte[] M(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        w(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    public static final vl0 N(v80 v80Var) {
        return new vl0(v80Var, false);
    }

    public static final a74 O(a74 a74Var, f86 f86Var, lo4 lo4Var, sg sgVar, boolean z2, sd2 sd2Var, r94 r94Var, tq4 tq4Var) {
        a74 g2;
        lo4 lo4Var2 = lo4.Vertical;
        x64 x64Var = x64.a;
        if (lo4Var == lo4Var2) {
            g2 = u24.g(x64Var, jy2.c);
        } else {
            g2 = u24.g(x64Var, jy2.b);
        }
        return a74Var.d(g2).d(new t76(sgVar, tq4Var, sd2Var, r94Var, lo4Var, f86Var, z2, false));
    }

    public static final be5 P(le2 le2Var, w61 w61Var, eh6 eh6Var, int i2) {
        a71 a71Var;
        aj a2 = jv7.a(le2Var, i2);
        of6 a3 = pf6.a(i2, a2.B, (m80) a2.R);
        l61 l61Var = (l61) a2.X;
        le2 le2Var2 = (le2) a2.L;
        if (eh6Var.equals(dh6.a)) {
            a71Var = a71.DEFAULT;
        } else {
            a71Var = a71.UNDISPATCHED;
        }
        hv.K(w61Var, l61Var, a71Var, new l5(eh6Var, le2Var2, a3, pf6.a, null, 14));
        return new be5(a3);
    }

    public static String Q(String str) {
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -2061550653:
                if (!str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return null;
                }
                return "Companion";
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "Double";
                }
                return null;
            case -1182275604:
                if (!str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return null;
                }
                return "Companion";
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "Short";
                }
                return null;
            case -246476834:
                if (!str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return null;
                }
                return "Companion";
            case -207262728:
                if (!str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return null;
                }
                return "Companion";
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "List";
                }
                return null;
            case 77230534:
                if (!str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return null;
                }
                return "Companion";
            case 97526364:
                if (str.equals("float")) {
                    return "Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "Char";
                }
                return null;
            case 226173651:
                if (!str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return null;
                }
                return "Companion";
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "Long";
                }
                return null;
            case 482629606:
                if (!str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return null;
                }
                return "Companion";
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "ListIterator";
                }
                return null;
            case 599019395:
                if (!str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return null;
                }
                return "Companion";
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "Iterable";
                }
                return null;
            case 1383693018:
                if (!str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return null;
                }
                return "Companion";
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "Throwable";
                }
                return null;
            case 1877171123:
                if (!str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return null;
                }
                return "Companion";
            default:
                switch (hashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (hashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (hashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static final de5 R(le2 le2Var, w61 w61Var, eh6 eh6Var, Object obj) {
        a71 a71Var;
        aj a2 = jv7.a(le2Var, 1);
        tp6 a3 = up6.a(obj);
        l61 l61Var = (l61) a2.X;
        le2 le2Var2 = (le2) a2.L;
        if (eh6Var.equals(dh6.a)) {
            a71Var = a71.DEFAULT;
        } else {
            a71Var = a71.UNDISPATCHED;
        }
        hv.K(w61Var, l61Var, a71Var, new l5(eh6Var, le2Var2, a3, obj, null, 14));
        return new de5(a3);
    }

    public static final BlendMode S(int i2) {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        BlendMode blendMode4;
        BlendMode blendMode5;
        BlendMode blendMode6;
        BlendMode blendMode7;
        BlendMode blendMode8;
        BlendMode blendMode9;
        BlendMode blendMode10;
        BlendMode blendMode11;
        BlendMode blendMode12;
        BlendMode blendMode13;
        BlendMode blendMode14;
        BlendMode blendMode15;
        BlendMode blendMode16;
        BlendMode blendMode17;
        BlendMode blendMode18;
        BlendMode blendMode19;
        BlendMode blendMode20;
        BlendMode blendMode21;
        BlendMode blendMode22;
        BlendMode blendMode23;
        BlendMode blendMode24;
        BlendMode blendMode25;
        BlendMode blendMode26;
        BlendMode blendMode27;
        BlendMode blendMode28;
        BlendMode blendMode29;
        BlendMode blendMode30;
        if (i2 == 0) {
            blendMode30 = BlendMode.CLEAR;
            return blendMode30;
        } else if (i2 == 1) {
            blendMode29 = BlendMode.SRC;
            return blendMode29;
        } else if (i2 == 2) {
            blendMode28 = BlendMode.DST;
            return blendMode28;
        } else if (i2 == 3) {
            blendMode27 = BlendMode.SRC_OVER;
            return blendMode27;
        } else if (i2 == 4) {
            blendMode26 = BlendMode.DST_OVER;
            return blendMode26;
        } else if (i2 == 5) {
            blendMode25 = BlendMode.SRC_IN;
            return blendMode25;
        } else if (i2 == 6) {
            blendMode24 = BlendMode.DST_IN;
            return blendMode24;
        } else if (i2 == 7) {
            blendMode23 = BlendMode.SRC_OUT;
            return blendMode23;
        } else if (i2 == 8) {
            blendMode22 = BlendMode.DST_OUT;
            return blendMode22;
        } else if (i2 == 9) {
            blendMode21 = BlendMode.SRC_ATOP;
            return blendMode21;
        } else if (i2 == 10) {
            blendMode20 = BlendMode.DST_ATOP;
            return blendMode20;
        } else if (i2 == 11) {
            blendMode19 = BlendMode.XOR;
            return blendMode19;
        } else if (i2 == 12) {
            blendMode18 = BlendMode.PLUS;
            return blendMode18;
        } else if (i2 == 13) {
            blendMode17 = BlendMode.MODULATE;
            return blendMode17;
        } else if (i2 == 14) {
            blendMode16 = BlendMode.SCREEN;
            return blendMode16;
        } else if (i2 == 15) {
            blendMode15 = BlendMode.OVERLAY;
            return blendMode15;
        } else if (i2 == 16) {
            blendMode14 = BlendMode.DARKEN;
            return blendMode14;
        } else if (i2 == 17) {
            blendMode13 = BlendMode.LIGHTEN;
            return blendMode13;
        } else if (i2 == 18) {
            blendMode12 = BlendMode.COLOR_DODGE;
            return blendMode12;
        } else if (i2 == 19) {
            blendMode11 = BlendMode.COLOR_BURN;
            return blendMode11;
        } else if (i2 == 20) {
            blendMode10 = BlendMode.HARD_LIGHT;
            return blendMode10;
        } else if (i2 == 21) {
            blendMode9 = BlendMode.SOFT_LIGHT;
            return blendMode9;
        } else if (i2 == 22) {
            blendMode8 = BlendMode.DIFFERENCE;
            return blendMode8;
        } else if (i2 == 23) {
            blendMode7 = BlendMode.EXCLUSION;
            return blendMode7;
        } else if (i2 == 24) {
            blendMode6 = BlendMode.MULTIPLY;
            return blendMode6;
        } else if (i2 == 25) {
            blendMode5 = BlendMode.HUE;
            return blendMode5;
        } else if (i2 == 26) {
            blendMode4 = BlendMode.SATURATION;
            return blendMode4;
        } else if (i2 == 27) {
            blendMode3 = BlendMode.COLOR;
            return blendMode3;
        } else if (i2 == 28) {
            blendMode2 = BlendMode.LUMINOSITY;
            return blendMode2;
        } else {
            blendMode = BlendMode.SRC_OVER;
            return blendMode;
        }
    }

    public static final PorterDuff.Mode T(int i2) {
        if (i2 == 0) {
            return PorterDuff.Mode.CLEAR;
        }
        if (i2 == 1) {
            return PorterDuff.Mode.SRC;
        }
        if (i2 == 2) {
            return PorterDuff.Mode.DST;
        }
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 4) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 6) {
            return PorterDuff.Mode.DST_IN;
        }
        if (i2 == 7) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (i2 == 8) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (i2 == 10) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (i2 == 11) {
            return PorterDuff.Mode.XOR;
        }
        if (i2 == 12) {
            return PorterDuff.Mode.ADD;
        }
        if (i2 == 14) {
            return PorterDuff.Mode.SCREEN;
        }
        if (i2 == 15) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (i2 == 16) {
            return PorterDuff.Mode.DARKEN;
        }
        if (i2 == 17) {
            return PorterDuff.Mode.LIGHTEN;
        }
        if (i2 == 13) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static final b41 U(o52 o52Var, z72 z72Var) {
        return new b41(o52Var, z72Var, RecyclerView.B1, new gj6(pn.L));
    }

    public static final cm0 V(le2 le2Var, fo2 fo2Var) {
        int i2 = of2.a;
        return new cm0(fo2Var, le2Var, vt1.A, -2, m80.SUSPEND);
    }

    public static final Object W(ob6 ob6Var, Object obj) {
        Object c2 = ob6Var.c(obj);
        if (!(c2 instanceof fm0)) {
            jg7 jg7Var = (jg7) c2;
            return jg7.a;
        }
        return ((gm0) hv.V(vt1.A, new b0(ob6Var, obj, null, 13))).a;
    }

    public static final int X(float f2, float[] fArr, int i2) {
        float f3 = RecyclerView.B1;
        if (f2 >= RecyclerView.B1) {
            f3 = f2;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (Math.abs(f3 - f2) > 1.05E-6f) {
            f3 = Float.NaN;
        }
        fArr[i2] = f3;
        return !Float.isNaN(f3) ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(a74 a74Var, Object obj, bt btVar, kt0 kt0Var, fo2 fo2Var, px0 px0Var, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        kt0 kt0Var2;
        int i7;
        boolean z2;
        kt0 kt0Var3;
        cf5 t2;
        kt0 kt0Var4;
        int i8;
        btVar.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-95025438);
        if ((i2 & 6) == 0) {
            if (xq2Var.f(a74Var)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i4 = i8 | i2;
        } else {
            i4 = i2;
        }
        if (xq2Var.h(obj)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i9 = i4 | i5;
        if (xq2Var.f(btVar)) {
            i6 = 256;
        } else {
            i6 = 128;
        }
        int i10 = i9 | i6;
        int i11 = i3 & 8;
        if (i11 != 0) {
            i10 |= 3072;
        } else if ((i2 & 3072) == 0) {
            kt0Var2 = kt0Var;
            if (xq2Var.f(kt0Var2)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i10 |= i7;
            boolean z3 = true;
            if ((i10 & 9363) == 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!xq2Var.S(i10 & 1, z2)) {
                if (i11 != 0) {
                    kt0Var4 = null;
                } else {
                    kt0Var4 = kt0Var2;
                }
                if ((i10 & 896) != 256) {
                    z3 = false;
                }
                Object P = xq2Var.P();
                if (z3 || P == ox0.a) {
                    P = new y3(btVar, (r41) null, 0);
                    xq2Var.l0(P);
                }
                mb3.i(xq2Var, (eo2) P, jg7.a);
                g04.d((ta4) btVar.L, null, i52.d(null, 3).a(i52.i(3, null)).a(i52.c(9)), i52.e(null, 3).a(i52.j(3, null)).a(i52.g(ge7.Y(0, MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE, null, 5), 12)), null, n16.I(1669825802, new u91(btVar, a74Var, kt0Var4, obj, fo2Var, 1), xq2Var), xq2Var, 199680);
                kt0Var3 = kt0Var4;
            } else {
                xq2Var.V();
                kt0Var3 = kt0Var2;
            }
            t2 = xq2Var.t();
            if (t2 == null) {
                t2.d = new w3(a74Var, obj, btVar, kt0Var3, fo2Var, i2, i3);
                return;
            }
            return;
        }
        kt0Var2 = kt0Var;
        boolean z32 = true;
        if ((i10 & 9363) == 9362) {
        }
        if (!xq2Var.S(i10 & 1, z2)) {
        }
        t2 = xq2Var.t();
        if (t2 == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v2 */
    public static final void b(ga7 ga7Var, a74 a74Var, qn2 qn2Var, ic icVar, qn2 qn2Var2, zv0 zv0Var, px0 px0Var, int i2) {
        int i3;
        boolean z2;
        qn2 qn2Var3;
        xq2 xq2Var;
        boolean z3;
        boolean z4;
        boolean z5;
        gx0 gx0Var;
        yn ynVar;
        mm6 mm6Var;
        yn ynVar2;
        w97 w97Var;
        boolean z6;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        qn2 qn2Var4 = qn2Var;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(511725103);
        if ((i2 & 6) == 0) {
            if (xq2Var2.f(ga7Var)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (xq2Var2.f(a74Var)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var2.h(qn2Var4)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i3 |= i7;
        }
        if ((i2 & 3072) == 0) {
            if (xq2Var2.f(icVar)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i2 & 24576) == 0) {
            if (xq2Var2.h(qn2Var2)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i3 |= i5;
        }
        zv0 zv0Var2 = zv0Var;
        if ((196608 & i2) == 0) {
            if (xq2Var2.h(zv0Var2)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i3 |= i4;
        }
        if ((74899 & i3) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var2.S(i3 & 1, z2)) {
            kk3 kk3Var = (kk3) xq2Var2.j(ky0.n);
            int i10 = i3 & 14;
            if (i10 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P = xq2Var2.P();
            Object obj = ox0.a;
            if (z3 || P == obj) {
                P = new yn(ga7Var, icVar);
                xq2Var2.l0(P);
            }
            yn ynVar3 = P;
            if (i10 == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object P2 = xq2Var2.P();
            mm6 mm6Var2 = P2;
            if (z4 || P2 == obj) {
                mm6 mm6Var3 = new mm6();
                mm6Var3.addAll(fv.T0(new Object[]{ga7Var.a.f()}));
                xq2Var2.l0(mm6Var3);
                mm6Var2 = mm6Var3;
            }
            mm6 mm6Var4 = (mm6) mm6Var2;
            if (i10 == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            Object P3 = xq2Var2.P();
            if (z5 || P3 == obj) {
                long[] jArr = b66.a;
                P3 = new ja4();
                xq2Var2.l0(P3);
            }
            ja4 ja4Var = (ja4) P3;
            gx0 gx0Var2 = ga7Var.a;
            vs4 vs4Var = ga7Var.d;
            if (!mm6Var4.contains(gx0Var2.f())) {
                mm6Var4.clear();
                mm6Var4.add(gx0Var2.f());
            }
            if (nb3.k(gx0Var2.f(), vs4Var.getValue())) {
                if (mm6Var4.size() != 1 || !nb3.k(mm6Var4.get(0), gx0Var2.f())) {
                    mm6Var4.clear();
                    mm6Var4.add(gx0Var2.f());
                }
                if (ja4Var.e != 1 || ja4Var.c(gx0Var2.f())) {
                    ja4Var.a();
                }
                ynVar3.b = icVar;
            }
            if (!nb3.k(gx0Var2.f(), vs4Var.getValue()) && !mm6Var4.contains(vs4Var.getValue())) {
                ListIterator listIterator = mm6Var4.listIterator();
                int i11 = 0;
                while (true) {
                    xx2 xx2Var = (xx2) listIterator;
                    gx0Var = gx0Var2;
                    if (xx2Var.hasNext()) {
                        if (nb3.k(qn2Var2.g(xx2Var.next()), qn2Var2.g(vs4Var.getValue()))) {
                            break;
                        }
                        i11++;
                        gx0Var2 = gx0Var;
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                if (i11 == -1) {
                    mm6Var4.add(vs4Var.getValue());
                } else {
                    mm6Var4.set(i11, vs4Var.getValue());
                }
            } else {
                gx0Var = gx0Var2;
            }
            if (ja4Var.c(vs4Var.getValue()) && ja4Var.c(gx0Var.f())) {
                xq2Var2.b0(1968995539);
                xq2Var2.p(false);
                qn2Var3 = qn2Var4;
                ynVar = ynVar3;
            } else {
                xq2Var2.b0(1966410449);
                ja4Var.a();
                int size = mm6Var4.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj2 = mm6Var4.get(i12);
                    ja4Var.m(obj2, n16.I(-23915175, new nn(ga7Var, obj2, qn2Var4, ynVar3, mm6Var4, zv0Var2), xq2Var2));
                    i12++;
                    qn2Var4 = qn2Var4;
                    zv0Var2 = zv0Var;
                }
                qn2Var3 = qn2Var4;
                ynVar = ynVar3;
                xq2Var2.p(false);
            }
            boolean f2 = xq2Var2.f(ga7Var.f()) | xq2Var2.f(ynVar);
            Object P4 = xq2Var2.P();
            if (f2 || P4 == obj) {
                P4 = (b41) qn2Var3.g(ynVar);
                xq2Var2.l0(P4);
            }
            b41 b41Var = (b41) P4;
            ga7 ga7Var2 = ynVar.a;
            boolean f3 = xq2Var2.f(ynVar);
            Object P5 = xq2Var2.P();
            if (f3 || P5 == obj) {
                P5 = np2.Y(Boolean.FALSE);
                xq2Var2.l0(P5);
            }
            qa4 qa4Var = (qa4) P5;
            qa4 b0 = np2.b0(b41Var.d, xq2Var2);
            if (nb3.k(ga7Var2.a.f(), ga7Var2.d.getValue())) {
                qa4Var.setValue(Boolean.FALSE);
            } else if (b0.getValue() != null) {
                qa4Var.setValue(Boolean.TRUE);
            }
            boolean booleanValue = ((Boolean) qa4Var.getValue()).booleanValue();
            a74 a74Var2 = x64.a;
            if (booleanValue) {
                xq2Var2.b0(1353077497);
                yn ynVar4 = ynVar;
                mm6Var = mm6Var4;
                xq2Var = xq2Var2;
                ynVar2 = ynVar4;
                w97Var = n16.s(ynVar4.a, nw7.l0, null, xq2Var, 0, 2);
                boolean f4 = xq2Var.f(w97Var);
                Object P6 = xq2Var.P();
                if (f4 || P6 == obj) {
                    gj6 gj6Var = (gj6) b0.getValue();
                    P6 = u24.h(a74Var2);
                    xq2Var.l0(P6);
                }
                a74Var2 = (a74) P6;
                xq2Var.p(false);
            } else {
                mm6Var = mm6Var4;
                xq2Var = xq2Var2;
                ynVar2 = ynVar;
                xq2Var.b0(1353343539);
                xq2Var.p(false);
                w97Var = null;
            }
            a74 d2 = a74Var.d(a74Var2.d(new un(w97Var, b0, ynVar2)));
            Object P7 = xq2Var.P();
            if (P7 == obj) {
                P7 = new rn(ynVar2);
                xq2Var.l0(P7);
            }
            rn rnVar = (rn) P7;
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E2 = l.E(xq2Var, d2);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, rnVar);
            yh2.K(xq2Var, ix0.e, l2);
            yh2.x(xq2Var, Integer.valueOf(hashCode), ix0.g);
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E2);
            xq2Var.b0(-860173498);
            int size2 = mm6Var.size();
            int i13 = 0;
            while (i13 < size2) {
                mm6 mm6Var5 = mm6Var;
                Object obj3 = mm6Var5.get(i13);
                xq2Var.Z(-2026002954, qn2Var2.g(obj3));
                eo2 eo2Var = (eo2) ja4Var.g(obj3);
                if (eo2Var == null) {
                    xq2Var.b0(1618454323);
                    z6 = false;
                } else {
                    z6 = false;
                    xq2Var.b0(-2026001778);
                    eo2Var.o(xq2Var, 0);
                }
                xq2Var.p(z6);
                xq2Var.p(z6);
                i13++;
                mm6Var = mm6Var5;
            }
            xq2Var.p(false);
            xq2Var.p(true);
        } else {
            qn2Var3 = qn2Var4;
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.d = new on(ga7Var, a74Var, (qn2) qn2Var3, icVar, qn2Var2, zv0Var, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(Object obj, a74 a74Var, qn2 qn2Var, ic icVar, String str, qn2 qn2Var2, zv0 zv0Var, px0 px0Var, int i2, int i3) {
        int i4;
        Object obj2;
        int i5;
        int i6;
        Object obj3;
        int i7;
        int i8;
        boolean z2;
        e40 e40Var;
        qn2 qn2Var3;
        a74 a74Var2;
        qn2 qn2Var4;
        cf5 t2;
        x64 x64Var;
        qn2 qn2Var5;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1501828832);
        if (xq2Var.f(obj)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i9 = i4 | i2;
        int i10 = i3 & 2;
        if (i10 != 0) {
            i9 |= 48;
        } else if ((i2 & 48) == 0) {
            obj2 = a74Var;
            if (xq2Var.f(obj2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i9 |= i5;
            i6 = i3 & 4;
            if (i6 == 0) {
                i9 |= RendererDebugBridge.CAPTURE_HEIGHT;
            } else if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
                obj3 = qn2Var;
                if (xq2Var.h(obj3)) {
                    i7 = 256;
                } else {
                    i7 = 128;
                }
                i9 |= i7;
                i8 = i9 | 199680;
                if ((599187 & i8) != 599186) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (xq2Var.S(i8 & 1, z2)) {
                    if (i10 != 0) {
                        x64Var = x64.a;
                    } else {
                        x64Var = obj2;
                    }
                    Object obj4 = ox0.a;
                    if (i6 != 0) {
                        Object P = xq2Var.P();
                        if (P == obj4) {
                            P = ne.h0;
                            xq2Var.l0(P);
                        }
                        qn2Var5 = (qn2) P;
                    } else {
                        qn2Var5 = obj3;
                    }
                    e40 e40Var2 = d90.L;
                    Object P2 = xq2Var.P();
                    if (P2 == obj4) {
                        P2 = ne.i0;
                        xq2Var.l0(P2);
                    }
                    qn2 qn2Var6 = (qn2) P2;
                    b(n16.N(obj, str, xq2Var, (i8 & 14) | 48, 0), x64Var, qn2Var5, e40Var2, qn2Var6, zv0Var, xq2Var, (i8 & 8176) | 221184);
                    a74Var2 = x64Var;
                    qn2Var4 = qn2Var5;
                    e40Var = e40Var2;
                    qn2Var3 = qn2Var6;
                } else {
                    xq2Var.V();
                    e40Var = icVar;
                    qn2Var3 = qn2Var2;
                    a74Var2 = obj2;
                    qn2Var4 = obj3;
                }
                t2 = xq2Var.t();
                if (t2 != null) {
                    t2.d = new jn(obj, a74Var2, qn2Var4, e40Var, str, qn2Var3, zv0Var, i2, i3);
                    return;
                }
                return;
            }
            obj3 = qn2Var;
            i8 = i9 | 199680;
            if ((599187 & i8) != 599186) {
            }
            if (xq2Var.S(i8 & 1, z2)) {
            }
            t2 = xq2Var.t();
            if (t2 != null) {
            }
        }
        obj2 = a74Var;
        i6 = i3 & 4;
        if (i6 == 0) {
        }
        obj3 = qn2Var;
        i8 = i9 | 199680;
        if ((599187 & i8) != 599186) {
        }
        if (xq2Var.S(i8 & 1, z2)) {
        }
        t2 = xq2Var.t();
        if (t2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0213  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final nw nwVar, final String str, final a74 a74Var, final qn2 qn2Var, final qn2 qn2Var2, final ic icVar, final z31 z31Var, final float f2, final int i2, px0 px0Var, final int i3, final int i4) {
        int i5;
        qn2 qn2Var3;
        Object obj;
        Object obj2;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        int i10;
        fj6 fj6Var;
        z23 z23Var;
        fj6 fj6Var2;
        a74 a74Var2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-421592773);
        if ((i3 & 14) == 0) {
            if (xq2Var.f(nwVar)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i5 = i21 | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 112) == 0) {
            if (xq2Var.f(str)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i5 |= i20;
        }
        if ((i3 & 896) == 0) {
            if (xq2Var.f(a74Var)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i5 |= i19;
        }
        if ((i3 & 7168) == 0) {
            qn2Var3 = qn2Var;
            if (xq2Var.h(qn2Var3)) {
                i18 = 2048;
            } else {
                i18 = 1024;
            }
            i5 |= i18;
        } else {
            qn2Var3 = qn2Var;
        }
        if ((i3 & 57344) == 0) {
            obj = qn2Var2;
            if (xq2Var.h(obj)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i5 |= i17;
        } else {
            obj = qn2Var2;
        }
        if ((i3 & 458752) == 0) {
            obj2 = icVar;
            if (xq2Var.f(obj2)) {
                i16 = 131072;
            } else {
                i16 = 65536;
            }
            i5 |= i16;
        } else {
            obj2 = icVar;
        }
        if ((i3 & 3670016) == 0) {
            if (xq2Var.f(z31Var)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i5 |= i15;
        }
        if ((i3 & 29360128) == 0) {
            if (xq2Var.c(f2)) {
                i14 = 8388608;
            } else {
                i14 = Compress.MAXWINSIZE;
            }
            i5 |= i14;
        }
        if ((i3 & 234881024) == 0) {
            if (xq2Var.f(null)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i5 |= i13;
        }
        if ((i3 & 1879048192) == 0) {
            i6 = 57344;
            i7 = i2;
            if (xq2Var.d(i7)) {
                i12 = 536870912;
            } else {
                i12 = 268435456;
            }
            i5 |= i12;
        } else {
            i6 = 57344;
            i7 = i2;
        }
        if ((i4 & 14) == 0) {
            i8 = 3670016;
            if (xq2Var.g(true)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i9 = i4 | i11;
        } else {
            i8 = 3670016;
            i9 = i4;
        }
        if ((i5 & 1533916891) == 306783378 && (i9 & 11) == 2 && xq2Var.E()) {
            xq2Var.V();
        } else {
            Object obj3 = nwVar.a;
            ve5 ve5Var = dk7.b;
            xq2Var.c0(1677680258);
            boolean z3 = obj3 instanceof z23;
            if (z3) {
                z23Var = (z23) obj3;
                if (z23Var.A.a != null) {
                    xq2Var.p(false);
                    i10 = i5;
                    z23 z23Var2 = z23Var;
                    int i22 = i10 >> 6;
                    int i23 = i22 & i6;
                    lw n0 = nw7.n0(z23Var2, nwVar.c, qn2Var3, obj, z31Var, i7, xq2Var);
                    fj6Var2 = z23Var2.x;
                    if (!(fj6Var2 instanceof u21)) {
                        a74Var2 = a74Var.d((a74) fj6Var2);
                    } else {
                        a74Var2 = a74Var;
                    }
                    g(a74Var2, n0, str, obj2, z31Var, f2, xq2Var, (i22 & i8) | i23 | ((i10 << 3) & 896) | (i22 & 7168) | (i22 & 458752) | ((i9 << 21) & 29360128));
                }
            }
            xq2Var.c0(408306591);
            boolean k2 = nb3.k(z31Var, y31.e);
            Object obj4 = ox0.a;
            if (k2) {
                i10 = i5;
                fj6Var = dk7.b;
                z2 = false;
            } else {
                xq2Var.c0(408309406);
                Object P = xq2Var.P();
                if (P == obj4) {
                    P = new u21();
                    xq2Var.l0(P);
                }
                fj6 fj6Var3 = (u21) P;
                z2 = false;
                xq2Var.p(false);
                i10 = i5;
                fj6Var = fj6Var3;
            }
            xq2Var.p(z2);
            if (z3) {
                xq2Var.c0(-227230258);
                z23 z23Var3 = (z23) obj3;
                xq2Var.c0(408312509);
                boolean f3 = xq2Var.f(z23Var3) | xq2Var.f(fj6Var);
                Object P2 = xq2Var.P();
                if (f3 || P2 == obj4) {
                    x23 a2 = z23.a(z23Var3);
                    a2.r = fj6Var;
                    a2.t = null;
                    a2.u = null;
                    a2.v = null;
                    P2 = a2.a();
                    xq2Var.l0(P2);
                }
                z23Var = (z23) P2;
            } else {
                xq2Var.c0(-227066702);
                Context context = (Context) xq2Var.j(kf.b);
                xq2Var.c0(408319118);
                boolean f4 = xq2Var.f(context) | xq2Var.f(obj3) | xq2Var.f(fj6Var);
                Object P3 = xq2Var.P();
                if (f4 || P3 == obj4) {
                    x23 x23Var = new x23(context);
                    x23Var.c = obj3;
                    x23Var.r = fj6Var;
                    x23Var.t = null;
                    x23Var.u = null;
                    x23Var.v = null;
                    P3 = x23Var.a();
                    xq2Var.l0(P3);
                }
                z23Var = (z23) P3;
            }
            i61.y(xq2Var, false, false, false);
            z23 z23Var22 = z23Var;
            int i222 = i10 >> 6;
            int i232 = i222 & i6;
            lw n02 = nw7.n0(z23Var22, nwVar.c, qn2Var3, obj, z31Var, i7, xq2Var);
            fj6Var2 = z23Var22.x;
            if (!(fj6Var2 instanceof u21)) {
            }
            g(a74Var2, n02, str, obj2, z31Var, f2, xq2Var, (i222 & i8) | i232 | ((i10 << 3) & 896) | (i222 & 7168) | (i222 & 458752) | ((i9 << 21) & 29360128));
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.d = new eo2() { // from class: bw
                @Override // defpackage.eo2
                public final Object o(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    f04.d(nw.this, str, a74Var, qn2Var, qn2Var2, icVar, z31Var, f2, i2, (px0) obj5, ii2.a0(i3 | 1), ii2.a0(i4));
                    return jg7.a;
                }
            };
        }
    }

    public static final void e(p27 p27Var, zv0 zv0Var, px0 px0Var, int i2) {
        int i3;
        boolean z2;
        a74 N;
        int i4;
        int i5;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1533506138);
        if ((i2 & 6) == 0) {
            if (xq2Var.h(p27Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (xq2Var.h(zv0Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var.S(i3 & 1, z2)) {
            xq2Var.b0(-885604480);
            if (!p27Var.k()) {
                N = x64.a;
            } else {
                N = mb3.N(q60.X(new j27(p27Var, null, 0)), p27Var.y, new wc0(p27Var, null, 4), new k27(p27Var, null, 0), new s51(p27Var, 2));
            }
            np2.h(N, zv0Var, xq2Var, i3 & 112);
            xq2Var.p(false);
        } else {
            xq2Var.V();
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.d = new qu0(p27Var, zv0Var, i2, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0341  */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [int, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(c11 c11Var, Rect rect, Rect rect2, a74 a74Var, px0 px0Var, int i2) {
        int ordinal;
        int i3;
        int i4;
        int i5;
        boolean z2;
        xq2 xq2Var;
        x64 x64Var;
        vi6 vi6Var;
        vi6 vi6Var2;
        long j2;
        long j3;
        long j4;
        x64 x64Var2;
        String str;
        int i6;
        vs0 vs0Var;
        vs0 vs0Var2;
        float f2;
        vs0 vs0Var3;
        long j5;
        long j6;
        long j7;
        long j8;
        d40 d40Var;
        jy2 jy2Var;
        ?? r3;
        ?? r5;
        float f3;
        a74 L;
        a74 L2;
        a74 L3;
        iy0 iy0Var;
        x64 x64Var3;
        c11 c11Var2;
        boolean z3;
        vi6 vi6Var3;
        jy2 jy2Var2 = u24.m;
        d40 d40Var2 = d90.i0;
        e40 e40Var = d90.Z;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(-1246201754);
        if (c11Var == null) {
            ordinal = -1;
        } else {
            ordinal = c11Var.ordinal();
        }
        if (xq2Var2.d(ordinal)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i2 | i3;
        if (xq2Var2.f(rect)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4;
        if (xq2Var2.f(rect2)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i9 = i8 | i5 | 3072;
        if ((i9 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var2.S(i9 & 1, z2)) {
            g53 H2 = yh2.H("skinLeds", xq2Var2, 0);
            e41 e41Var = ir1.c;
            sc7 Y = ge7.Y(1200, 0, e41Var, 2);
            ck5 ck5Var = ck5.Reverse;
            e53 h2 = yh2.h(H2, 0.7f, 1.0f, ge7.G(Y, ck5Var, 4), "ledAlpha", xq2Var2, 29112, 0);
            xq2 xq2Var3 = xq2Var2;
            e53 h3 = yh2.h(H2, 0.15f, 0.95f, ge7.G(ge7.Y(320, 0, e41Var, 2), ck5Var, 4), "wifiAlpha", xq2Var3, 29112, 0);
            e53 h4 = yh2.h(H2, 0.85f, 1.0f, ge7.G(ge7.Y(900, 0, e41Var, 2), ck5Var, 4), "threeDAlpha", xq2Var3, 29112, 0);
            qh1 qh1Var = (qh1) xq2Var3.j(ky0.h);
            int i10 = b11.a[c11Var.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                vi6Var3 = new vi6(new kt0(hv.c(4279505942L)), new kt0(hv.c(4280295460L)), new kt0(hv.c(4281216564L)), new kt0(hv.c(2566914048L)), new kt0(hv.b(863072634)), "Nintendo DS Lite");
                            } else {
                                vi6Var = new vi6(new kt0(hv.c(4279769115L)), new kt0(hv.c(4280756010L)), new kt0(hv.c(4282335046L)), new kt0(hv.c(2566914048L)), new kt0(hv.b(866230698)), "New Nintendo 3DS XL");
                            }
                        } else {
                            vi6Var3 = new vi6(new kt0(hv.c(4278355143L)), new kt0(hv.c(4278413729L)), new kt0(hv.c(4278671749L)), new kt0(hv.c(2282237769L)), new kt0(hv.b(1434309628)), "Nintendo 3DS");
                        }
                    } else {
                        vi6Var = new vi6(new kt0(hv.c(4287107895L)), new kt0(hv.c(4283172121L)), new kt0(hv.c(4288614969L)), new kt0(hv.c(2281701376L)), new kt0(hv.b(1157473455)), "Nintendo DS Lite Crimson");
                    }
                } else {
                    vi6Var3 = new vi6(new kt0(hv.c(4279179050L)), new kt0(hv.c(4280166715L)), new kt0(hv.c(4281549141L)), new kt0(hv.c(2281834007L)), new kt0(hv.b(859356664)), "Nintendo DSi XL");
                }
                vi6Var2 = vi6Var3;
                j2 = vi6Var2.a.a;
                j3 = vi6Var2.b.a;
                j4 = vi6Var2.c.a;
                final long j9 = vi6Var2.d.a;
                final long j10 = vi6Var2.e.a;
                lc2 lc2Var = dj6.c;
                e40 e40Var2 = d90.L;
                e40 e40Var3 = e40Var;
                e34 d2 = h70.d(e40Var2, false);
                int hashCode = Long.hashCode(xq2Var3.T);
                xv4 l2 = xq2Var3.l();
                a74 E2 = l.E(xq2Var3, lc2Var);
                jx0.i.getClass();
                iy0 iy0Var2 = ix0.b;
                xq2Var3.f0();
                if (!xq2Var3.S) {
                    xq2Var3.k(iy0Var2);
                } else {
                    xq2Var3.o0();
                }
                pn pnVar = ix0.f;
                yh2.K(xq2Var3, pnVar, d2);
                pn pnVar2 = ix0.e;
                yh2.K(xq2Var3, pnVar2, l2);
                Integer valueOf = Integer.valueOf(hashCode);
                pn pnVar3 = ix0.g;
                yh2.K(xq2Var3, pnVar3, valueOf);
                ne neVar = ix0.h;
                yh2.F(xq2Var3, neVar);
                pn pnVar4 = ix0.d;
                yh2.K(xq2Var3, pnVar4, E2);
                vs0 vs0Var4 = vs0.Y;
                x64Var2 = x64.a;
                str = vi6Var2.f;
                if (rect == null && rect2 != null) {
                    xq2Var3.b0(-209525769);
                    float Q = qh1Var.Q(rect.getY());
                    float Q2 = qh1Var.Q(rect.getBottom());
                    float Q3 = qh1Var.Q(rect.getX());
                    qh1Var.Q(rect.getRight());
                    float Q4 = qh1Var.Q(rect.getWidth());
                    float Q5 = qh1Var.Q(rect.getHeight());
                    float Q6 = qh1Var.Q(rect2.getY());
                    qh1Var.Q(rect2.getBottom());
                    float Q7 = qh1Var.Q(rect2.getX());
                    float Q8 = qh1Var.Q(rect2.getWidth());
                    float Q9 = qh1Var.Q(rect2.getHeight());
                    int y2 = rect2.getY() - rect.getBottom();
                    if (y2 < 0) {
                        i6 = 0;
                    } else {
                        i6 = y2;
                    }
                    float Q10 = qh1Var.Q(i6);
                    a74 j11 = dj6.j(g04.M(x64Var2, Q3, Q), Q4, Q5);
                    e34 d3 = h70.d(e40Var2, false);
                    int hashCode2 = Long.hashCode(xq2Var3.T);
                    xv4 l3 = xq2Var3.l();
                    a74 E3 = l.E(xq2Var3, j11);
                    xq2Var3.f0();
                    if (xq2Var3.S) {
                        xq2Var3.k(iy0Var2);
                    } else {
                        xq2Var3.o0();
                    }
                    yh2.K(xq2Var3, pnVar, d3);
                    yh2.K(xq2Var3, pnVar2, l3);
                    i61.w(hashCode2, xq2Var3, pnVar3, xq2Var3, neVar);
                    yh2.K(xq2Var3, pnVar4, E3);
                    boolean e2 = xq2Var3.e(j9) | xq2Var3.e(j10);
                    Object P = xq2Var3.P();
                    vs0 vs0Var5 = ox0.a;
                    if (e2 || P == vs0Var5) {
                        P = new qn2() { // from class: y01
                            @Override // defpackage.qn2
                            public final Object g(Object obj) {
                                no1 no1Var = (no1) obj;
                                no1Var.getClass();
                                float intBitsToFloat = Float.intBitsToFloat((int) (no1Var.e() >> 32));
                                float intBitsToFloat2 = Float.intBitsToFloat((int) (no1Var.e() & 4294967295L));
                                float e0 = no1Var.e0(3.0f);
                                long j12 = j9;
                                kt0 kt0Var = new kt0(j12);
                                long j13 = kt0.g;
                                float f4 = e0 * 2.0f;
                                no1.D0(no1Var, d90.m(hf.c0(kt0Var, new kt0(j13)), RecyclerView.B1, f4, 8), (Float.floatToRawIntBits(RecyclerView.B1) << 32) | (Float.floatToRawIntBits(RecyclerView.B1) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), RecyclerView.B1, null, 120);
                                no1.D0(no1Var, d90.k(hf.c0(new kt0(j12), new kt0(j13)), RecyclerView.B1, f4, 8), (Float.floatToRawIntBits(RecyclerView.B1) << 32) | (Float.floatToRawIntBits(RecyclerView.B1) & 4294967295L), (Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), RecyclerView.B1, null, 120);
                                kt0 kt0Var2 = new kt0(j13);
                                long j14 = j10;
                                float f5 = intBitsToFloat2 - f4;
                                no1.D0(no1Var, d90.m(hf.c0(kt0Var2, new kt0(j14)), f5, intBitsToFloat2, 8), (Float.floatToRawIntBits(RecyclerView.B1) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), RecyclerView.B1, null, 120);
                                float f6 = intBitsToFloat - f4;
                                no1.D0(no1Var, d90.k(hf.c0(new kt0(j13), new kt0(j14)), f6, intBitsToFloat, 8), (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(RecyclerView.B1) & 4294967295L), (Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), RecyclerView.B1, null, 120);
                                no1.F(no1Var, kt0.c(0.65f, kt0.b), (Float.floatToRawIntBits(RecyclerView.B1) << 32) | (Float.floatToRawIntBits(RecyclerView.B1) & 4294967295L), no1Var.e(), RecyclerView.B1, new ys6(1.5f, RecyclerView.B1, 0, 0, null, 30), 104);
                                return jg7.a;
                            }
                        };
                        xq2Var3.l0(P);
                    }
                    ak7.j(lc2Var, (qn2) P, xq2Var3, 6);
                    xq2Var3.p(true);
                    int a2 = om1.a(Q, 12.0f);
                    vs0 vs0Var6 = ju.e;
                    if (a2 > 0) {
                        xq2Var3.b0(-206482654);
                        om1 om1Var = new om1(Q - 2.0f);
                        om1 om1Var2 = new om1(14.0f);
                        if (om1Var.compareTo(om1Var2) < 0) {
                            om1Var = om1Var2;
                        }
                        f2 = Q10;
                        vs0Var3 = vs0Var5;
                        a74 J = vy7.J(vs0Var4.n(dj6.e(dj6.c(x64Var2, 1.0f), om1Var.A), d90.R), d90.m(hf.c0(new kt0(j2), new kt0(j3)), RecyclerView.B1, RecyclerView.B1, 14));
                        int i11 = kt0.i;
                        a74 I = ak7.I(J, 1.0f, kt0.c(0.7f, kt0.b), jy2Var2);
                        e34 d4 = h70.d(e40Var3, false);
                        int hashCode3 = Long.hashCode(xq2Var3.T);
                        xv4 l4 = xq2Var3.l();
                        a74 E4 = l.E(xq2Var3, I);
                        xq2Var3.f0();
                        if (xq2Var3.S) {
                            xq2Var3.k(iy0Var2);
                        } else {
                            xq2Var3.o0();
                        }
                        yh2.K(xq2Var3, pnVar, d4);
                        yh2.K(xq2Var3, pnVar2, l4);
                        i61.w(hashCode3, xq2Var3, pnVar3, xq2Var3, neVar);
                        yh2.K(xq2Var3, pnVar4, E4);
                        a74 Q11 = ge7.Q(dj6.c(x64Var2, 1.0f), 16.0f, RecyclerView.B1, 2);
                        l26 a3 = k26.a(vs0Var6, d40Var2, xq2Var3, 54);
                        int hashCode4 = Long.hashCode(xq2Var3.T);
                        xv4 l5 = xq2Var3.l();
                        a74 E5 = l.E(xq2Var3, Q11);
                        xq2Var3.f0();
                        if (xq2Var3.S) {
                            iy0Var = iy0Var2;
                            xq2Var3.k(iy0Var);
                        } else {
                            iy0Var = iy0Var2;
                            xq2Var3.o0();
                        }
                        yh2.K(xq2Var3, pnVar, a3);
                        yh2.K(xq2Var3, pnVar2, l5);
                        i61.w(hashCode4, xq2Var3, pnVar3, xq2Var3, neVar);
                        yh2.K(xq2Var3, pnVar4, E5);
                        int i12 = i9 & 14;
                        m(c11Var, xq2Var3, i12);
                        iy0 iy0Var3 = iy0Var;
                        j5 = j4;
                        j6 = j3;
                        j7 = j2;
                        e40Var3 = e40Var3;
                        d40Var = d40Var2;
                        vs0Var2 = vs0Var6;
                        vs0Var = vs0Var4;
                        j8 = j9;
                        r3 = 1;
                        x37.b(str, null, kt0.c(0.55f, kt0.d), hi2.E(11), oj2.e0, li2.B, hi2.D(1.5d), null, 0L, 0, false, 0, 0, null, null, xq2Var3, 12782976, 0, 130834);
                        xq2Var3 = xq2Var3;
                        l26 a4 = k26.a(new gu(8.0f, true, new i(1)), d40Var, xq2Var3, 54);
                        int hashCode5 = Long.hashCode(xq2Var3.T);
                        xv4 l6 = xq2Var3.l();
                        a74 E6 = l.E(xq2Var3, x64Var2);
                        xq2Var3.f0();
                        if (xq2Var3.S) {
                            xq2Var3.k(iy0Var3);
                        } else {
                            xq2Var3.o0();
                        }
                        yh2.K(xq2Var3, pnVar, a4);
                        yh2.K(xq2Var3, pnVar2, l6);
                        i61.w(hashCode5, xq2Var3, pnVar3, xq2Var3, neVar);
                        yh2.K(xq2Var3, pnVar4, E6);
                        if (c11Var != c11.N3DS_AQUA && c11Var != c11.N3DS_BLACK) {
                            xq2Var3.b0(-595726446);
                            xq2Var3.p(false);
                            z3 = false;
                            x64Var3 = x64Var2;
                            c11Var2 = c11Var;
                            jy2Var = jy2Var2;
                        } else {
                            xq2Var3.b0(-596453892);
                            l26 a5 = k26.a(new gu(3.0f, true, new i(1)), d40Var, xq2Var3, 54);
                            int hashCode6 = Long.hashCode(xq2Var3.T);
                            xv4 l7 = xq2Var3.l();
                            a74 E7 = l.E(xq2Var3, x64Var2);
                            xq2Var3.f0();
                            if (xq2Var3.S) {
                                xq2Var3.k(iy0Var3);
                            } else {
                                xq2Var3.o0();
                            }
                            yh2.K(xq2Var3, pnVar, a5);
                            yh2.K(xq2Var3, pnVar2, l7);
                            i61.w(hashCode6, xq2Var3, pnVar3, xq2Var3, neVar);
                            yh2.K(xq2Var3, pnVar4, E7);
                            x64Var3 = x64Var2;
                            c11Var2 = c11Var;
                            z3 = false;
                            x37.b("3D", null, hv.c(4281908728L), hi2.E(9), oj2.g0, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var3, 200070, 0, 131026);
                            xq2Var3 = xq2Var3;
                            jy2Var = jy2Var2;
                            h70.a(vy7.L(u24.g(dj6.i(x64Var3, 4.0f), z16.a), kt0.c(((Number) h4.R.getValue()).floatValue(), hv.c(4281908728L)), jy2Var), xq2Var3, 0);
                            xq2Var3.r();
                            xq2Var3.s();
                        }
                        m(c11Var2, xq2Var3, i12);
                        xq2Var3.r();
                        xq2Var3.r();
                        xq2Var3.r();
                        xq2Var3.s();
                        x64Var = x64Var3;
                        r5 = z3;
                    } else {
                        vs0Var = vs0Var4;
                        vs0Var2 = vs0Var6;
                        f2 = Q10;
                        vs0Var3 = vs0Var5;
                        x64Var = x64Var2;
                        j5 = j4;
                        j6 = j3;
                        j7 = j2;
                        j8 = j9;
                        d40Var = d40Var2;
                        jy2Var = jy2Var2;
                        r3 = 1;
                        r5 = 0;
                        xq2Var3.b0(-203726506);
                        xq2Var3.s();
                    }
                    float f4 = f2;
                    if (om1.a(f4, 4.0f) >= 0) {
                        f3 = f4;
                    } else {
                        f3 = 18.0f;
                    }
                    if (om1.a(f4, 4.0f) < 0) {
                        Q2 -= 9.0f;
                    }
                    a74 e3 = dj6.e(g04.M(dj6.d(x64Var), RecyclerView.B1, Q2), f3);
                    kt0 a6 = kt0.a(j5);
                    kt0 a7 = kt0.a(j7);
                    kt0 a8 = kt0.a(j6);
                    int i13 = kt0.i;
                    a74 I2 = ak7.I(vy7.J(e3, d90.m(hf.c0(a6, a7, a8, kt0.a(kt0.c(0.85f, xd5.p()))), RecyclerView.B1, RecyclerView.B1, 14)), 1.0f, kt0.c(0.8f, xd5.p()), jy2Var);
                    e40 e40Var4 = e40Var3;
                    e34 d5 = h70.d(e40Var4, r5);
                    int hashCode7 = Long.hashCode(ge7.C(xq2Var3));
                    xv4 z4 = xq2Var3.z();
                    a74 E8 = l.E(xq2Var3, I2);
                    iy0 b2 = ix0.b();
                    xq2Var3.f0();
                    if (xq2Var3.D()) {
                        xq2Var3.k(b2);
                    } else {
                        xq2Var3.o0();
                    }
                    yh2.K(xq2Var3, ix0.d(), d5);
                    yh2.K(xq2Var3, ix0.f(), z4);
                    i61.x(xq2Var3, Integer.valueOf(hashCode7), xq2Var3, xq2Var3, E8);
                    h70.a(ak7.I(vy7.J(u24.g(dj6.e(dj6.c(x64Var, 0.92f), 8.0f), z16.b(4.0f)), d90.m(hf.c0(kt0.a(hv.c(4287931320L)), kt0.a(hv.c(4281549141L)), kt0.a(hv.c(4280166715L)), kt0.a(hv.c(4284773515L))), RecyclerView.B1, RecyclerView.B1, 14)), 0.5f, kt0.c(0.8f, xd5.p()), z16.b(4.0f)), xq2Var3, r5);
                    L = vy7.L(u24.g(dj6.j(x64Var, 10.0f, 3.0f), z16.b(1.5f)), hv.c(4278782219L), u24.m);
                    h70.a(ak7.I(L, 0.5f, hv.c(4282865001L), z16.b(1.5f)), xq2Var3, r5);
                    vs0 vs0Var7 = vs0Var;
                    a74 S = ge7.S(vs0Var7.n(x64Var, d90.d0), RecyclerView.B1, RecyclerView.B1, 20.0f, RecyclerView.B1, 11);
                    l26 a9 = k26.a(new gu(8.0f, r3, new i((int) r3)), d40Var, xq2Var3, 54);
                    int hashCode8 = Long.hashCode(ge7.C(xq2Var3));
                    xv4 z5 = xq2Var3.z();
                    a74 E9 = l.E(xq2Var3, S);
                    iy0 b3 = ix0.b();
                    xq2Var3.f0();
                    if (xq2Var3.D()) {
                        xq2Var3.k(b3);
                    } else {
                        xq2Var3.o0();
                    }
                    yh2.K(xq2Var3, ix0.d(), a9);
                    yh2.K(xq2Var3, ix0.f(), z5);
                    yh2.K(xq2Var3, ix0.c(), Integer.valueOf(hashCode8));
                    yh2.F(xq2Var3, ix0.a());
                    yh2.K(xq2Var3, ix0.e(), E9);
                    l26 a10 = k26.a(new gu(2.0f, r3, new i((int) r3)), d40Var, xq2Var3, 54);
                    int hashCode9 = Long.hashCode(ge7.C(xq2Var3));
                    xv4 z6 = xq2Var3.z();
                    a74 E10 = l.E(xq2Var3, x64Var);
                    iy0 b4 = ix0.b();
                    xq2Var3.f0();
                    if (xq2Var3.D()) {
                        xq2Var3.k(b4);
                    } else {
                        xq2Var3.o0();
                    }
                    yh2.K(xq2Var3, ix0.d(), a10);
                    yh2.K(xq2Var3, ix0.f(), z6);
                    i61.x(xq2Var3, Integer.valueOf(hashCode9), xq2Var3, xq2Var3, E10);
                    L2 = vy7.L(u24.g(dj6.i(x64Var, 6.0f), z16.c()), kt0.c(((Number) h3.R.getValue()).floatValue(), hv.c(4294286859L)), u24.m);
                    h70.a(nj2.E(L2, 6.0f, z16.c(), false, 0L, 28), xq2Var3, r5);
                    xq2Var3.r();
                    l26 a11 = k26.a(new gu(2.0f, r3, new i((int) r3)), d40Var, xq2Var3, 54);
                    int hashCode10 = Long.hashCode(ge7.C(xq2Var3));
                    xv4 z7 = xq2Var3.z();
                    a74 E11 = l.E(xq2Var3, x64Var);
                    iy0 b5 = ix0.b();
                    xq2Var3.f0();
                    if (xq2Var3.D()) {
                        xq2Var3.k(b5);
                    } else {
                        xq2Var3.o0();
                    }
                    yh2.K(xq2Var3, ix0.d(), a11);
                    yh2.K(xq2Var3, ix0.f(), z7);
                    i61.x(xq2Var3, Integer.valueOf(hashCode10), xq2Var3, xq2Var3, E11);
                    L3 = vy7.L(u24.g(dj6.i(x64Var, 6.0f), z16.c()), kt0.c(((Number) h2.R.getValue()).floatValue(), hv.c(4279286145L)), u24.m);
                    h70.a(nj2.E(L3, 6.0f, z16.c(), false, 0L, 28), xq2Var3, r5);
                    xq2Var3.r();
                    xq2Var3.r();
                    xq2Var3.r();
                    a74 j12 = dj6.j(g04.M(x64Var, Q7, Q6), Q8, Q9);
                    e34 d6 = h70.d(e40Var2, r5);
                    int hashCode11 = Long.hashCode(ge7.C(xq2Var3));
                    xv4 z8 = xq2Var3.z();
                    a74 E12 = l.E(xq2Var3, j12);
                    iy0 b6 = ix0.b();
                    xq2Var3.f0();
                    if (xq2Var3.D()) {
                        xq2Var3.k(b6);
                    } else {
                        xq2Var3.o0();
                    }
                    yh2.K(xq2Var3, ix0.d(), d6);
                    yh2.K(xq2Var3, ix0.f(), z8);
                    i61.x(xq2Var3, Integer.valueOf(hashCode11), xq2Var3, xq2Var3, E12);
                    lc2 lc2Var2 = dj6.c;
                    x64Var.d(lc2Var2);
                    long j13 = j8;
                    boolean e4 = xq2Var3.e(j13);
                    Object P2 = xq2Var3.P();
                    if (e4 || P2 == vs0Var3) {
                        P2 = new t4(7, j13);
                        xq2Var3.l0(P2);
                    }
                    ak7.j(lc2Var2, (qn2) P2, xq2Var3, 6);
                    xq2Var3.r();
                    a74 I3 = ak7.I(vy7.J(vs0Var7.n(dj6.e(dj6.d(x64Var), 20.0f), d90.f0), d90.m(hf.c0(kt0.a(j6), kt0.a(j7)), RecyclerView.B1, RecyclerView.B1, 14)), 1.0f, kt0.c(0.7f, xd5.p()), jy2Var);
                    e34 d7 = h70.d(e40Var4, r5);
                    int hashCode12 = Long.hashCode(ge7.C(xq2Var3));
                    xv4 z9 = xq2Var3.z();
                    a74 E13 = l.E(xq2Var3, I3);
                    iy0 b7 = ix0.b();
                    xq2Var3.f0();
                    if (xq2Var3.D()) {
                        xq2Var3.k(b7);
                    } else {
                        xq2Var3.o0();
                    }
                    yh2.K(xq2Var3, ix0.d(), d7);
                    yh2.K(xq2Var3, ix0.f(), z9);
                    i61.x(xq2Var3, Integer.valueOf(hashCode12), xq2Var3, xq2Var3, E13);
                    a74 Q12 = ge7.Q(dj6.d(x64Var), 24.0f, RecyclerView.B1, 2);
                    l26 a12 = k26.a(vs0Var2, d40Var, xq2Var3, 54);
                    int hashCode13 = Long.hashCode(ge7.C(xq2Var3));
                    xv4 z10 = xq2Var3.z();
                    a74 E14 = l.E(xq2Var3, Q12);
                    iy0 b8 = ix0.b();
                    xq2Var3.f0();
                    if (xq2Var3.D()) {
                        xq2Var3.k(b8);
                    } else {
                        xq2Var3.o0();
                    }
                    yh2.K(xq2Var3, ix0.d(), a12);
                    yh2.K(xq2Var3, ix0.f(), z10);
                    yh2.K(xq2Var3, ix0.c(), Integer.valueOf(hashCode13));
                    yh2.F(xq2Var3, ix0.a());
                    yh2.K(xq2Var3, ix0.e(), E14);
                    long c2 = kt0.c(0.35f, xd5.q());
                    xq2Var = xq2Var3;
                    long E15 = hi2.E(8);
                    oj2 oj2Var = oj2.B;
                    x37.b("MIC ⦿", null, c2, E15, nj2.p(), null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 200070, 0, 131026);
                    x37.b("☊ HEADPHONES", null, kt0.c(0.35f, xd5.q()), hi2.E(8), nj2.p(), null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 200070, 0, 131026);
                    xq2Var.r();
                    xq2Var.r();
                    xq2Var.s();
                } else {
                    x64Var = x64Var2;
                    xq2Var3.b0(-197367972);
                    i(j2, j3, j4, str, ((Number) h2.R.getValue()).floatValue(), ((Number) h3.R.getValue()).floatValue(), xq2Var3, 0);
                    xq2Var = xq2Var3;
                    xq2Var.s();
                }
                xq2Var.r();
            } else {
                vi6Var = new vi6(new kt0(hv.c(4294047225L)), new kt0(hv.c(4293060848L)), new kt0(hv.c(4291548641L)), new kt0(hv.b(1435804600)), new kt0(hv.c(2868903935L)), "Nintendo DS Lite");
            }
            vi6Var2 = vi6Var;
            j2 = vi6Var2.a.a;
            j3 = vi6Var2.b.a;
            j4 = vi6Var2.c.a;
            final long j92 = vi6Var2.d.a;
            final long j102 = vi6Var2.e.a;
            lc2 lc2Var3 = dj6.c;
            e40 e40Var22 = d90.L;
            e40 e40Var32 = e40Var;
            e34 d22 = h70.d(e40Var22, false);
            int hashCode14 = Long.hashCode(xq2Var3.T);
            xv4 l22 = xq2Var3.l();
            a74 E22 = l.E(xq2Var3, lc2Var3);
            jx0.i.getClass();
            iy0 iy0Var22 = ix0.b;
            xq2Var3.f0();
            if (!xq2Var3.S) {
            }
            pn pnVar5 = ix0.f;
            yh2.K(xq2Var3, pnVar5, d22);
            pn pnVar22 = ix0.e;
            yh2.K(xq2Var3, pnVar22, l22);
            Integer valueOf2 = Integer.valueOf(hashCode14);
            pn pnVar32 = ix0.g;
            yh2.K(xq2Var3, pnVar32, valueOf2);
            ne neVar2 = ix0.h;
            yh2.F(xq2Var3, neVar2);
            pn pnVar42 = ix0.d;
            yh2.K(xq2Var3, pnVar42, E22);
            vs0 vs0Var42 = vs0.Y;
            x64Var2 = x64.a;
            str = vi6Var2.f;
            if (rect == null) {
            }
            x64Var = x64Var2;
            xq2Var3.b0(-197367972);
            i(j2, j3, j4, str, ((Number) h2.R.getValue()).floatValue(), ((Number) h3.R.getValue()).floatValue(), xq2Var3, 0);
            xq2Var = xq2Var3;
            xq2Var.s();
            xq2Var.r();
        } else {
            xq2Var = xq2Var2;
            xq2Var.V();
            x64Var = a74Var;
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.e(new p4(c11Var, rect, rect2, x64Var, i2, 3));
        }
    }

    public static final void g(final a74 a74Var, final lw lwVar, final String str, final ic icVar, final z31 z31Var, final float f2, px0 px0Var, final int i2) {
        int i3;
        a74 a74Var2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(777774312);
        if ((i2 & 14) == 0) {
            if (xq2Var.f(a74Var)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i3 = i11 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            if (xq2Var.f(lwVar)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i3 |= i10;
        }
        if ((i2 & 896) == 0) {
            if (xq2Var.f(str)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i3 |= i9;
        }
        if ((i2 & 7168) == 0) {
            if (xq2Var.f(icVar)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i3 |= i8;
        }
        if ((57344 & i2) == 0) {
            if (xq2Var.f(z31Var)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        }
        if ((458752 & i2) == 0) {
            if (xq2Var.c(f2)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i3 |= i6;
        }
        if ((3670016 & i2) == 0) {
            if (xq2Var.f(null)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i3 |= i5;
        }
        if ((29360128 & i2) == 0) {
            if (xq2Var.g(true)) {
                i4 = 8388608;
            } else {
                i4 = Compress.MAXWINSIZE;
            }
            i3 |= i4;
        }
        if ((i3 & 23967451) == 4793490 && xq2Var.E()) {
            xq2Var.V();
        } else {
            ve5 ve5Var = dk7.b;
            if (str != null) {
                a74Var2 = ua6.a(a74Var, false, new c70(str, 18));
            } else {
                a74Var2 = a74Var;
            }
            a74 d2 = u24.h(a74Var2).d(new u31(lwVar, icVar, z31Var, f2));
            fc fcVar = fc.f;
            xq2Var.c0(544976794);
            int B2 = ge7.B(xq2Var);
            a74 E2 = l.E(xq2Var, d2);
            xv4 l2 = xq2Var.l();
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.c0(1405779621);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(new pj(iy0Var, 3));
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, fcVar);
            yh2.K(xq2Var, ix0.e, l2);
            yh2.K(xq2Var, ix0.d, E2);
            pn pnVar = ix0.g;
            if (xq2Var.S || !nb3.k(xq2Var.P(), Integer.valueOf(B2))) {
                i61.v(B2, xq2Var, B2, pnVar);
            }
            i61.y(xq2Var, true, false, false);
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.d = new eo2() { // from class: cw
                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    f04.g(a74.this, lwVar, str, icVar, z31Var, f2, (px0) obj, ii2.a0(i2 | 1));
                    return jg7.a;
                }
            };
        }
    }

    public static th1 h() {
        return new th1(1.0f, 1.0f);
    }

    public static final void i(final long j2, final long j3, final long j4, final String str, final float f2, final float f3, px0 px0Var, final int i2) {
        int i3;
        int i4;
        int i5;
        boolean z2;
        xq2 xq2Var;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(-67021319);
        if (xq2Var2.e(j2)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        if (xq2Var2.e(j3)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (xq2Var2.f(str)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i8 = i7 | i5;
        if ((i8 & 1043) != 1042) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var2.S(i8 & 1, z2)) {
            a74 J = vy7.J(dj6.e(dj6.c(x64.a, 1.0f), 24.0f), d90.m(hf.c0(new kt0(j2), new kt0(j3)), RecyclerView.B1, RecyclerView.B1, 14));
            e34 d2 = h70.d(d90.Z, false);
            int hashCode = Long.hashCode(xq2Var2.T);
            xv4 l2 = xq2Var2.l();
            a74 E2 = l.E(xq2Var2, J);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, ix0.f, d2);
            yh2.K(xq2Var2, ix0.e, l2);
            yh2.K(xq2Var2, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var2, ix0.h);
            yh2.K(xq2Var2, ix0.d, E2);
            x37.b(str, null, kt0.c(0.45f, kt0.d), hi2.E(10), oj2.e0, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, ((i8 >> 9) & 14) | 200064, 0, 131026);
            xq2Var = xq2Var2;
            xq2Var.p(true);
        } else {
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.d = new eo2(j2, j3, j4, str, f2, f3, i2) { // from class: z01
                public final /* synthetic */ long A;
                public final /* synthetic */ long B;
                public final /* synthetic */ long L;
                public final /* synthetic */ String R;
                public final /* synthetic */ float X;
                public final /* synthetic */ float Y;

                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int a0 = ii2.a0(1);
                    f04.i(this.A, this.B, this.L, this.R, this.X, this.Y, (px0) obj, a0);
                    return jg7.a;
                }
            };
        }
    }

    public static final void j(boolean z2, boolean z3, on2 on2Var, on2 on2Var2, px0 px0Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z4;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(656229677);
        if (xq2Var.g(z2)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i2 | i3;
        if (xq2Var.g(z3)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4;
        if (xq2Var.h(on2Var)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i9 = i8 | i5;
        if (xq2Var.h(on2Var2)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i10 = i9 | i6;
        if ((i10 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (xq2Var.S(i10 & 1, z4)) {
            es7 F2 = bl2.F(xq2Var);
            ej2.c(dj6.c, null, F2.b, 0L, RecyclerView.B1, n16.I(-1652497039, new vo4(F2, on2Var, z3, z2, on2Var2), xq2Var), xq2Var, 1572870, 58);
        } else {
            xq2Var.V();
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.d = new xf4(z2, z3, on2Var, on2Var2, i2);
        }
    }

    public static final void k(a74 a74Var, zv0 zv0Var, px0 px0Var, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(2064964257);
        if ((i2 & 6) == 0) {
            if (xq2Var.f(a74Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (xq2Var.h(zv0Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var.S(i3 & 1, z2)) {
            l(a74Var, zv0Var, xq2Var, ((i3 << 3) & 896) | (i3 & 14) | 48);
        } else {
            xq2Var.V();
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.d = new im(a74Var, zv0Var, i2, 0);
        }
    }

    public static final void l(a74 a74Var, zv0 zv0Var, px0 px0Var, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(771959668);
        if ((i2 & 6) == 0) {
            if (xq2Var.f(a74Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (xq2Var.h(null)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.h(zv0Var)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var.S(i3 & 1, z2)) {
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                vs4 vs4Var = new vs4(null, vs0.j0);
                xq2Var.l0(vs4Var);
                P = vs4Var;
            }
            qa4 qa4Var = (qa4) P;
            Object P2 = xq2Var.P();
            if (P2 == vs0Var) {
                P2 = new f4(qa4Var, 3);
                xq2Var.l0(P2);
            }
            hv.d(v07.b.a(L((on2) P2, xq2Var, 0)), n16.I(-291176396, new x3(a74Var, qa4Var, zv0Var, 3), xq2Var), xq2Var, 56);
        } else {
            xq2Var.V();
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.d = new im(a74Var, zv0Var, i2, 1);
        }
    }

    public static final void m(c11 c11Var, px0 px0Var, int i2) {
        boolean z2;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1808230142);
        int i3 = i2 & 1;
        if (i3 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var.S(i3, z2)) {
            l26 a2 = k26.a(new gu(3.0f, true, new i(1)), d90.i0, xq2Var, 54);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            x64 x64Var = x64.a;
            a74 E2 = l.E(xq2Var, x64Var);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, a2);
            yh2.K(xq2Var, ix0.e, l2);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E2);
            xq2Var.b0(-1259531792);
            for (int i4 = 0; i4 < 3; i4++) {
                a74 i5 = dj6.i(x64Var, 3.0f);
                y16 y16Var = z16.a;
                h70.a(ak7.I(vy7.L(u24.g(i5, y16Var), hv.c(4278782219L), u24.m), 0.5f, hv.c(4282865001L), y16Var), xq2Var, 0);
            }
            xq2Var.p(false);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.d = new a11(c11Var, i2, 0);
        }
    }

    public static final int n(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static le2 o(le2 le2Var, int i2) {
        m80 m80Var = m80.SUSPEND;
        if (i2 < 0 && i2 != -2 && i2 != -1) {
            i.f(lb1.g(i2, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
            return null;
        }
        if (i2 == -1) {
            m80Var = m80.DROP_OLDEST;
            i2 = 0;
        }
        int i3 = i2;
        m80 m80Var2 = m80Var;
        if (le2Var instanceof ro2) {
            return qo2.y((ro2) le2Var, null, i3, m80Var2, 1);
        }
        return new yl0(le2Var, null, i3, m80Var2, 2);
    }

    public static final pb0 p(eo2 eo2Var) {
        return new pb0(eo2Var, vt1.A, -2, m80.SUSPEND);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0081  */
    /* JADX WARN: Type inference failed for: r8v2, types: [dh5, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable q(le2 le2Var, ne2 ne2Var, s41 s41Var) {
        ef2 ef2Var;
        int i2;
        dh5 dh5Var;
        Throwable th;
        rc3 rc3Var;
        CancellationException v2;
        if (s41Var instanceof ef2) {
            ef2 ef2Var2 = (ef2) s41Var;
            int i3 = ef2Var2.Y;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ef2Var2.Y = i3 - Integer.MIN_VALUE;
                ef2Var = ef2Var2;
                Object obj = ef2Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i2 = ef2Var.Y;
                if (i2 == 0) {
                    if (i2 == 1) {
                        dh5Var = ef2Var.R;
                        try {
                            oi2.Y(obj);
                        } catch (Throwable th2) {
                            th = th2;
                            th = (Throwable) dh5Var.A;
                            if (th != null || !th.equals(th)) {
                                l61 l61Var = ef2Var.B;
                                l61Var.getClass();
                                rc3Var = (rc3) l61Var.Z(vs0.h0);
                                if (rc3Var != null || !rc3Var.isCancelled() || (v2 = rc3Var.v()) == null || !v2.equals(th)) {
                                    if (th != null) {
                                        return th;
                                    }
                                    if (th instanceof CancellationException) {
                                        mb3.q(th, th);
                                        throw th;
                                    }
                                    mb3.q(th, th);
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    ?? obj2 = new Object();
                    try {
                        ne2 zb0Var = new zb0(6, ne2Var, obj2);
                        ef2Var.R = obj2;
                        ef2Var.Y = 1;
                        if (le2Var.b(zb0Var, ef2Var) == x61Var) {
                            return x61Var;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        dh5Var = obj2;
                        th = (Throwable) dh5Var.A;
                        if (th != null) {
                        }
                        l61 l61Var2 = ef2Var.B;
                        l61Var2.getClass();
                        rc3Var = (rc3) l61Var2.Z(vs0.h0);
                        if (rc3Var != null) {
                        }
                        if (th != null) {
                        }
                    }
                }
                return null;
            }
        }
        ef2Var = new s41(s41Var);
        Object obj3 = ef2Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i2 = ef2Var.Y;
        if (i2 == 0) {
        }
        return null;
    }

    public static void r(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a75.E, i2, i3);
        boolean z2 = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z2) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                t(context, F, "Theme.MaterialComponents");
            }
        }
        t(context, E, "Theme.AppCompat");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r0.getResourceId(0, -1) != (-1)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void s(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a75.E, i2, i3);
        boolean z2 = false;
        if (!obtainStyledAttributes.getBoolean(2, false)) {
            obtainStyledAttributes.recycle();
        } else if (iArr2.length != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
            for (int i4 : iArr2) {
                if (obtainStyledAttributes2.getResourceId(i4, -1) == -1) {
                    obtainStyledAttributes2.recycle();
                    break;
                }
            }
            obtainStyledAttributes2.recycle();
            z2 = true;
            obtainStyledAttributes.recycle();
            if (z2) {
                return;
            }
            i.h("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    public static void t(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (!obtainStyledAttributes.hasValue(i2)) {
                obtainStyledAttributes.recycle();
                i.h(lb1.A("The style on this component requires your app theme to be ", str, " (or a descendant)."));
                return;
            }
        }
        obtainStyledAttributes.recycle();
    }

    public static String u(String str) {
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -2061550653:
                if (!str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return null;
                }
                return "kotlin.Double.Companion";
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "kotlin.Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "kotlin.Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "kotlin.Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "kotlin.Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "kotlin.collections.Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "kotlin.collections.Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "kotlin.Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "kotlin.Byte.Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "kotlin.CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "kotlin.collections.Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "kotlin.Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "kotlin.Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "kotlin.Char.Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "kotlin.Long.Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "kotlin.collections.Map.Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "kotlin.Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "kotlin.Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "kotlin.Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "kotlin.collections.List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "kotlin.Short.Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "kotlin.Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "kotlin.Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "kotlin.Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "kotlin.Enum.Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "kotlin.Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "kotlin.Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "kotlin.Float.Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "kotlin.collections.Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "kotlin.collections.ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "kotlin.String.Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "kotlin.Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "kotlin.Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "kotlin.Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "kotlin.String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "kotlin.collections.Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "kotlin.Boolean.Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "kotlin.Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "kotlin.Int.Companion";
                }
                return null;
            default:
                switch (hashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (hashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (hashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static final Object v(le2 le2Var, eo2 eo2Var, r41 r41Var) {
        int i2 = of2.a;
        Object b2 = o(V(le2Var, new o12(eo2Var, (r41) null, 1)), 0).b(rg4.A, r41Var);
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        jg7 jg7Var = jg7.a;
        if (b2 != x61Var) {
            b2 = jg7Var;
        }
        if (b2 == x61Var) {
            return b2;
        }
        return jg7Var;
    }

    public static final long w(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        int read = inputStream.read(bArr);
        long j2 = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j2 += read;
            read = inputStream.read(bArr);
        }
        return j2;
    }

    public static final le2 x(le2 le2Var, long j2) {
        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i2 >= 0) {
            if (i2 == 0) {
                return le2Var;
            }
            return new g21(new ue2(new t4(9, j2), le2Var, null), 3);
        }
        i.h("Debounce timeout should not be negative");
        return null;
    }

    public static String y(cf0 cf0Var, Integer num) {
        if (num != null) {
            try {
                if (num.intValue() == 1) {
                    xf0.a("0");
                    lg0 b2 = cf0.b(cf0Var, "0");
                    CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
                    key.getClass();
                    Integer num2 = (Integer) ((qc0) b2).c(key);
                    if (num2 != null && num2.intValue() == 1) {
                        return "1";
                    }
                } else if (num.intValue() == 0) {
                    xf0.a("1");
                    lg0 b3 = cf0.b(cf0Var, "1");
                    CameraCharacteristics.Key key2 = CameraCharacteristics.LENS_FACING;
                    key2.getClass();
                    Integer num3 = (Integer) ((qc0) b3).c(key2);
                    if (num3 != null && num3.intValue() == 0) {
                        return "0";
                    }
                }
                return null;
            } catch (xl1 unused) {
                if (kj2.G()) {
                    Log.e("CXCP", "Received Do Not Disturb exception while deciding camera id to skip. Please turn off Do Not Disturb mode");
                    return null;
                }
                return null;
            }
        }
        return null;
    }

    public static final le2 z(le2 le2Var) {
        if (le2Var instanceof rp6) {
            return le2Var;
        }
        return lb4.s(le2Var, lb4.i);
    }
}
