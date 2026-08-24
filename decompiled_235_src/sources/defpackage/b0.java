package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.camera2.CameraDevice;
import android.net.Uri;
import android.util.Log;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import me.magnum.melonds.domain.model.Cheat;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b0  reason: default package */
/* loaded from: classes.dex */
public final class b0 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public Object Z;
    public Object d0;
    public final /* synthetic */ Object e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(sz1 sz1Var, dy1 dy1Var, c46 c46Var, int i, r41 r41Var) {
        super(2, r41Var);
        this.X = 28;
        this.Z = sz1Var;
        this.d0 = dy1Var;
        this.e0 = c46Var;
        this.Y = i;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                return ((b0) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 1:
                return ((b0) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 2:
                return ((b0) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 3:
                return ((b0) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 4:
                return ((b0) q((r41) obj2, (s04) obj)).s(jg7Var);
            case 5:
                return ((b0) q((r41) obj2, (vr4) obj)).s(jg7Var);
            case 6:
                return ((b0) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 7:
                return ((b0) q((r41) obj2, (q35) obj)).s(jg7Var);
            case 8:
                return ((b0) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 9:
                return ((b0) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 10:
                return ((b0) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 11:
                return ((b0) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 12:
                return ((b0) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 13:
                return ((b0) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 14:
                return ((b0) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 15:
                return ((b0) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 16:
                return ((b0) q((r41) obj2, (ne2) obj)).s(jg7Var);
            case 17:
                return ((b0) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 18:
                return ((b0) q((r41) obj2, (p76) obj)).s(jg7Var);
            case 19:
                return ((b0) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 20:
                return ((b0) q((r41) obj2, (zf1) obj)).s(jg7Var);
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return ((b0) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 22:
                return ((b0) q((r41) obj2, (w61) obj)).s(jg7Var);
            case ConnectionResult.API_DISABLED /* 23 */:
                return ((b0) q((r41) obj2, (w61) obj)).s(jg7Var);
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                return ((b0) q((r41) obj2, (cd) obj)).s(jg7Var);
            case 25:
                return ((b0) q((r41) obj2, (w61) obj)).s(jg7Var);
            case SubAllocator.N4 /* 26 */:
                return ((b0) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 27:
                return ((b0) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 28:
                return ((b0) q((r41) obj2, (w61) obj)).s(jg7Var);
            default:
                return ((b0) q((r41) obj2, (w61) obj)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        Object obj2 = this.e0;
        switch (i) {
            case 0:
                return new b0((r94) this.Z, (k25) this.d0, (il1) obj2, r41Var, 0);
            case 1:
                return new b0((le2) this.Z, (qa4) this.d0, (rs4) obj2, r41Var, 1);
            case 2:
                return new b0((eo2) this.Z, this.d0, (w61) obj2, r41Var, 2);
            case 3:
                b0 b0Var = new b0((on2) this.d0, (eo2) obj2, r41Var, 3);
                b0Var.Z = obj;
                return b0Var;
            case 4:
                b0 b0Var2 = new b0((fo2) this.d0, (dd) obj2, r41Var, 4);
                b0Var2.Z = obj;
                return b0Var2;
            case 5:
                b0 b0Var3 = new b0((go2) this.d0, (dd) obj2, r41Var, 5);
                b0Var3.Z = obj;
                return b0Var3;
            case 6:
                return new b0((jk) obj2, r41Var, 6);
            case 7:
                b0 b0Var4 = new b0((ga7) this.d0, (qa4) obj2, r41Var, 7);
                b0Var4.Z = obj;
                return b0Var4;
            case 8:
                return new b0((w70) this.Z, (eg4) this.d0, (le) obj2, r41Var, 8);
            case 9:
                return new b0((xb0) obj2, r41Var, 9);
            case 10:
                return new b0((eb) this.Z, (String) this.d0, (cc0) obj2, r41Var, 10);
            case 11:
                return new b0((ci0) this.Z, (String) this.d0, (vd) obj2, r41Var, 11);
            case 12:
                b0 b0Var5 = new b0((ne2) this.d0, (wl0) obj2, r41Var, 12);
                b0Var5.Z = obj;
                return b0Var5;
            case 13:
                b0 b0Var6 = new b0((ob6) this.d0, obj2, r41Var, 13);
                b0Var6.Z = obj;
                return b0Var6;
            case 14:
                return new b0((aq0) this.Z, (dn0) this.d0, (jo0) obj2, r41Var, 14);
            case 15:
                return new b0((aq0) this.Z, (Cheat) this.d0, (dn0) obj2, r41Var, 15);
            case 16:
                b0 b0Var7 = new b0((cp2) this.d0, (aq0) obj2, r41Var, 16);
                b0Var7.Z = obj;
                return b0Var7;
            case 17:
                b0 b0Var8 = new b0((r94) this.Z, (ie2) obj2, r41Var);
                b0Var8.d0 = obj;
                return b0Var8;
            case 18:
                b0 b0Var9 = new b0((bf1) this.d0, (eo2) obj2, r41Var, 18);
                b0Var9.Z = obj;
                return b0Var9;
            case 19:
                return new b0((bf1) this.Z, (xa4) this.d0, (eo2) obj2, r41Var, 19);
            case 20:
                b0 b0Var10 = new b0((ag1) this.d0, (n97) obj2, r41Var, 20);
                b0Var10.Z = obj;
                return b0Var10;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return new b0((ag1) this.Z, (xa4) this.d0, (n97) obj2, r41Var, 21);
            case 22:
                return new b0((qg1) this.Z, r41Var, (List) this.d0, (ki7) obj2, 22);
            case ConnectionResult.API_DISABLED /* 23 */:
                return new b0((qg1) this.Z, r41Var, (kd0) this.d0, (Map) obj2, 23);
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                b0 b0Var11 = new b0((xn1) this.d0, (fo1) obj2, r41Var, 24);
                b0Var11.Z = obj;
                return b0Var11;
            case 25:
                b0 b0Var12 = new b0((fo1) this.d0, (hn1) obj2, r41Var, 25);
                b0Var12.Z = obj;
                return b0Var12;
            case SubAllocator.N4 /* 26 */:
                b0 b0Var13 = new b0((EmulatorActivity) this.d0, (pq5) obj2, r41Var, 26);
                b0Var13.Z = obj;
                return b0Var13;
            case 27:
                return new b0((nv4) this.Z, (sz1) this.d0, (String) obj2, r41Var, 27);
            case 28:
                return new b0((sz1) this.Z, (dy1) this.d0, (c46) obj2, this.Y, r41Var);
            default:
                return new b0((nv4) this.Z, (sz1) this.d0, (pq5) obj2, r41Var, 29);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:237:0x04c9, code lost:
        if (r9.a(r14, r13) == r10) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x04da, code lost:
        if (r9.a(r14, r13) == r10) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x04e9, code lost:
        if (r14 == r10) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x053a, code lost:
        if (r9.a(r14, r13) == r10) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x054a, code lost:
        if (r9.a(r14, r13) == r10) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0565, code lost:
        if (r13 == r10) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0759, code lost:
        if (r14 == r0) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x07c2, code lost:
        if (r13 == r0) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x08a3, code lost:
        if (r13 == defpackage.x61.COROUTINE_SUSPENDED) goto L420;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x077d  */
    /* JADX WARN: Type inference failed for: r0v21, types: [x61] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:361:0x0759 -> B:363:0x075c). Please submit an issue!!! */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        jk jkVar;
        hb4 hb4Var;
        Object obj2;
        LinkedHashSet linkedHashSet;
        Iterator it;
        Object em5Var;
        float f;
        float b;
        Object obj3;
        zl1 f2;
        CameraDevice cameraDevice = null;
        File file = null;
        Uri uri = null;
        cameraDevice = null;
        cameraDevice = null;
        cameraDevice = null;
        switch (this.X) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i = this.Y;
                if (i != 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    this.Y = 1;
                    if (((r94) this.Z).a((k25) this.d0, this) == x61Var) {
                        return x61Var;
                    }
                }
                il1 il1Var = (il1) this.e0;
                if (il1Var != null) {
                    il1Var.dispose();
                }
                return jg7.a;
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    f7 f7Var = new f7((qa4) this.d0, (rs4) this.e0, 0);
                    this.Y = 1;
                    if (((le2) this.Z).b(f7Var, this) == x61Var2) {
                        return x61Var2;
                    }
                }
                return jg7.a;
            case 2:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    Object obj4 = this.d0;
                    this.Y = 1;
                    if (((eo2) this.Z).o(obj4, this) == x61Var3) {
                        return x61Var3;
                    }
                }
                g04.x((w61) this.e0, new pc());
                return jg7.a;
            case 3:
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    Object obj5 = new Object();
                    g21 f0 = np2.f0((on2) this.d0);
                    vc vcVar = new vc(obj5, (w61) this.Z, (eo2) this.e0, 0);
                    this.Y = 1;
                    if (f0.b(vcVar, this) == x61Var4) {
                        return x61Var4;
                    }
                }
                return jg7.a;
            case 4:
                x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                int i5 = this.Y;
                if (i5 != 0) {
                    if (i5 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    fo2 fo2Var = (fo2) this.d0;
                    bd bdVar = ((dd) this.e0).n;
                    this.Y = 1;
                    if (fo2Var.e(bdVar, (s04) this.Z, this) == x61Var5) {
                        return x61Var5;
                    }
                }
                return jg7.a;
            case 5:
                x61 x61Var6 = x61.COROUTINE_SUSPENDED;
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
                    vr4 vr4Var = (vr4) this.Z;
                    Object obj6 = vr4Var.B;
                    go2 go2Var = (go2) this.d0;
                    bd bdVar2 = ((dd) this.e0).n;
                    this.Y = 1;
                    if (go2Var.l(bdVar2, (s04) vr4Var.A, obj6, this) == x61Var6) {
                        return x61Var6;
                    }
                }
                return jg7.a;
            case 6:
                x61 x61Var7 = x61.COROUTINE_SUSPENDED;
                int i7 = this.Y;
                if (i7 != 0) {
                    if (i7 == 1) {
                        jkVar = (jk) this.d0;
                        hb4Var = (hb4) this.Z;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    jk jkVar2 = (jk) this.e0;
                    hb4 hb4Var2 = jkVar2.b;
                    this.Z = hb4Var2;
                    this.d0 = jkVar2;
                    this.Y = 1;
                    if (hb4Var2.e(this) == x61Var7) {
                        return x61Var7;
                    }
                    jkVar = jkVar2;
                    hb4Var = hb4Var2;
                }
                try {
                    SharedPreferences.Editor edit = jkVar.a.edit();
                    edit.remove("ra_profile_username");
                    edit.remove("ra_profile_score");
                    edit.remove("ra_profile_softcore_score");
                    edit.apply();
                    jkVar.c.l(null);
                    hb4Var.h(null);
                    return jg7.a;
                } catch (Throwable th) {
                    hb4Var.h(null);
                    throw th;
                }
            case 7:
                ga7 ga7Var = (ga7) this.d0;
                x61 x61Var8 = x61.COROUTINE_SUSPENDED;
                int i8 = this.Y;
                if (i8 != 0) {
                    if (i8 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    g21 f02 = np2.f0(new pj(ga7Var, 2));
                    vc vcVar2 = new vc((q35) this.Z, ga7Var, (qa4) this.e0, 1);
                    this.Y = 1;
                    if (f02.b(vcVar2, this) == x61Var8) {
                        return x61Var8;
                    }
                }
                return jg7.a;
            case 8:
                jg7 jg7Var = jg7.a;
                w70 w70Var = (w70) this.Z;
                x61 x61Var9 = x61.COROUTINE_SUSPENDED;
                int i9 = this.Y;
                if (i9 != 0) {
                    if (i9 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    p31 p31Var = w70Var.k0;
                    u70 u70Var = new u70(w70Var, (eg4) this.d0, (le) this.e0);
                    this.Y = 1;
                    p31Var.getClass();
                    of5 of5Var = (of5) u70Var.c();
                    if (of5Var != null && !p31.T0(p31Var, of5Var, 0L, 0L, 3)) {
                        rj0 rj0Var = new rj0(1, np2.V(this));
                        rj0Var.v();
                        l31 l31Var = new l31(u70Var, rj0Var);
                        p70 p70Var = p31Var.p0;
                        ua4 ua4Var = p70Var.a;
                        of5 of5Var2 = (of5) u70Var.c();
                        if (of5Var2 == null) {
                            rj0Var.i(jg7Var);
                        } else {
                            rj0Var.z(new y(9, p70Var, l31Var));
                            l93 R = gi2.R(0, ua4Var.L);
                            int i10 = R.A;
                            int i11 = R.B;
                            if (i10 <= i11) {
                                while (true) {
                                    of5 of5Var3 = (of5) ((l31) ua4Var.A[i11]).a.c();
                                    if (of5Var3 != null) {
                                        of5 e = of5Var2.e(of5Var3);
                                        if (e.equals(of5Var2)) {
                                            ua4Var.a(i11 + 1, l31Var);
                                        } else if (!e.equals(of5Var3)) {
                                            CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                            int i12 = ua4Var.L - 1;
                                            if (i12 <= i11) {
                                                while (true) {
                                                    ((l31) ua4Var.A[i11]).b.w(cancellationException);
                                                    if (i12 != i11) {
                                                        i12++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (i11 != i10) {
                                        i11--;
                                    }
                                }
                            }
                            ua4Var.a(0, l31Var);
                            if (!p31Var.s0) {
                                p31Var.U0(0L);
                            }
                        }
                        obj2 = rj0Var.s();
                        break;
                    }
                    obj2 = jg7Var;
                    if (obj2 == x61Var9) {
                        return x61Var9;
                    }
                }
                return jg7Var;
            case 9:
                x61 x61Var10 = x61.COROUTINE_SUSPENDED;
                int i13 = this.Y;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            oi2.Y(obj);
                            return jg7.a;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kc0 kc0Var = (kc0) this.d0;
                    it = (Iterator) this.Z;
                    oi2.Y(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        Log.w("CXCP", "Failed to await closure from " + kc0Var + '!');
                    }
                    if (!it.hasNext()) {
                        kc0Var = (kc0) it.next();
                        Log.d("CXCP", "Camera2Backend#shutdownAsync: Awaiting closure from " + kc0Var);
                        this.Z = it;
                        this.d0 = kc0Var;
                        this.Y = 1;
                        obj = kc0Var.c(this);
                        break;
                    } else {
                        Log.d("CXCP", "Camera2Backend#shutdownAsync: Closing all cameras (if any)");
                        e65 e65Var = ((xb0) this.e0).d;
                        jg7 jg7Var2 = jg7.a;
                        ((tu0) e65Var.a.a.h).b0(jg7Var2);
                        qk5 qk5Var = new qk5();
                        tu0 tu0Var = qk5Var.a;
                        if (((v80) e65Var.e.Y).c(qk5Var) instanceof fm0) {
                            Log.e("CXCP", "Camera close all request failed!");
                            tu0Var.b0(jg7Var2);
                        }
                        this.Z = null;
                        this.d0 = null;
                        this.Y = 2;
                        Object q = tu0Var.q(this);
                        x61 x61Var11 = x61.COROUTINE_SUSPENDED;
                        break;
                    }
                    return x61Var10;
                }
                oi2.Y(obj);
                xb0 xb0Var = (xb0) this.e0;
                synchronized (xb0Var.f) {
                    linkedHashSet = xb0Var.g;
                }
                it = linkedHashSet.iterator();
                if (!it.hasNext()) {
                }
                return x61Var10;
            case 10:
                x61 x61Var12 = x61.COROUTINE_SUSPENDED;
                int i14 = this.Y;
                if (i14 != 0) {
                    if (i14 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    zb0 zb0Var = new zb0(0, (String) this.d0, (cc0) this.e0);
                    this.Y = 1;
                    if (((pb0) ((eb) this.Z).X).b(zb0Var, this) == x61Var12) {
                        return x61Var12;
                    }
                }
                return jg7.a;
            case 11:
                vd vdVar = (vd) this.e0;
                String str = (String) this.d0;
                ?? r0 = x61.COROUTINE_SUSPENDED;
                int i15 = this.Y;
                try {
                } catch (Exception e2) {
                    Log.w("CXCP", "Failed to open " + ((Object) xf0.b(str)), e2);
                    int C = hv.C(e2);
                    if (C != 0) {
                        vdVar.b(cameraDevice, new ud(ds0.CAMERA2_EXCEPTION, new df0(C), e2, 2));
                    }
                    hv.C(e2);
                }
                if (i15 != 0) {
                    if (i15 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return cameraDevice;
                    }
                } else {
                    oi2.Y(obj);
                    this.Y = 1;
                    ((u63) ((ci0) this.Z).a).A(str, vdVar);
                    if (jg7.a == r0) {
                        cameraDevice = r0;
                    }
                }
                return cameraDevice;
            case 12:
                jg7 jg7Var3 = jg7.a;
                x61 x61Var13 = x61.COROUTINE_SUSPENDED;
                int i16 = this.Y;
                if (i16 != 0) {
                    if (i16 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    ul0 i17 = ((wl0) this.e0).i((w61) this.Z);
                    this.Y = 1;
                    Object D = g04.D((ne2) this.d0, i17, true, this);
                    if (D != x61Var13) {
                        D = jg7Var3;
                    }
                    if (D == x61Var13) {
                        return x61Var13;
                    }
                }
                return jg7Var3;
            case 13:
                Object obj7 = jg7.a;
                x61 x61Var14 = x61.COROUTINE_SUSPENDED;
                int i18 = this.Y;
                try {
                    if (i18 != 0) {
                        if (i18 == 1) {
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        w61 w61Var = (w61) this.Z;
                        ob6 ob6Var = (ob6) this.d0;
                        Object obj8 = this.e0;
                        this.Y = 1;
                        if (ob6Var.a(this, obj8) == x61Var14) {
                            return x61Var14;
                        }
                    }
                    em5Var = obj7;
                } catch (Throwable th2) {
                    em5Var = new em5(th2);
                }
                Object obj9 = obj7;
                if (em5Var instanceof em5) {
                    obj9 = new em0(hm5.a(em5Var));
                }
                return new gm0(obj9);
            case 14:
                x61 x61Var15 = x61.COROUTINE_SUSPENDED;
                int i19 = this.Y;
                if (i19 != 0) {
                    if (i19 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    hp0 hp0Var = ((aq0) this.Z).b;
                    this.Y = 1;
                    if (((h16) hp0Var).d(((dn0) this.d0).a(), (jo0) this.e0, this) == x61Var15) {
                        return x61Var15;
                    }
                }
                return jg7.a;
            case 15:
                Cheat cheat = (Cheat) this.d0;
                aq0 aq0Var = (aq0) this.Z;
                x61 x61Var16 = x61.COROUTINE_SUSPENDED;
                int i20 = this.Y;
                if (i20 != 0) {
                    if (i20 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    hp0 hp0Var2 = aq0Var.b;
                    this.Y = 1;
                    if (((h16) hp0Var2).f(cheat, this) == x61Var16) {
                        return x61Var16;
                    }
                }
                aq0Var.f.add(new jh1(cheat, ((dn0) this.e0).a()));
                return jg7.a;
            case 16:
                jg7 jg7Var4 = jg7.a;
                yt1 yt1Var = yt1.A;
                cp2 cp2Var = (cp2) this.d0;
                aq0 aq0Var2 = (aq0) this.e0;
                hp0 hp0Var3 = aq0Var2.b;
                lx5 lx5Var = aq0Var2.d;
                ne2 ne2Var = (ne2) this.Z;
                x61 x61Var17 = x61.COROUTINE_SUSPENDED;
                switch (this.Y) {
                    case 0:
                        oi2.Y(obj);
                        if (cp2Var == null) {
                            if (lx5Var == null) {
                                qp0 qp0Var = new qp0(yt1Var);
                                this.Z = null;
                                this.Y = 1;
                                break;
                            } else {
                                Object obj10 = new Object();
                                this.Z = ne2Var;
                                this.Y = 2;
                                break;
                            }
                        } else {
                            Object obj11 = new Object();
                            this.Z = ne2Var;
                            this.Y = 5;
                            break;
                        }
                        return x61Var17;
                    case 1:
                    case 4:
                    case 6:
                        oi2.Y(obj);
                        return jg7Var4;
                    case 2:
                        oi2.Y(obj);
                        this.Z = ne2Var;
                        this.Y = 3;
                        obj = ((h16) hp0Var3).h(lx5Var, this);
                        break;
                    case 3:
                        oi2.Y(obj);
                        cp2 cp2Var2 = (cp2) obj;
                        if (cp2Var2 != null) {
                            v46 v46Var = aq0Var2.c;
                            Long l = cp2Var2.a;
                            String str2 = cp2Var2.b;
                            String str3 = cp2Var2.c;
                            String str4 = cp2Var2.d;
                            List<an0> list = cp2Var2.e;
                            ArrayList arrayList = new ArrayList(ht0.v0(list, 10));
                            for (an0 an0Var : list) {
                                arrayList.add(u24.m(an0Var));
                            }
                            v46Var.c(new pp2(l, str2, str3, str4, arrayList), "selected_game");
                        } else {
                            qp0 qp0Var2 = new qp0(yt1Var);
                            this.Z = null;
                            this.Y = 4;
                            break;
                        }
                        return jg7Var4;
                    case 5:
                        oi2.Y(obj);
                        le2 i21 = ((h16) hp0Var3).i(cp2Var);
                        this.Z = null;
                        this.Y = 6;
                        Object b2 = i21.b(new a7(ne2Var, 5), this);
                        if (b2 != x61Var17) {
                            b2 = jg7Var4;
                            break;
                        }
                        break;
                    default:
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
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
                    ArrayList arrayList2 = new ArrayList();
                    of6 of6Var = ((r94) this.Z).a;
                    vc vcVar3 = new vc(arrayList2, (w61) this.d0, (ie2) this.e0, 2);
                    this.Y = 1;
                    of6Var.getClass();
                    if (of6.m(of6Var, vcVar3, this) == x61Var18) {
                        return x61Var18;
                    }
                }
                return jg7.a;
            case 18:
                vs4 vs4Var = ((bf1) this.d0).d;
                x61 x61Var19 = x61.COROUTINE_SUSPENDED;
                int i23 = this.Y;
                try {
                    if (i23 != 0) {
                        if (i23 == 1) {
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        p76 p76Var = (p76) this.Z;
                        vs4Var.setValue(Boolean.TRUE);
                        this.Y = 1;
                        if (((eo2) this.e0).o(p76Var, this) == x61Var19) {
                            return x61Var19;
                        }
                    }
                    vs4Var.setValue(Boolean.FALSE);
                    return jg7.a;
                } catch (Throwable th3) {
                    vs4Var.setValue(Boolean.FALSE);
                    throw th3;
                }
            case 19:
                x61 x61Var20 = x61.COROUTINE_SUSPENDED;
                int i24 = this.Y;
                if (i24 != 0) {
                    if (i24 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    bf1 bf1Var = (bf1) this.Z;
                    db4 db4Var = bf1Var.c;
                    af1 af1Var = bf1Var.b;
                    xa4 xa4Var = (xa4) this.d0;
                    b0 b0Var = new b0(bf1Var, (eo2) this.e0, null, 18);
                    this.Y = 1;
                    db4Var.getClass();
                    if (g04.C(new cb4(xa4Var, db4Var, b0Var, af1Var, null), this) == x61Var20) {
                        return x61Var20;
                    }
                }
                return jg7.a;
            case 20:
                ag1 ag1Var = (ag1) this.d0;
                x61 x61Var21 = x61.COROUTINE_SUSPENDED;
                int i25 = this.Y;
                try {
                    if (i25 != 0) {
                        if (i25 == 1) {
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        zf1 zf1Var = (zf1) this.Z;
                        ag1Var.d.setValue(Boolean.TRUE);
                        this.Y = 1;
                        if (((n97) this.e0).o(zf1Var, this) == x61Var21) {
                            return x61Var21;
                        }
                    }
                    ag1Var.d.setValue(Boolean.FALSE);
                    return jg7.a;
                } catch (Throwable th4) {
                    ag1Var.d.setValue(Boolean.FALSE);
                    throw th4;
                }
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                x61 x61Var22 = x61.COROUTINE_SUSPENDED;
                int i26 = this.Y;
                if (i26 != 0) {
                    if (i26 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    ag1 ag1Var2 = (ag1) this.Z;
                    db4 db4Var2 = ag1Var2.c;
                    zf1 zf1Var2 = ag1Var2.b;
                    xa4 xa4Var2 = (xa4) this.d0;
                    b0 b0Var2 = new b0(ag1Var2, (n97) this.e0, null, 20);
                    this.Y = 1;
                    db4Var2.getClass();
                    if (g04.C(new cb4(xa4Var2, db4Var2, b0Var2, zf1Var2, null), this) == x61Var22) {
                        return x61Var22;
                    }
                }
                return jg7.a;
            case 22:
                x61 x61Var23 = x61.COROUTINE_SUSPENDED;
                int i27 = this.Y;
                if (i27 != 0) {
                    if (i27 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                jg1 f3 = qg1.k((qg1) this.Z).f((List) this.d0, (ki7) this.e0);
                this.Y = 1;
                Object q2 = ((tu0) f3).q(this);
                if (q2 == x61Var23) {
                    return x61Var23;
                }
                return q2;
            case ConnectionResult.API_DISABLED /* 23 */:
                x61 x61Var24 = x61.COROUTINE_SUSPENDED;
                int i28 = this.Y;
                if (i28 != 0) {
                    if (i28 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                jg1 d = qg1.k((qg1) this.Z).d((kd0) this.d0, (Map) this.e0);
                this.Y = 1;
                Object q3 = ((tu0) d).q(this);
                if (q3 == x61Var24) {
                    return x61Var24;
                }
                return q3;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                x61 x61Var25 = x61.COROUTINE_SUSPENDED;
                int i29 = this.Y;
                if (i29 != 0) {
                    if (i29 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    y yVar = new y(25, (cd) this.Z, (fo1) this.e0);
                    this.Y = 1;
                    if (((xn1) this.d0).o(yVar, this) == x61Var25) {
                        return x61Var25;
                    }
                }
                return jg7.a;
            case 25:
                fo1 fo1Var = (fo1) this.d0;
                x61 x61Var26 = x61.COROUTINE_SUSPENDED;
                int i30 = this.Y;
                if (i30 != 0) {
                    if (i30 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    w61 w61Var2 = (w61) this.Z;
                    fo2 fo2Var2 = fo1Var.J0;
                    long j = ((hn1) this.e0).a;
                    if (fo1Var.K0) {
                        f = -1.0f;
                    } else {
                        f = 1.0f;
                    }
                    long f4 = ol7.f(f, j);
                    lo4 lo4Var = fo1Var.G0;
                    do1 do1Var = eo1.a;
                    if (lo4Var == lo4.Vertical) {
                        b = ol7.c(f4);
                    } else {
                        b = ol7.b(f4);
                    }
                    Float f5 = new Float(b);
                    this.Y = 1;
                    if (fo2Var2.e(w61Var2, f5, this) == x61Var26) {
                        return x61Var26;
                    }
                }
                return jg7.a;
            case SubAllocator.N4 /* 26 */:
                pq5 pq5Var = (pq5) this.e0;
                EmulatorActivity emulatorActivity = (EmulatorActivity) this.d0;
                w61 w61Var3 = (w61) this.Z;
                x61 x61Var27 = x61.COROUTINE_SUSPENDED;
                int i31 = this.Y;
                try {
                    if (i31 != 0) {
                        if (i31 == 1) {
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        e70 e70Var = emulatorActivity.J0;
                        if (e70Var != null) {
                            this.Z = null;
                            this.Y = 1;
                            obj = e70Var.e(pq5Var, this);
                            if (obj == x61Var27) {
                                return x61Var27;
                            }
                        } else {
                            nb3.a0("boxArtRepository");
                            throw null;
                        }
                    }
                    obj3 = (String) obj;
                } catch (Throwable th5) {
                    obj3 = new em5(th5);
                }
                boolean z = obj3 instanceof em5;
                Object obj12 = obj3;
                if (z) {
                    obj12 = null;
                }
                String str5 = (String) obj12;
                pq5 pq5Var2 = (pq5) emulatorActivity.J1.getValue();
                if (pq5Var2 != null) {
                    uri = pq5Var2.d;
                }
                if (nb3.k(uri, pq5Var.d)) {
                    emulatorActivity.K1.setValue(str5);
                }
                return jg7.a;
            case 27:
                sz1 sz1Var = (sz1) this.d0;
                nv4 nv4Var = (nv4) this.Z;
                x61 x61Var28 = x61.COROUTINE_SUSPENDED;
                int i32 = this.Y;
                if (i32 != 0) {
                    if (i32 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    this.Y = 1;
                    obj = nv4Var.d(this);
                    if (obj == x61Var28) {
                        return x61Var28;
                    }
                }
                int intValue = ((Number) obj).intValue();
                xv2 xv2Var = sz1Var.m;
                gd5 gd5Var = nv4Var.a;
                xv2Var.b(gd5Var.a, gd5Var.c);
                sz1Var.G0("ra_pending_session_cleared", new vr4("reason", (String) this.e0), new vr4("discarded", new Integer(intValue)), new vr4("accepted", Boolean.FALSE));
                return jg7.a;
            case 28:
                x61 x61Var29 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                yb2 yb2Var = ((sz1) this.Z).s;
                pq5 pq5Var3 = ((dy1) this.d0).a;
                c46 c46Var = (c46) this.e0;
                int i33 = this.Y;
                Context context = yb2Var.a;
                pq5Var3.getClass();
                c46Var.getClass();
                int i34 = c46Var.a;
                if (c46Var.b) {
                    zl1 e3 = yb2Var.e(pq5Var3);
                    if (e3 != null) {
                        String a = yb2Var.a(pq5Var3);
                        if (a != null) {
                            String str6 = a + ".ml" + i33;
                            zl1 f6 = e3.f(a + ".ml" + i34);
                            if (f6 != null && ((f2 = e3.f(str6)) != null || (f2 = e3.c("*/*", str6)) != null)) {
                                InputStream openInputStream = context.getContentResolver().openInputStream(f6.j());
                                if (openInputStream != null) {
                                    try {
                                        OutputStream openOutputStream = context.getContentResolver().openOutputStream(f2.j());
                                        if (openOutputStream != null) {
                                            f04.w(openInputStream, openOutputStream);
                                            openOutputStream.close();
                                        }
                                        openInputStream.close();
                                    } catch (Throwable th6) {
                                        try {
                                            throw th6;
                                        } catch (Throwable th7) {
                                            ge7.t(openInputStream, th6);
                                            throw th7;
                                        }
                                    }
                                }
                                b46 b46Var = yb2Var.c;
                                File a2 = b46Var.a(pq5Var3, c46Var, false);
                                if (a2 != null && a2.exists()) {
                                    File file2 = new File(new File(b46Var.a.getFilesDir(), "ss_screenshots"), String.valueOf(pq5Var3.d.hashCode()));
                                    if (file2.isDirectory() || file2.mkdirs()) {
                                        file = new File(file2, i33 + ".png");
                                    }
                                    if (file != null) {
                                        jc2.w0(a2, file);
                                        b46Var.c(file);
                                    }
                                }
                                String d2 = yb2Var.d(pq5Var3, i34);
                                if (d2 != null && !qs6.v0(d2)) {
                                    yb2Var.f(pq5Var3, i33, d2.concat(" (Копия)"));
                                }
                            }
                        } else {
                            throw new Exception("Could not determine ROM file name");
                        }
                    } else {
                        throw new Exception("Could not create parent directory document");
                    }
                }
                return yb2Var.c(pq5Var3);
            default:
                x61 x61Var30 = x61.COROUTINE_SUSPENDED;
                int i35 = this.Y;
                if (i35 != 0) {
                    if (i35 != 1) {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    nv4 nv4Var2 = (nv4) this.Z;
                    de5 de5Var = nv4Var2.i;
                    s12 s12Var = new s12((sz1) this.d0, nv4Var2, (pq5) this.e0);
                    this.Y = 1;
                    if (de5Var.A.b(s12Var, this) == x61Var30) {
                        return x61Var30;
                    }
                }
                e41.c();
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(qg1 qg1Var, r41 r41Var, Object obj, Object obj2, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = qg1Var;
        this.d0 = obj;
        this.e0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(r94 r94Var, ie2 ie2Var, r41 r41Var) {
        super(2, r41Var);
        this.X = 17;
        this.Z = r94Var;
        this.e0 = ie2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Object obj, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.e0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Object obj, Object obj2, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.d0 = obj;
        this.e0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Object obj, Object obj2, Object obj3, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = obj;
        this.d0 = obj2;
        this.e0 = obj3;
    }
}
