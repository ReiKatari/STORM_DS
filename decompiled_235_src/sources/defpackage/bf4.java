package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.textclassifier.TextClassifier;
import androidx.preference.SwitchPreference;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.stormds.emulator.R;
import java.io.InputStream;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bf4  reason: default package */
/* loaded from: classes.dex */
public final class bf4 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public Object Z;
    public final /* synthetic */ Object d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bf4(Object obj, Object obj2, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = obj;
        this.d0 = obj2;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                return ((bf4) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 1:
                return ((bf4) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 2:
                return ((bf4) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 3:
                return ((bf4) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 4:
                return ((bf4) q((r41) obj2, (ne2) obj)).s(jg7Var);
            case 5:
                return ((bf4) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 6:
                return ((bf4) q((r41) obj2, (r35) obj)).s(jg7Var);
            case 7:
                return ((bf4) q((r41) obj2, (lh0) obj)).s(jg7Var);
            case 8:
                return ((bf4) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 9:
                return ((bf4) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 10:
                return ((bf4) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 11:
                return ((bf4) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 12:
                return ((bf4) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 13:
                return ((bf4) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 14:
                return ((bf4) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 15:
                return ((bf4) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 16:
                return ((bf4) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 17:
                return ((bf4) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 18:
                return ((bf4) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 19:
                return ((bf4) q((r41) obj2, (ne2) obj)).s(jg7Var);
            case 20:
                return ((bf4) q((r41) obj2, (w61) obj)).s(jg7Var);
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return ((bf4) q((r41) obj2, (Uri) obj)).s(jg7Var);
            case 22:
                return ((bf4) q((r41) obj2, (w61) obj)).s(jg7Var);
            case ConnectionResult.API_DISABLED /* 23 */:
                return ((bf4) q((r41) obj2, (w61) obj)).s(jg7Var);
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                return ((bf4) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 25:
                return ((bf4) q((r41) obj2, (w61) obj)).s(jg7Var);
            case SubAllocator.N4 /* 26 */:
                return ((bf4) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 27:
                return ((bf4) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 28:
                return ((bf4) q((r41) obj2, (w61) obj)).s(jg7Var);
            default:
                return ((bf4) q((r41) obj2, (w61) obj)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        Object obj2 = this.d0;
        switch (i) {
            case 0:
                return new bf4((cf4) this.Z, (r35) obj2, r41Var, 0);
            case 1:
                return new bf4((ng4) this.Z, (eo2) obj2, r41Var, 1);
            case 2:
                bf4 bf4Var = new bf4((ul0) obj2, r41Var, 2);
                bf4Var.Z = obj;
                return bf4Var;
            case 3:
                return new bf4((eo2) this.Z, (ft4) obj2, r41Var, 3);
            case 4:
                return new bf4((uv4) this.Z, (String) obj2, r41Var, 4);
            case 5:
                return new bf4((TextClassifier) this.Z, (eo2) obj2, r41Var, 5);
            case 6:
                bf4 bf4Var2 = new bf4((SwitchPreference) obj2, r41Var, 6);
                bf4Var2.Z = obj;
                return bf4Var2;
            case 7:
                bf4 bf4Var3 = new bf4((e65) obj2, r41Var, 7);
                bf4Var3.Z = obj;
                return bf4Var3;
            case 8:
                return new bf4((pa) this.Z, obj2, r41Var, 8);
            case 9:
                return new bf4((hb5) this.Z, (l85) obj2, r41Var, 9);
            case 10:
                bf4 bf4Var4 = new bf4((eo2) obj2, r41Var, 10);
                bf4Var4.Z = obj;
                return bf4Var4;
            case 11:
                bf4 bf4Var5 = new bf4((ql) obj2, r41Var, 11);
                bf4Var5.Z = obj;
                return bf4Var5;
            case 12:
                return new bf4((qv5) obj2, r41Var, 12);
            case 13:
                return new bf4((hw5) this.Z, (tp6) obj2, r41Var, 13);
            case 14:
                bf4 bf4Var6 = new bf4((tz5) obj2, r41Var, 14);
                bf4Var6.Z = obj;
                return bf4Var6;
            case 15:
                return new bf4((hn1) this.Z, (e86) obj2, r41Var, 15);
            case 16:
                return new bf4((gf6) this.Z, (io6) obj2, r41Var, 16);
            case 17:
                return new bf4((go1) this.Z, (qa4) obj2, r41Var, 17);
            case 18:
                return new bf4((el6) this.Z, (i2) obj2, r41Var, 18);
            case 19:
                bf4 bf4Var7 = new bf4((yt6) obj2, r41Var, 19);
                bf4Var7.Z = obj;
                return bf4Var7;
            case 20:
                return new bf4((ka0) this.Z, (to) obj2, r41Var, 20);
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                bf4 bf4Var8 = new bf4((lq6) obj2, r41Var, 21);
                bf4Var8.Z = obj;
                return bf4Var8;
            case 22:
                return new bf4((rc3) this.Z, (j25) obj2, r41Var, 22);
            case ConnectionResult.API_DISABLED /* 23 */:
                return new bf4((nc7) this.Z, (on2) obj2, r41Var, 23);
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                return new bf4((qh7) this.Z, (kt) obj2, r41Var, 24);
            case 25:
                return new bf4((qn2) this.Z, (tu0) obj2, r41Var, 25);
            case SubAllocator.N4 /* 26 */:
                return new bf4((le2) this.Z, (pq7) obj2, r41Var, 26);
            case 27:
                return new bf4((qr7) this.Z, (hm4) obj2, r41Var, 27);
            case 28:
                return new bf4((xr7) this.Z, (t26) obj2, r41Var, 28);
            default:
                return new bf4((if5) this.Z, (View) obj2, r41Var, 29);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x025e, code lost:
        if (((defpackage.rc3) r28.Z).c0(r28) == r0) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0513, code lost:
        if (r1.isTouchExplorationEnabled() != false) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x087a, code lost:
        if (r1 == r0) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x0887, code lost:
        if (r1 == r0) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0894, code lost:
        if (r1 == r0) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x08a1, code lost:
        if (r1 == r0) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x08a4, code lost:
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x08a5, code lost:
        if (r1 != r0) goto L440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:?, code lost:
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:?, code lost:
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:258:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:526:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.concurrent.CancellationException] */
    /* JADX WARN: Type inference failed for: r2v10, types: [rc3] */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6, types: [rc3] */
    /* JADX WARN: Type inference failed for: r2v71 */
    /* JADX WARN: Type inference failed for: r2v72 */
    /* JADX WARN: Type inference failed for: r6v36, types: [g23, java.lang.Object] */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        Object o;
        Object f;
        Object d0;
        Object n;
        float f2;
        boolean z;
        long j;
        rj0 rj0Var;
        Bitmap bitmap;
        int i;
        float width;
        ImageDecoder.Source createSource;
        Bitmap decodeBitmap;
        Object b;
        Object g;
        Object h;
        Object value;
        pr7 pr7Var;
        String localizedMessage;
        Object value2;
        Uri uri;
        InputStream openInputStream;
        int i2 = this.X;
        int i3 = 7;
        int i4 = 0;
        int i5 = 2;
        jg7 jg7Var = jg7.a;
        Object obj2 = this.d0;
        ?? r1 = 0;
        r1 = null;
        r1 = null;
        r1 = null;
        Bitmap bitmap2 = null;
        switch (i2) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i6 = this.Y;
                if (i6 != 0) {
                    if (i6 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    this.Y = 1;
                    if (q60.t(1000L, this) == x61Var) {
                        return x61Var;
                    }
                }
                ga0.f().b(zv7.a, "NetworkRequestConstraintController didn't receive neither onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after 1000 ms");
                ((r35) obj2).c(new w21(7));
                return jg7Var;
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i7 = this.Y;
                if (i7 != 0) {
                    if (i7 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                this.Y = 1;
                if (((ng4) this.Z).a.f(xa4.UserInput, (eo2) obj2, this) == x61Var2) {
                    return x61Var2;
                }
                return jg7Var;
            case 2:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                ?? r2 = this.Y;
                try {
                    if (r2 != 0) {
                        if (r2 == 1) {
                            rc3 rc3Var = (rc3) this.Z;
                            oi2.Y(obj);
                            o = obj;
                            r2 = rc3Var;
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        ap6 L = hv.L((w61) this.Z, null, null, new td4(2, null, 1), 3);
                        this.Z = L;
                        this.Y = 1;
                        o = ((ul0) obj2).o(this);
                        r2 = L;
                        if (o == x61Var3) {
                            return x61Var3;
                        }
                    }
                    r2.h(null);
                    r1 = o;
                    return r1;
                } catch (Throwable th) {
                    r2.h(r1);
                    throw th;
                }
            case 3:
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                int i8 = this.Y;
                if (i8 != 0) {
                    if (i8 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                this.Y = 1;
                Object o2 = ((eo2) this.Z).o((ft4) obj2, this);
                if (o2 == x61Var4) {
                    return x61Var4;
                }
                return o2;
            case 4:
                x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                int i9 = this.Y;
                if (i9 != 0) {
                    if (i9 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                this.Y = 1;
                if (((uv4) this.Z).b.a((String) obj2, this) == x61Var5) {
                    return x61Var5;
                }
                return jg7Var;
            case 5:
                x61 x61Var6 = x61.COROUTINE_SUSPENDED;
                int i10 = this.Y;
                if (i10 != 0) {
                    if (i10 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                TextClassifier textClassifier = (TextClassifier) this.Z;
                if (textClassifier == null) {
                    return null;
                }
                this.Y = 1;
                Object o3 = ((eo2) obj2).o(textClassifier, this);
                if (o3 == x61Var6) {
                    return x61Var6;
                }
                return o3;
            case 6:
                SwitchPreference switchPreference = (SwitchPreference) obj2;
                r35 r35Var = (r35) this.Z;
                x61 x61Var7 = x61.COROUTINE_SUSPENDED;
                int i11 = this.Y;
                if (i11 != 0) {
                    if (i11 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                r35Var.getClass();
                r35Var.c(Boolean.valueOf(switchPreference.A));
                zw zwVar = new zw(r35Var, 3);
                yh2.g(switchPreference, zwVar);
                ci2 ci2Var = new ci2(17, switchPreference, zwVar);
                this.Z = null;
                this.Y = 1;
                if (kj2.q(r35Var, ci2Var, this) == x61Var7) {
                    return x61Var7;
                }
                return jg7Var;
            case 7:
                x61 x61Var8 = x61.COROUTINE_SUSPENDED;
                int i12 = this.Y;
                if (i12 != 0) {
                    if (i12 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    oi2.Y(obj);
                    lh0 lh0Var = (lh0) this.Z;
                    e65 e65Var = (e65) obj2;
                    this.Y = 1;
                    if (lh0Var instanceof al5) {
                        f = e65Var.h((al5) lh0Var, this);
                        break;
                    } else if (lh0Var instanceof pk5) {
                        f = e65Var.e((pk5) lh0Var, this);
                        break;
                    } else if (lh0Var instanceof rk5) {
                        f = e65Var.g((rk5) lh0Var, this);
                        break;
                    } else if (lh0Var instanceof qk5) {
                        f = e65Var.f((qk5) lh0Var, this);
                        break;
                    } else {
                        i.d();
                    }
                }
                return null;
            case 8:
                x61 x61Var9 = x61.COROUTINE_SUSPENDED;
                int i13 = this.Y;
                if (i13 != 0) {
                    if (i13 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                Log.d("CXCP", "PruningProcessingQueue: Processing " + obj2);
                this.Y = 1;
                if (((bf4) ((pa) this.Z).R).o(obj2, this) == x61Var9) {
                    return x61Var9;
                }
                return jg7Var;
            case 9:
                x61 x61Var10 = x61.COROUTINE_SUSPENDED;
                int i14 = this.Y;
                if (i14 != 0) {
                    if (i14 == 1) {
                        oi2.Y(obj);
                        d0 = obj;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    hb5 hb5Var = (hb5) this.Z;
                    if (hb5Var == null) {
                        return null;
                    }
                    hk hkVar = ((l85) obj2).c;
                    String str = hb5Var.a;
                    String str2 = hb5Var.b;
                    this.Y = 1;
                    xe1 xe1Var = xk1.a;
                    d0 = hv.d0(de1.L, new gk(hkVar, str, str2, null, 1), this);
                    if (d0 == x61Var10) {
                        return x61Var10;
                    }
                }
                Boolean bool = (Boolean) d0;
                bool.getClass();
                return bool;
            case 10:
                x61 x61Var11 = x61.COROUTINE_SUSPENDED;
                int i15 = this.Y;
                if (i15 != 0) {
                    if (i15 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                eo2 eo2Var = (eo2) obj2;
                this.Y = 1;
                if (eo2Var.o((w61) this.Z, this) == x61Var11) {
                    return x61Var11;
                }
                return jg7Var;
            case 11:
                x61 x61Var12 = x61.COROUTINE_SUSPENDED;
                int i16 = this.Y;
                if (i16 != 0) {
                    if (i16 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                ql qlVar = (ql) obj2;
                of6 of6Var = qlVar.k0.a;
                zb0 zb0Var = new zb0(15, qlVar, (w61) this.Z);
                this.Y = 1;
                of6Var.getClass();
                if (of6.m(of6Var, zb0Var, this) == x61Var12) {
                    return x61Var12;
                }
                return jg7Var;
            case 12:
                qv5 qv5Var = (qv5) obj2;
                tp6 tp6Var = qv5Var.o;
                x61 x61Var13 = x61.COROUTINE_SUSPENDED;
                int i17 = this.Y;
                if (i17 != 0) {
                    if (i17 == 1) {
                        tp6Var = (tp6) this.Z;
                        oi2.Y(obj);
                        n = obj;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    boolean z2 = ((oi4) tp6Var.getValue()).g;
                    this.Z = tp6Var;
                    this.Y = 1;
                    n = qv5.n(qv5Var, z2, this);
                    if (n == x61Var13) {
                        return x61Var13;
                    }
                }
                tp6Var.l(n);
                return jg7Var;
            case 13:
                hw5 hw5Var = (hw5) this.Z;
                kd6 kd6Var = hw5Var.d;
                x61 x61Var14 = x61.COROUTINE_SUSPENDED;
                int i18 = this.Y;
                if (i18 != 0) {
                    if (i18 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                ng6 ng6Var = (ng6) kd6Var;
                ng6Var.getClass();
                wp0 p = ng6Var.p("video_renderer", new tf6(ng6Var, 16));
                ng6 ng6Var2 = (ng6) kd6Var;
                ng6Var2.getClass();
                wp0 p2 = ng6Var2.p("enable_threaded_rendering", new tf6(ng6Var2, 10));
                ng6 ng6Var3 = (ng6) kd6Var;
                ng6Var3.getClass();
                wp0 p3 = ng6Var3.p("video_internal_resolution", new tf6(ng6Var3, 3));
                ng6 ng6Var4 = (ng6) kd6Var;
                ng6Var4.getClass();
                wp0 wp0Var = new wp0(5, new le2[]{p, p2, p3, ng6Var4.p("video_filtering", new tf6(ng6Var4, 2))}, new hw6(5, null));
                ng6 ng6Var5 = (ng6) kd6Var;
                wp0 wp0Var2 = new wp0(4, new le2[]{((ng6) kd6Var).F(), ((ng6) kd6Var).E(), new wp0(9, ng6Var5.G(), ng6Var5)}, new hw6(4, null));
                ng6 ng6Var6 = (ng6) kd6Var;
                ng6Var6.getClass();
                wp0 p4 = ng6Var6.p("console_type", new vf6(ng6Var6, 5));
                ng6 ng6Var7 = (ng6) kd6Var;
                ng6Var7.getClass();
                xf2 xf2Var = new xf2(p4, ng6Var7.p("mic_source", new tf6(ng6Var7, 29)), new m02(3, null, 2));
                tp6 tp6Var2 = hw5Var.h;
                ng6 ng6Var8 = (ng6) kd6Var;
                ng6Var8.getClass();
                wp0 p5 = ng6Var8.p("ra_enabled", new vf6(ng6Var8, 10));
                ew5 ew5Var = new ew5(hw5Var, null);
                le2[] le2VarArr = {tp6Var2, xf2Var, wp0Var, wp0Var2, p5};
                y6 y6Var = new y6((tp6) obj2, 14);
                this.Y = 1;
                Object o4 = nb3.o(this, y6Var, jz.R, new o12((r41) null, (ao2) ew5Var, 4), le2VarArr);
                if (o4 != x61.COROUTINE_SUSPENDED) {
                    o4 = jg7Var;
                }
                if (o4 == x61Var14) {
                    return x61Var14;
                }
                return jg7Var;
            case 14:
                tz5 tz5Var = (tz5) obj2;
                w61 w61Var = (w61) this.Z;
                x61 x61Var15 = x61.COROUTINE_SUSPENDED;
                int i19 = this.Y;
                if (i19 != 0) {
                    if (i19 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                ng6 ng6Var9 = (ng6) tz5Var.c;
                ng6Var9.getClass();
                le2 z3 = f04.z(ng6Var9.p("rom_search_dirs", new vf6(ng6Var9, 11)));
                bz5 bz5Var = new bz5(tz5Var, w61Var);
                this.Z = null;
                this.Y = 1;
                if (z3.b(bz5Var, this) == x61Var15) {
                    return x61Var15;
                }
                return jg7Var;
            case 15:
                x61 x61Var16 = x61.COROUTINE_SUSPENDED;
                int i20 = this.Y;
                if (i20 != 0) {
                    if (i20 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                hn1 hn1Var = (hn1) this.Z;
                if (hn1Var.b) {
                    f2 = -1.0f;
                } else {
                    f2 = 1.0f;
                }
                m86 m86Var = ((e86) obj2).J0;
                long f3 = ol7.f(f2, hn1Var.a);
                this.Y = 1;
                if (m86Var.b(f3, false, this) == x61Var16) {
                    return x61Var16;
                }
                return jg7Var;
            case 16:
                x61 x61Var17 = x61.COROUTINE_SUSPENDED;
                int i21 = this.Y;
                if (i21 != 0) {
                    if (i21 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                this.Y = 1;
                if (gn.c(((gf6) this.Z).f, new jk4(0L), (io6) obj2, null, this, 12) == x61Var17) {
                    return x61Var17;
                }
                return jg7Var;
            case 17:
                x61 x61Var18 = x61.COROUTINE_SUSPENDED;
                int i22 = this.Y;
                if (i22 != 0) {
                    if (i22 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    xa4 xa4Var = xa4.UserInput;
                    m8 m8Var = new m8(2, null, 8);
                    this.Y = 1;
                    if (((go1) this.Z).b(xa4Var, m8Var, this) == x61Var18) {
                        return x61Var18;
                    }
                }
                ((qn2) ((qa4) obj2).getValue()).g(new Float((float) RecyclerView.B1));
                return jg7Var;
            case 18:
                el6 el6Var = (el6) this.Z;
                x61 x61Var19 = x61.COROUTINE_SUSPENDED;
                int i23 = this.Y;
                if (i23 != 0) {
                    if (i23 == 1) {
                        oi2.Y(obj);
                        rj0Var = el6Var.d;
                        if (rj0Var.u() instanceof sg4) {
                            rj0Var.i(ll6.Dismissed);
                            return jg7Var;
                        }
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                if (el6Var != null) {
                    al6 al6Var = el6Var.c;
                    if (el6Var.b != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    i2 i2Var = (i2) obj2;
                    int i24 = dl6.a[al6Var.ordinal()];
                    long j2 = Long.MAX_VALUE;
                    if (i24 != 1) {
                        if (i24 != 2) {
                            if (i24 == 3) {
                                j = 4000;
                            } else {
                                i.d();
                                return null;
                            }
                        } else {
                            j = 10000;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (i2Var != null) {
                        AccessibilityManager accessibilityManager = ((id) i2Var).a;
                        if (j < 2147483647L) {
                            if (!z) {
                                i3 = 3;
                            }
                            if (Build.VERSION.SDK_INT >= 29) {
                                int e = rp.e(accessibilityManager, (int) j, i3);
                                if (e != Integer.MAX_VALUE) {
                                    j2 = e;
                                }
                            } else if (z) {
                                break;
                            }
                            this.Y = 1;
                            if (q60.t(j2, this) == x61Var19) {
                                return x61Var19;
                            }
                            rj0Var = el6Var.d;
                            if (rj0Var.u() instanceof sg4) {
                            }
                        }
                    }
                    j2 = j;
                    this.Y = 1;
                    if (q60.t(j2, this) == x61Var19) {
                    }
                    rj0Var = el6Var.d;
                    if (rj0Var.u() instanceof sg4) {
                    }
                } else {
                    return jg7Var;
                }
            case 19:
                x61 x61Var20 = x61.COROUTINE_SUSPENDED;
                int i25 = this.Y;
                if (i25 != 0) {
                    if (i25 != 1) {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    zb0 zb0Var2 = new zb0(19, new Object(), (ne2) this.Z);
                    this.Y = 1;
                    if (of6.m((yt6) obj2, zb0Var2, this) == x61Var20) {
                        return x61Var20;
                    }
                }
                e41.c();
                return null;
            case 20:
                x61 x61Var21 = x61.COROUTINE_SUSPENDED;
                int i26 = this.Y;
                if (i26 != 0) {
                    if (i26 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                this.Y = 1;
                if (gn.c((gn) ((ka0) this.Z).c, new Float((float) RecyclerView.B1), (to) obj2, null, this, 12) == x61Var21) {
                    return x61Var21;
                }
                return jg7Var;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                lq6 lq6Var = (lq6) obj2;
                Uri uri2 = (Uri) this.Z;
                x61 x61Var22 = x61.COROUTINE_SUSPENDED;
                int i27 = this.Y;
                if (i27 != 0) {
                    if (i27 != 1 && i27 != 2) {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                    return jg7Var;
                }
                oi2.Y(obj);
                if (uri2 == null) {
                    xe1 xe1Var2 = xk1.a;
                    jv2 jv2Var = e04.a;
                    kq6 kq6Var = new kq6(lq6Var, null, 0);
                    this.Z = null;
                    this.Y = 1;
                    if (hv.d0(jv2Var, kq6Var, this) != x61Var22) {
                        return jg7Var;
                    }
                } else {
                    o40 o40Var = lq6Var.c;
                    int i28 = o40Var.a;
                    uri2.getClass();
                    try {
                        switch (i28) {
                            case 0:
                                ParcelFileDescriptor openFileDescriptor = o40Var.b.getContentResolver().openFileDescriptor(uri2, "r");
                                if (openFileDescriptor != null) {
                                    Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(openFileDescriptor.getFileDescriptor());
                                    if (decodeFileDescriptor.getWidth() / decodeFileDescriptor.getHeight() > 1.3333334f) {
                                        width = 480.0f / decodeFileDescriptor.getHeight();
                                    } else {
                                        width = decodeFileDescriptor.getWidth() / 640.0f;
                                    }
                                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeFileDescriptor, u24.E(decodeFileDescriptor.getWidth() * width), u24.E(decodeFileDescriptor.getHeight() * width), true);
                                    createScaledBitmap.getClass();
                                    if (!decodeFileDescriptor.sameAs(createScaledBitmap)) {
                                        createScaledBitmap.recycle();
                                    }
                                    bitmap = Bitmap.createBitmap(createScaledBitmap, (createScaledBitmap.getWidth() - 640) / 2, (createScaledBitmap.getHeight() - 480) / 2, 640, 480);
                                    if (!createScaledBitmap.sameAs(bitmap)) {
                                        bitmap.recycle();
                                    }
                                } else {
                                    bitmap = null;
                                }
                                ge7.t(openFileDescriptor, null);
                                break;
                            default:
                                createSource = ImageDecoder.createSource(o40Var.b.getContentResolver(), uri2);
                                createSource.getClass();
                                decodeBitmap = ImageDecoder.decodeBitmap(createSource, new Object());
                                bitmap = decodeBitmap.copy(Bitmap.Config.ARGB_8888, false);
                                break;
                        }
                    } catch (Throwable unused) {
                        bitmap = null;
                    }
                    if (bitmap == null) {
                        xe1 xe1Var3 = xk1.a;
                        jv2 jv2Var2 = e04.a;
                        kq6 kq6Var2 = new kq6(lq6Var, null, 1);
                        this.Z = null;
                        this.Y = 2;
                        if (hv.d0(jv2Var2, kq6Var2, this) != x61Var22) {
                            return jg7Var;
                        }
                    } else {
                        byte[] bArr = lq6Var.f;
                        int height = bitmap.getHeight();
                        int i29 = 0;
                        while (i29 < height) {
                            j93 P = gi2.P(i5, gi2.R(i4, bitmap.getWidth()));
                            int i30 = P.A;
                            int i31 = P.B;
                            int i32 = P.L;
                            if ((i32 <= 0 || i30 > i31) && (i32 >= 0 || i31 > i30)) {
                                i = i5;
                            } else {
                                while (true) {
                                    int pixel = bitmap.getPixel(i30, i29);
                                    int pixel2 = bitmap.getPixel(i30 + 1, i29);
                                    int i33 = (pixel >> 16) & 255;
                                    int i34 = (pixel >> 8) & 255;
                                    int i35 = pixel & 255;
                                    i = i5;
                                    int i36 = (i33 * (-38)) - (i34 * 74);
                                    int i37 = i30 * 2;
                                    bArr[(bitmap.getWidth() * i29 * 2) + i37] = (byte) (((((i35 * 25) + ((i34 * 129) + (i33 * 66))) + 128) >> 8) + 16);
                                    bArr[(bitmap.getWidth() * i29 * 2) + i37 + 1] = (byte) (((((i35 * 112) + i36) + 128) >> 8) + 128);
                                    bArr[(bitmap.getWidth() * i29 * 2) + i37 + 2] = (byte) ((((((pixel2 & 255) * 25) + ((((pixel2 >> 8) & 255) * 129) + (((pixel2 >> 16) & 255) * 66))) + 128) >> 8) + 16);
                                    bArr[(bitmap.getWidth() * i29 * 2) + i37 + 3] = (byte) ((((((i33 * 112) - (i34 * 94)) - (i35 * 18)) + 128) >> 8) + 128);
                                    if (i30 != i31) {
                                        i30 += i32;
                                        i5 = i;
                                    }
                                }
                            }
                            i29++;
                            i5 = i;
                            i4 = 0;
                        }
                        bitmap.recycle();
                        return jg7Var;
                    }
                }
                return x61Var22;
            case 22:
                x61 x61Var23 = x61.COROUTINE_SUSPENDED;
                int i38 = this.Y;
                if (i38 != 0) {
                    if (i38 != 1) {
                        if (i38 == 2) {
                            oi2.Y(obj);
                            return jg7Var;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    this.Y = 1;
                    break;
                }
                this.Y = 2;
                if (((j25) obj2).f(this) != x61Var23) {
                    return jg7Var;
                }
                return x61Var23;
            case ConnectionResult.API_DISABLED /* 23 */:
                on2 on2Var = (on2) obj2;
                x61 x61Var24 = x61.COROUTINE_SUSPENDED;
                int i39 = this.Y;
                try {
                    if (i39 != 0) {
                        if (i39 == 1) {
                            oi2.Y(obj);
                            b = obj;
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        this.Y = 1;
                        b = nc7.b((nc7) this.Z, this);
                        if (b == x61Var24) {
                            return x61Var24;
                        }
                    }
                    Set set = (Set) b;
                    return jg7Var;
                } finally {
                    on2Var.c();
                }
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                kt ktVar = (kt) obj2;
                qh7 qh7Var = (qh7) this.Z;
                x61 x61Var25 = x61.COROUTINE_SUSPENDED;
                int i40 = this.Y;
                if (i40 != 0) {
                    if (i40 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                hs2 hs2Var = qh7Var.c;
                hs2Var.getClass();
                ktVar.getClass();
                g21 g21Var = new g21(new u12(hs2Var, ktVar, (r41) null, 11), 7);
                vy5 vy5Var = new vy5(qh7Var, ktVar, (r41) null, 17);
                this.Y = 1;
                if (f04.v(g21Var, vy5Var, this) == x61Var25) {
                    return x61Var25;
                }
                return jg7Var;
            case 25:
                x61 x61Var26 = x61.COROUTINE_SUSPENDED;
                int i41 = this.Y;
                if (i41 != 0) {
                    if (i41 == 1) {
                        oi2.Y(obj);
                        g = obj;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    this.Y = 1;
                    g = ((qn2) this.Z).g(this);
                    if (g == x61Var26) {
                        return x61Var26;
                    }
                }
                nc1.a0((jg1) g, (tu0) obj2);
                return jg7Var;
            case SubAllocator.N4 /* 26 */:
                x61 x61Var27 = x61.COROUTINE_SUSPENDED;
                int i42 = this.Y;
                if (i42 != 0) {
                    if (i42 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                y6 y6Var2 = new y6((pq7) obj2, 15);
                this.Y = 1;
                if (((le2) this.Z).b(y6Var2, this) == x61Var27) {
                    return x61Var27;
                }
                return jg7Var;
            case 27:
                qr7 qr7Var = (qr7) this.Z;
                tp6 tp6Var3 = qr7Var.e;
                x61 x61Var28 = x61.COROUTINE_SUSPENDED;
                int i43 = this.Y;
                if (i43 != 0) {
                    if (i43 == 1) {
                        oi2.Y(obj);
                        h = ((hm5) obj).A;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    u63 u63Var = qr7Var.d;
                    hm4 hm4Var = (hm4) obj2;
                    ja7 ja7Var = new ja7(7, qr7Var, hm4Var);
                    this.Y = 1;
                    h = u63Var.h(hm4Var, ja7Var, this);
                    if (h == x61Var28) {
                        return x61Var28;
                    }
                }
                if (!(h instanceof em5)) {
                    ja jaVar = (ja) h;
                    do {
                        value2 = tp6Var3.getValue();
                    } while (!tp6Var3.j(value2, pr7.a((pr7) value2, false, null, null, null, null, null, null, null, null, null, lb1.A("Драйвер ", jaVar.b, " успешно установлен и активирован!"), 511)));
                    qr7Var.f();
                }
                Throwable a = hm5.a(h);
                if (a != null) {
                    do {
                        value = tp6Var3.getValue();
                        pr7Var = (pr7) value;
                        localizedMessage = a.getLocalizedMessage();
                        if (localizedMessage == null) {
                            localizedMessage = a.getMessage();
                        }
                    } while (!tp6Var3.j(value, pr7.a(pr7Var, false, null, null, null, null, null, null, null, null, null, i61.m("Ошибка загрузки: ", localizedMessage), 511)));
                    return jg7Var;
                }
                return jg7Var;
            case 28:
                x61 x61Var29 = x61.COROUTINE_SUSPENDED;
                int i44 = this.Y;
                if (i44 != 0) {
                    if (i44 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                xr7 xr7Var = (xr7) this.Z;
                this.Y = 1;
                n00 n00Var = ((t26) obj2).a;
                if (n00Var != null && (uri = n00Var.c) != null && (openInputStream = xr7Var.a.getContentResolver().openInputStream(uri)) != null) {
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        options.inPreferredConfig = config;
                        Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream, null, options);
                        openInputStream.close();
                        if (decodeStream != null) {
                            if (decodeStream.getConfig() == config) {
                                bitmap2 = decodeStream;
                            } else {
                                bitmap2 = decodeStream.copy(config, false);
                                if (bitmap2 != decodeStream) {
                                    decodeStream.recycle();
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            ge7.t(openInputStream, th2);
                            throw th3;
                        }
                    }
                }
                if (bitmap2 == x61Var29) {
                    return x61Var29;
                }
                return bitmap2;
            default:
                if5 if5Var = (if5) this.Z;
                View view = (View) obj2;
                x61 x61Var30 = x61.COROUTINE_SUSPENDED;
                int i45 = this.Y;
                try {
                    if (i45 != 0) {
                        if (i45 == 1) {
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        this.Y = 1;
                        Object C = f04.C(if5Var.u, new m8(2, null, 4), this);
                        if (C != x61Var30) {
                            C = jg7Var;
                        }
                        if (C == x61Var30) {
                            return x61Var30;
                        }
                    }
                    if (uv7.a(view) == if5Var) {
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
                        return jg7Var;
                    }
                    return jg7Var;
                } finally {
                    if (uv7.a(view) == if5Var) {
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bf4(Object obj, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.d0 = obj;
    }
}
