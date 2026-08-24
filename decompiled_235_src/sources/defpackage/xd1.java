package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Vibrator;
import android.util.Log;
import android.widget.TextView;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.stormds.emulator.R;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import me.magnum.melonds.MelonDSAndroidInterface;
import me.magnum.melonds.MelonEmulator;
import me.magnum.melonds.domain.model.Cheat;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.domain.model.VulkanPipelineProfile;
import me.magnum.melonds.translator.ui.GameTranslationOverlayView;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState;
import me.magnum.melonds.ui.inputsetup.b;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xd1  reason: default package */
/* loaded from: classes.dex */
public final class xd1 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public Object Z;
    public final /* synthetic */ Object d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xd1(Object obj, Object obj2, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = obj;
        this.d0 = obj2;
    }

    private final Object A(Object obj) {
        b bVar = (b) this.Z;
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
            p06 p06Var = bVar.c;
            Uri uri = ((pq5) this.d0).d;
            this.Y = 1;
            obj = ((xb2) p06Var).l(uri, this);
            if (obj == x61Var) {
                return x61Var;
            }
        }
        pq5 pq5Var = (pq5) obj;
        jg7 jg7Var = jg7.a;
        if (pq5Var == null || bVar.o) {
            return jg7Var;
        }
        u41 u41Var = pq5Var.f.h;
        if (u41Var == null) {
            u41Var = (u41) ((tp6) ((ng6) bVar.b).g.getValue()).getValue();
        }
        bVar.d = pq5Var;
        bVar.e.l(u41Var.a().b);
        bVar.g.l(u41Var.a);
        return jg7Var;
    }

    private final Object B(Object obj) {
        yl3 viewModel;
        UUID uuid = (UUID) this.Z;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.Y;
        if (i != 0) {
            if (i == 1) {
                oi2.Y(obj);
                return obj;
            }
            i.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        oi2.Y(obj);
        viewModel = ((me.magnum.melonds.ui.layouteditor.b) this.d0).getViewModel();
        this.Z = null;
        this.Y = 1;
        Object g = viewModel.g(uuid, this);
        if (g == x61Var) {
            return x61Var;
        }
        return g;
    }

    private final Object C(Object obj) {
        qn3 qn3Var = (qn3) this.d0;
        wa3 wa3Var = (wa3) this.Z;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.Y;
        jg7 jg7Var = jg7.a;
        if (i != 0) {
            if (i == 1) {
                oi2.Y(obj);
                return jg7Var;
            }
            i.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        oi2.Y(obj);
        le2 z = f04.z(new g21(new pa3(new cf2(new ra3(wa3Var, null, 0), wa3Var.f), wa3Var, 0), 6));
        m5 m5Var = new m5(qn3Var, null, 18);
        zb0 zb0Var = new zb0(12, wa3Var, qn3Var);
        this.Y = 1;
        Object b = z.b(new zb0(10, zb0Var, m5Var), this);
        if (b != x61Var) {
            b = jg7Var;
        }
        if (b == x61Var) {
            return x61Var;
        }
        return jg7Var;
    }

    private final Object D(Object obj) {
        eo3 eo3Var = (eo3) this.d0;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.Y;
        jg7 jg7Var = jg7.a;
        if (i != 0) {
            if (i == 1) {
                oi2.Y(obj);
                return jg7Var;
            }
            i.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        oi2.Y(obj);
        wa3 wa3Var = (wa3) this.Z;
        le2 z = f04.z(new g21(new pa3(new cf2(new ra3(wa3Var, null, 0), wa3Var.f), wa3Var, 0), 6));
        m5 m5Var = new m5(eo3Var, null, 19);
        tp6 tp6Var = eo3Var.c;
        this.Y = 1;
        Object b = z.b(new zb0(10, tp6Var, m5Var), this);
        if (b != x61Var) {
            b = jg7Var;
        }
        if (b == x61Var) {
            return x61Var;
        }
        return jg7Var;
    }

    private final Object E(Object obj) {
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
            kq3 kq3Var = new kq3((ue1) this.d0, null, 0);
            this.Y = 1;
            if (uj2.o((zy4) this.Z, kq3Var, this) == x61Var) {
                return x61Var;
            }
        }
        return jg7.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (defpackage.q60.u(r4, r6) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        if (defpackage.q60.u(r3, r6) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object F(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.Y;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    oi2.Y(obj);
                    ((q3) this.Z).i.E();
                    return jg7.a;
                }
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            oi2.Y(obj);
        } else {
            oi2.Y(obj);
            jd1 jd1Var = oq1.B;
            long L = n16.L(500, uq1.MILLISECONDS);
            this.Y = 1;
        }
        ((qa4) this.d0).setValue(Boolean.TRUE);
        jd1 jd1Var2 = oq1.B;
        long L2 = n16.L(4, uq1.SECONDS);
        this.Y = 2;
    }

    private final Object G(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.Y;
        if (i != 0) {
            if (i != 1) {
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            oi2.Y(obj);
        } else {
            oi2.Y(obj);
            this.Y = 1;
            if (fy4.a((et3) this.Z, (l5) this.d0, this) == x61Var) {
                return x61Var;
            }
        }
        e41.c();
        return null;
    }

    private final Object H(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.Y;
        if (i != 0) {
            if (i != 1) {
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            oi2.Y(obj);
        } else {
            oi2.Y(obj);
            y6 y6Var = new y6((o74) this.d0, 12);
            this.Y = 1;
            if (((rp6) this.Z).b(y6Var, this) == x61Var) {
                return x61Var;
            }
        }
        e41.c();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f A[Catch: all -> 0x001c, TryCatch #0 {all -> 0x001c, blocks: (B:7:0x0016, B:17:0x0035, B:19:0x003f, B:23:0x0051, B:14:0x0029), top: B:32:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0072 -> B:27:0x0073). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object I(Object obj) {
        w61 w61Var;
        w61 w61Var2;
        float e0;
        float e02;
        m86 m86Var;
        xd1 xd1Var;
        m84 m84Var = (m84) this.d0;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.Y;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        w61 w61Var3 = (w61) this.Z;
                        oi2.Y(obj);
                        xd1Var = this;
                        w61Var = w61Var3;
                        this = xd1Var;
                        if (yh2.z(w61Var.A())) {
                            v80 v80Var = m84Var.g;
                            this.Z = w61Var;
                            this.Y = 1;
                            v80Var.getClass();
                            Object L = v80.L(v80Var, this);
                            if (L != x61Var) {
                                w61Var2 = w61Var;
                                obj = L;
                                e0 = m84Var.c.e0(6.0f);
                                e02 = m84Var.c.e0(1.0f);
                                m86Var = m84Var.a;
                                this.Z = w61Var2;
                                this.Y = 2;
                                xd1Var = this;
                                if (m84.c(m84Var, m86Var, (i84) obj, e0, e02, xd1Var) != x61Var) {
                                    w61Var = w61Var2;
                                    this = xd1Var;
                                    if (yh2.z(w61Var.A())) {
                                        m84Var.h = null;
                                        return jg7.a;
                                    }
                                }
                                return x61Var;
                            }
                            return x61Var;
                        }
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    w61 w61Var4 = (w61) this.Z;
                    oi2.Y(obj);
                    w61Var2 = w61Var4;
                    e0 = m84Var.c.e0(6.0f);
                    e02 = m84Var.c.e0(1.0f);
                    m86Var = m84Var.a;
                    this.Z = w61Var2;
                    this.Y = 2;
                    xd1Var = this;
                    if (m84.c(m84Var, m86Var, (i84) obj, e0, e02, xd1Var) != x61Var) {
                    }
                    return x61Var;
                }
            } else {
                oi2.Y(obj);
                w61Var = (w61) this.Z;
                if (yh2.z(w61Var.A())) {
                }
            }
        } catch (Throwable th) {
            m84Var.h = null;
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (r8 == r2) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
        if (r10.b(r3, r9) == r2) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object v(Object obj) {
        xb2 xb2Var = (xb2) this.Z;
        tp6 tp6Var = xb2Var.l;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.Y;
        jg7 jg7Var = jg7.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                m06 m06Var = m06.NOT_SCANNING;
                this.Y = 3;
                tp6Var.a(m06Var, this);
                if (jg7Var == x61Var) {
                    return x61Var;
                }
                return jg7Var;
            }
            oi2.Y(obj);
        } else {
            oi2.Y(obj);
            m06 m06Var2 = m06.SCANNING;
            this.Y = 1;
            tp6Var.a(m06Var2, this);
        }
        g21 g21Var = new g21(new wb2(xb2Var, (Set) this.d0, null), 7);
        hb2 hb2Var = new hb2(xb2Var, 1);
        this.Y = 2;
    }

    private final Object x(Object obj) {
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
            ta7 ta7Var = (ta7) this.Z;
            String str = ta7Var.a;
            String str2 = ta7Var.b;
            this.Y = 1;
            obj = hv.d0(xk1.a, new m5(str, str2, (r41) null, 16), this);
            if (obj == x61Var) {
                return x61Var;
            }
        }
        GameTranslationOverlayView gameTranslationOverlayView = (GameTranslationOverlayView) this.d0;
        gameTranslationOverlayView.B0 = (jp2) obj;
        gameTranslationOverlayView.invalidate();
        return jg7.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002f -> B:14:0x0032). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object z(Object obj) {
        GameTranslationOverlayView gameTranslationOverlayView;
        hq2 hq2Var = (hq2) this.d0;
        w61 w61Var = (w61) this.Z;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.Y;
        if (i != 0) {
            if (i == 1) {
                oi2.Y(obj);
                if (hq2Var.f.getBoolean("translator_enabled", false) && (gameTranslationOverlayView = hq2Var.l) != null && !gameTranslationOverlayView.f0) {
                    hq2Var.j(true);
                }
                if (g04.H(w61Var)) {
                    this.Z = w61Var;
                    this.Y = 1;
                    if (q60.t(1500L, this) == x61Var) {
                        return x61Var;
                    }
                    if (hq2Var.f.getBoolean("translator_enabled", false)) {
                        hq2Var.j(true);
                    }
                    if (g04.H(w61Var)) {
                        return jg7.a;
                    }
                }
            } else {
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            oi2.Y(obj);
            if (g04.H(w61Var)) {
            }
        }
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                return ((xd1) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 1:
                return ((xd1) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 2:
                return ((xd1) q((r41) obj2, (hy1) obj)).s(jg7Var);
            case 3:
                return ((xd1) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 4:
                return ((xd1) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 5:
                return ((xd1) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 6:
                return ((xd1) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 7:
                return ((xd1) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 8:
                return ((xd1) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 9:
                return ((xd1) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 10:
                return ((xd1) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 11:
                return ((xd1) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 12:
                return ((xd1) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 13:
                return ((xd1) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 14:
                return ((xd1) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 15:
                return ((xd1) q((r41) obj2, (ne2) obj)).s(jg7Var);
            case 16:
                return ((xd1) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 17:
                return ((xd1) q((r41) obj2, (r35) obj)).s(jg7Var);
            case 18:
                return ((xd1) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 19:
                return ((xd1) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 20:
                return ((xd1) q((r41) obj2, (w61) obj)).s(jg7Var);
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return ((xd1) q((r41) obj2, (UUID) obj)).s(jg7Var);
            case 22:
                return ((xd1) q((r41) obj2, (w61) obj)).s(jg7Var);
            case ConnectionResult.API_DISABLED /* 23 */:
                return ((xd1) q((r41) obj2, (w61) obj)).s(jg7Var);
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                return ((xd1) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 25:
                return ((xd1) q((r41) obj2, (w61) obj)).s(jg7Var);
            case SubAllocator.N4 /* 26 */:
                return ((xd1) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 27:
                return ((xd1) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 28:
                return ((xd1) q((r41) obj2, (w61) obj)).s(jg7Var);
            default:
                return ((xd1) q((r41) obj2, (r35) obj)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        Object obj2 = this.d0;
        switch (i) {
            case 0:
                return new xd1((ie2) this.Z, (yd1) obj2, r41Var, 0);
            case 1:
                return new xd1((ie2) this.Z, (t93) obj2, r41Var, 1);
            case 2:
                xd1 xd1Var = new xd1((EmulatorActivity) obj2, r41Var, 2);
                xd1Var.Z = obj;
                return xd1Var;
            case 3:
                return new xd1((EmulatorActivity) this.Z, (nx1) obj2, r41Var, 3);
            case 4:
                return new xd1((s9) obj2, r41Var, 4);
            case 5:
                return new xd1((vw1) this.Z, (ConsoleType) obj2, r41Var, 5);
            case 6:
                return new xd1((vw1) this.Z, (pq5) obj2, r41Var, 6);
            case 7:
                return new xd1((bt) this.Z, (Vibrator) obj2, r41Var, 7);
            case 8:
                return new xd1((sz1) this.Z, (ConsoleType) obj2, r41Var, 8);
            case 9:
                return new xd1((sz1) this.Z, (Uri) obj2, r41Var, 9);
            case 10:
                return new xd1((sz1) this.Z, (String) obj2, r41Var, 10);
            case 11:
                return new xd1((sz1) this.Z, (kb5) obj2, r41Var, 11);
            case 12:
                return new xd1((sz1) this.Z, (lx5) obj2, r41Var, 12);
            case 13:
                return new xd1((sz1) this.Z, (RewindSaveState) obj2, r41Var, 13);
            case 14:
                return new xd1((bt) this.Z, (of0) obj2, r41Var, 14);
            case 15:
                xd1 xd1Var2 = new xd1((xb2) obj2, r41Var, 15);
                xd1Var2.Z = obj;
                return xd1Var2;
            case 16:
                return new xd1((xb2) this.Z, (Set) obj2, r41Var, 16);
            case 17:
                xd1 xd1Var3 = new xd1((le2) obj2, r41Var, 17);
                xd1Var3.Z = obj;
                return xd1Var3;
            case 18:
                return new xd1((ta7) this.Z, (GameTranslationOverlayView) obj2, r41Var, 18);
            case 19:
                xd1 xd1Var4 = new xd1((hq2) obj2, r41Var, 19);
                xd1Var4.Z = obj;
                return xd1Var4;
            case 20:
                return new xd1((b) this.Z, (pq5) obj2, r41Var, 20);
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                xd1 xd1Var5 = new xd1((me.magnum.melonds.ui.layouteditor.b) obj2, r41Var, 21);
                xd1Var5.Z = obj;
                return xd1Var5;
            case 22:
                return new xd1((wa3) this.Z, (qn3) obj2, r41Var, 22);
            case ConnectionResult.API_DISABLED /* 23 */:
                return new xd1((wa3) this.Z, (eo3) obj2, r41Var, 23);
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                return new xd1((zy4) this.Z, (ue1) obj2, r41Var, 24);
            case 25:
                return new xd1((q3) this.Z, (qa4) obj2, r41Var, 25);
            case SubAllocator.N4 /* 26 */:
                return new xd1((et3) this.Z, (l5) obj2, r41Var, 26);
            case 27:
                return new xd1((rp6) this.Z, (o74) obj2, r41Var, 27);
            case 28:
                xd1 xd1Var6 = new xd1((m84) obj2, r41Var, 28);
                xd1Var6.Z = obj;
                return xd1Var6;
            default:
                xd1 xd1Var7 = new xd1((ConnectivityManager) obj2, r41Var, 29);
                xd1Var7.Z = obj;
                return xd1Var7;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x026a, code lost:
        if (r4 == r3) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0283, code lost:
        if (r1 == r3) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0286, code lost:
        return r3;
     */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        xq7 xq7Var;
        zx1 zx1Var;
        in5 in5Var;
        int i;
        String S0;
        long j;
        dy1 dy1Var;
        yr7 yr7Var;
        Object B;
        VulkanPipelineProfile vulkanPipelineProfile;
        yc2 uc2Var;
        Object n;
        wx5 qx5Var;
        Object p;
        Object l;
        Object k;
        Object w;
        xb0 xb0Var;
        Object a;
        String str;
        boolean z = false;
        switch (this.X) {
            case 0:
                jg7 jg7Var = jg7.a;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
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
                    ie2 ie2Var = (ie2) this.Z;
                    this.Y = 1;
                    ie2Var.getClass();
                    Object b = ie2Var.b(this);
                    if (b != x61Var) {
                        b = jg7Var;
                    }
                    if (b == x61Var) {
                        return x61Var;
                    }
                }
                return jg7Var;
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
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
                    this.Y = 1;
                    if (((ie2) this.Z).a((t93) this.d0, this) == x61Var2) {
                        return x61Var2;
                    }
                }
                return jg7.a;
            case 2:
                EmulatorActivity emulatorActivity = (EmulatorActivity) this.d0;
                vs4 vs4Var = emulatorActivity.H1;
                vs4 vs4Var2 = emulatorActivity.I1;
                bt btVar = emulatorActivity.V1;
                vs4 vs4Var3 = emulatorActivity.G1;
                hy1 hy1Var = (hy1) this.Z;
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
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
                    if (hy1Var instanceof ey1) {
                        s8 s8Var = emulatorActivity.B0;
                        if (s8Var != null) {
                            s8Var.m.setVisibility(4);
                            s8 s8Var2 = emulatorActivity.B0;
                            if (s8Var2 != null) {
                                s8Var2.i.setVisibility(8);
                                s8 s8Var3 = emulatorActivity.B0;
                                if (s8Var3 != null) {
                                    s8Var3.j.setVisibility(8);
                                    s8 s8Var4 = emulatorActivity.B0;
                                    if (s8Var4 != null) {
                                        s8Var4.g.setVisibility(8);
                                        s8 s8Var5 = emulatorActivity.B0;
                                        if (s8Var5 != null) {
                                            s8Var5.k.setVisibility(8);
                                        } else {
                                            nb3.a0("binding");
                                            throw null;
                                        }
                                    } else {
                                        nb3.a0("binding");
                                        throw null;
                                    }
                                } else {
                                    nb3.a0("binding");
                                    throw null;
                                }
                            } else {
                                nb3.a0("binding");
                                throw null;
                            }
                        } else {
                            nb3.a0("binding");
                            throw null;
                        }
                    } else if (hy1Var instanceof fy1) {
                        EmulatorActivity.C(emulatorActivity);
                        s9 s9Var = emulatorActivity.Q0;
                        if (s9Var != null) {
                            ConsoleType consoleType = ((fy1) hy1Var).a;
                            consoleType.getClass();
                            vw1 A = s9Var.A();
                            A.f = new tw1(consoleType);
                            hv.L(to7.a(A), null, null, new xd1(A, consoleType, null, 5), 3);
                        } else {
                            nb3.a0("emulatorLaunchValidatorDelegate");
                            throw null;
                        }
                    } else if (hy1Var instanceof gy1) {
                        pq5 pq5Var = ((gy1) hy1Var).a;
                        jt5 jt5Var = pq5Var.f;
                        String str2 = pq5Var.a;
                        String str3 = jt5Var.e;
                        if (str3 == null) {
                            str3 = str2;
                        }
                        vs4Var2.setValue(str3);
                        emulatorActivity.J1.setValue(pq5Var);
                        emulatorActivity.K1.setValue(null);
                        if (pq5Var.c()) {
                            Long l2 = pq5Var.l;
                            if (l2 != null) {
                                j = l2.longValue();
                            } else {
                                j = 0;
                            }
                            int i5 = (int) (j & 4294967295L);
                            byte[] bArr = {(byte) (i5 >>> 24), (byte) (i5 >>> 16), (byte) (i5 >>> 8), (byte) i5};
                            Charset charset = StandardCharsets.ISO_8859_1;
                            charset.getClass();
                            String str4 = new String(bArr, charset);
                            StringBuilder sb = new StringBuilder();
                            int length = str4.length();
                            for (int i6 = 0; i6 < length; i6++) {
                                char charAt = str4.charAt(i6);
                                if (Character.isLetterOrDigit(charAt)) {
                                    sb.append(charAt);
                                }
                            }
                            S0 = sb.toString();
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            int length2 = str2.length();
                            for (int i7 = 0; i7 < length2; i7++) {
                                char charAt2 = str2.charAt(i7);
                                if (Character.isLetterOrDigit(charAt2)) {
                                    sb2.append(charAt2);
                                }
                            }
                            S0 = qs6.S0(4, sb2.toString());
                        }
                        hq2 V = emulatorActivity.V();
                        String str5 = pq5Var.i;
                        V.r = str2;
                        V.s = S0;
                        V.t = str5;
                        StringBuilder u = i61.u("Active ROM set: title='", str2, "', code='", S0, "', hash='");
                        u.append(str5);
                        u.append("'");
                        Log.i("GameTranslatorManager", u.toString());
                        V.e();
                        hv.L(bl2.C(emulatorActivity), null, null, new b0(emulatorActivity, pq5Var, null, 26), 3);
                        EmulatorActivity.C(emulatorActivity);
                        s9 s9Var2 = emulatorActivity.Q0;
                        if (s9Var2 != null) {
                            vw1 A2 = s9Var2.A();
                            A2.f = new uw1(pq5Var);
                            hv.L(to7.a(A2), null, null, new xd1(A2, pq5Var, null, 6), 3);
                        } else {
                            nb3.a0("emulatorLaunchValidatorDelegate");
                            throw null;
                        }
                    } else {
                        boolean z2 = hy1Var instanceof yx1;
                        if (!z2 && !(hy1Var instanceof zx1)) {
                            if (!(hy1Var instanceof dy1) && !(hy1Var instanceof cy1)) {
                                if (hy1Var instanceof ay1) {
                                    s8 s8Var6 = emulatorActivity.B0;
                                    if (s8Var6 != null) {
                                        s8Var6.m.setVisibility(4);
                                        s8 s8Var7 = emulatorActivity.B0;
                                        if (s8Var7 != null) {
                                            s8Var7.i.setVisibility(8);
                                            s8 s8Var8 = emulatorActivity.B0;
                                            if (s8Var8 != null) {
                                                s8Var8.j.setVisibility(8);
                                                s8 s8Var9 = emulatorActivity.B0;
                                                if (s8Var9 != null) {
                                                    s8Var9.g.setVisibility(8);
                                                    s8 s8Var10 = emulatorActivity.B0;
                                                    if (s8Var10 != null) {
                                                        s8Var10.k.setVisibility(8);
                                                        vs4Var3.setValue(Boolean.FALSE);
                                                        c92 c92Var = emulatorActivity.K0;
                                                        if (c92Var != null) {
                                                            c92Var.a(null);
                                                        }
                                                        btVar.z(ex1.ROM_LOAD_ERROR_DIALOG);
                                                        zb zbVar = new zb(emulatorActivity);
                                                        ((wb) zbVar.L).m = false;
                                                        zbVar.z(R.string.error_load_rom);
                                                        zbVar.w(R.string.error_load_rom_message);
                                                        zbVar.y(R.string.ok, new fu1(emulatorActivity, 4));
                                                        zbVar.B();
                                                    } else {
                                                        nb3.a0("binding");
                                                        throw null;
                                                    }
                                                } else {
                                                    nb3.a0("binding");
                                                    throw null;
                                                }
                                            } else {
                                                nb3.a0("binding");
                                                throw null;
                                            }
                                        } else {
                                            nb3.a0("binding");
                                            throw null;
                                        }
                                    } else {
                                        nb3.a0("binding");
                                        throw null;
                                    }
                                } else if (hy1Var instanceof xx1) {
                                    s8 s8Var11 = emulatorActivity.B0;
                                    if (s8Var11 != null) {
                                        s8Var11.m.setVisibility(4);
                                        s8 s8Var12 = emulatorActivity.B0;
                                        if (s8Var12 != null) {
                                            s8Var12.i.setVisibility(8);
                                            s8 s8Var13 = emulatorActivity.B0;
                                            if (s8Var13 != null) {
                                                s8Var13.j.setVisibility(8);
                                                s8 s8Var14 = emulatorActivity.B0;
                                                if (s8Var14 != null) {
                                                    s8Var14.g.setVisibility(8);
                                                    s8 s8Var15 = emulatorActivity.B0;
                                                    if (s8Var15 != null) {
                                                        s8Var15.k.setVisibility(8);
                                                        vs4Var3.setValue(Boolean.FALSE);
                                                        c92 c92Var2 = emulatorActivity.K0;
                                                        if (c92Var2 != null) {
                                                            c92Var2.a(null);
                                                        }
                                                        btVar.z(ex1.FIRMWARE_LOAD_ERROR_DIALOG);
                                                        zb zbVar2 = new zb(emulatorActivity);
                                                        wb wbVar = (wb) zbVar2.L;
                                                        wbVar.m = false;
                                                        zbVar2.z(R.string.error_load_firmware);
                                                        wbVar.f = emulatorActivity.getResources().getString(R.string.error_load_firmware_message, ((xx1) hy1Var).a.toString());
                                                        zbVar2.y(R.string.ok, new fu1(emulatorActivity, 3));
                                                        zbVar2.B();
                                                    } else {
                                                        nb3.a0("binding");
                                                        throw null;
                                                    }
                                                } else {
                                                    nb3.a0("binding");
                                                    throw null;
                                                }
                                            } else {
                                                nb3.a0("binding");
                                                throw null;
                                            }
                                        } else {
                                            nb3.a0("binding");
                                            throw null;
                                        }
                                    } else {
                                        nb3.a0("binding");
                                        throw null;
                                    }
                                } else if (hy1Var instanceof by1) {
                                    s8 s8Var16 = emulatorActivity.B0;
                                    if (s8Var16 != null) {
                                        s8Var16.m.setVisibility(4);
                                        s8 s8Var17 = emulatorActivity.B0;
                                        if (s8Var17 != null) {
                                            s8Var17.i.setVisibility(8);
                                            s8 s8Var18 = emulatorActivity.B0;
                                            if (s8Var18 != null) {
                                                s8Var18.j.setVisibility(8);
                                                s8 s8Var19 = emulatorActivity.B0;
                                                if (s8Var19 != null) {
                                                    s8Var19.g.setVisibility(8);
                                                    s8 s8Var20 = emulatorActivity.B0;
                                                    if (s8Var20 != null) {
                                                        s8Var20.k.setVisibility(8);
                                                        vs4Var3.setValue(Boolean.FALSE);
                                                        c92 c92Var3 = emulatorActivity.K0;
                                                        if (c92Var3 != null) {
                                                            c92Var3.a(null);
                                                        }
                                                        String str6 = ((by1) hy1Var).a;
                                                        btVar.z(ex1.ROM_NOT_FOUND_DIALOG);
                                                        zb zbVar3 = new zb(emulatorActivity);
                                                        zbVar3.z(R.string.error_rom_not_found);
                                                        String string = emulatorActivity.getString(R.string.error_rom_not_found_info, str6);
                                                        wb wbVar2 = (wb) zbVar3.L;
                                                        wbVar2.f = string;
                                                        zbVar3.y(R.string.ok, new fu1(emulatorActivity, 2));
                                                        wbVar2.o = new ku1(emulatorActivity, 3);
                                                        zbVar3.B();
                                                    } else {
                                                        nb3.a0("binding");
                                                        throw null;
                                                    }
                                                } else {
                                                    nb3.a0("binding");
                                                    throw null;
                                                }
                                            } else {
                                                nb3.a0("binding");
                                                throw null;
                                            }
                                        } else {
                                            nb3.a0("binding");
                                            throw null;
                                        }
                                    } else {
                                        nb3.a0("binding");
                                        throw null;
                                    }
                                } else {
                                    i.d();
                                    return null;
                                }
                            } else {
                                this.Z = hy1Var;
                                this.Y = 1;
                                if (EmulatorActivity.B(emulatorActivity, this) == x61Var3) {
                                    return x61Var3;
                                }
                            }
                        } else {
                            EmulatorActivity.C(emulatorActivity);
                            boolean z3 = hy1Var instanceof zx1;
                            if (z3) {
                                xq7Var = ((zx1) hy1Var).a;
                            } else if (z2) {
                                xq7Var = ((yx1) hy1Var).a;
                            } else {
                                i.d();
                                return null;
                            }
                            if (z3) {
                                zx1Var = (zx1) hy1Var;
                            } else {
                                zx1Var = null;
                            }
                            if (zx1Var != null) {
                                in5Var = zx1Var.b;
                            } else {
                                in5Var = null;
                            }
                            vs4 vs4Var4 = emulatorActivity.M1;
                            if (!((Boolean) vs4Var.getValue()).booleanValue() && !(emulatorActivity.W().q0.A.getValue() instanceof dy1) && !(emulatorActivity.W().q0.A.getValue() instanceof cy1)) {
                                if (in5Var == in5.FETCHING_LATEST_DATA) {
                                    s8 s8Var21 = emulatorActivity.B0;
                                    if (s8Var21 != null) {
                                        s8Var21.j.setText(R.string.info_refreshing_retroachievements_title);
                                        s8 s8Var22 = emulatorActivity.B0;
                                        if (s8Var22 != null) {
                                            s8Var22.g.setVisibility(0);
                                            s8 s8Var23 = emulatorActivity.B0;
                                            if (s8Var23 != null) {
                                                s8Var23.g.setIndeterminate(true);
                                                s8 s8Var24 = emulatorActivity.B0;
                                                if (s8Var24 != null) {
                                                    s8Var24.k.setVisibility(0);
                                                    s8 s8Var25 = emulatorActivity.B0;
                                                    if (s8Var25 != null) {
                                                        s8Var25.k.setText(R.string.info_refreshing_retroachievements_detail);
                                                        vs4Var4.setValue(emulatorActivity.getString(R.string.info_refreshing_retroachievements_title));
                                                    } else {
                                                        nb3.a0("binding");
                                                        throw null;
                                                    }
                                                } else {
                                                    nb3.a0("binding");
                                                    throw null;
                                                }
                                            } else {
                                                nb3.a0("binding");
                                                throw null;
                                            }
                                        } else {
                                            nb3.a0("binding");
                                            throw null;
                                        }
                                    } else {
                                        nb3.a0("binding");
                                        throw null;
                                    }
                                } else {
                                    if (xq7Var != null) {
                                        int i8 = xq7Var.a;
                                        if (xq7Var.c > 0) {
                                            s8 s8Var26 = emulatorActivity.B0;
                                            if (s8Var26 != null) {
                                                TextView textView = s8Var26.j;
                                                int i9 = R.string.info_vulkan_compiling_title;
                                                if (i8 == 5) {
                                                    i = R.string.info_retroarch_compiling_title;
                                                } else {
                                                    i = R.string.info_vulkan_compiling_title;
                                                }
                                                textView.setText(i);
                                                s8 s8Var27 = emulatorActivity.B0;
                                                if (s8Var27 != null) {
                                                    s8Var27.g.setVisibility(0);
                                                    s8 s8Var28 = emulatorActivity.B0;
                                                    if (s8Var28 != null) {
                                                        s8Var28.g.setIndeterminate(true);
                                                        s8 s8Var29 = emulatorActivity.B0;
                                                        if (s8Var29 != null) {
                                                            s8Var29.k.setVisibility(0);
                                                            s8 s8Var30 = emulatorActivity.B0;
                                                            if (s8Var30 != null) {
                                                                TextView textView2 = s8Var30.k;
                                                                int i10 = R.string.info_vulkan_compiling_stage_init;
                                                                if (i8 != 1) {
                                                                    if (i8 != 2) {
                                                                        if (i8 != 3) {
                                                                            if (i8 != 4) {
                                                                                if (i8 == 5) {
                                                                                    i10 = R.string.info_vulkan_compiling_stage_retroarch;
                                                                                }
                                                                            } else {
                                                                                i10 = R.string.info_vulkan_compiling_stage_warmup;
                                                                            }
                                                                        } else {
                                                                            i10 = R.string.info_vulkan_compiling_stage_output;
                                                                        }
                                                                    } else {
                                                                        i10 = R.string.info_vulkan_compiling_stage_pipelines;
                                                                    }
                                                                }
                                                                String string2 = emulatorActivity.getString(i10);
                                                                string2.getClass();
                                                                textView2.setText(string2);
                                                                if (i8 == 5) {
                                                                    i9 = R.string.info_retroarch_compiling_title;
                                                                }
                                                                vs4Var4.setValue(emulatorActivity.getString(i9));
                                                            } else {
                                                                nb3.a0("binding");
                                                                throw null;
                                                            }
                                                        } else {
                                                            nb3.a0("binding");
                                                            throw null;
                                                        }
                                                    } else {
                                                        nb3.a0("binding");
                                                        throw null;
                                                    }
                                                } else {
                                                    nb3.a0("binding");
                                                    throw null;
                                                }
                                            } else {
                                                nb3.a0("binding");
                                                throw null;
                                            }
                                        }
                                    }
                                    s8 s8Var31 = emulatorActivity.B0;
                                    if (s8Var31 != null) {
                                        s8Var31.j.setText(R.string.info_loading);
                                        s8 s8Var32 = emulatorActivity.B0;
                                        if (s8Var32 != null) {
                                            s8Var32.g.setVisibility(0);
                                            s8 s8Var33 = emulatorActivity.B0;
                                            if (s8Var33 != null) {
                                                s8Var33.g.setIndeterminate(true);
                                                s8 s8Var34 = emulatorActivity.B0;
                                                if (s8Var34 != null) {
                                                    s8Var34.k.setVisibility(8);
                                                    vs4Var4.setValue(emulatorActivity.getString(R.string.info_loading));
                                                } else {
                                                    nb3.a0("binding");
                                                    throw null;
                                                }
                                            } else {
                                                nb3.a0("binding");
                                                throw null;
                                            }
                                        } else {
                                            nb3.a0("binding");
                                            throw null;
                                        }
                                    } else {
                                        nb3.a0("binding");
                                        throw null;
                                    }
                                }
                            } else {
                                s8 s8Var35 = emulatorActivity.B0;
                                if (s8Var35 != null) {
                                    s8Var35.j.setVisibility(8);
                                    s8 s8Var36 = emulatorActivity.B0;
                                    if (s8Var36 != null) {
                                        s8Var36.g.setVisibility(8);
                                        s8 s8Var37 = emulatorActivity.B0;
                                        if (s8Var37 != null) {
                                            s8Var37.k.setVisibility(8);
                                        } else {
                                            nb3.a0("binding");
                                            throw null;
                                        }
                                    } else {
                                        nb3.a0("binding");
                                        throw null;
                                    }
                                } else {
                                    nb3.a0("binding");
                                    throw null;
                                }
                            }
                        }
                    }
                    return jg7.a;
                }
                if (hy1Var instanceof dy1) {
                    dy1Var = (dy1) hy1Var;
                } else {
                    dy1Var = null;
                }
                if (dy1Var != null) {
                    pq5 pq5Var2 = dy1Var.a;
                    String str7 = pq5Var2.f.e;
                    if (str7 == null) {
                        str7 = pq5Var2.a;
                    }
                    vs4Var2.setValue(str7);
                }
                vs4Var.setValue(Boolean.TRUE);
                vs4Var3.setValue(Boolean.FALSE);
                c92 c92Var4 = emulatorActivity.K0;
                if (c92Var4 != null) {
                    c92Var4.a(null);
                }
                emulatorActivity.r0();
                emulatorActivity.p0();
                emulatorActivity.q0();
                s8 s8Var38 = emulatorActivity.B0;
                if (s8Var38 != null) {
                    s8Var38.j.setVisibility(8);
                    s8 s8Var39 = emulatorActivity.B0;
                    if (s8Var39 != null) {
                        s8Var39.g.setVisibility(8);
                        s8 s8Var40 = emulatorActivity.B0;
                        if (s8Var40 != null) {
                            s8Var40.k.setVisibility(8);
                            s8 s8Var41 = emulatorActivity.B0;
                            if (s8Var41 != null) {
                                s8Var41.h.setVisibility(0);
                                s8 s8Var42 = emulatorActivity.B0;
                                if (s8Var42 != null) {
                                    s8Var42.m.setVisibility(0);
                                    emulatorActivity.v1.f(true);
                                    emulatorActivity.o0();
                                    if (!btVar.M()) {
                                        sz1 W = emulatorActivity.W();
                                        if (W.j0.get() == 0 && nb3.k(((tp6) W.h0.R).getValue(), uc5.a) && !((AtomicBoolean) W.V.A).get()) {
                                            emulatorActivity.W().T0();
                                        }
                                    }
                                    return jg7.a;
                                }
                                nb3.a0("binding");
                                throw null;
                            }
                            nb3.a0("binding");
                            throw null;
                        }
                        nb3.a0("binding");
                        throw null;
                    }
                    nb3.a0("binding");
                    throw null;
                }
                nb3.a0("binding");
                throw null;
            case 3:
                jg7 jg7Var2 = jg7.a;
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                int i11 = this.Y;
                if (i11 != 0) {
                    if (i11 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    int i12 = EmulatorActivity.Z1;
                    be5 be5Var = ((EmulatorActivity) this.Z).W().G0;
                    xv1 xv1Var = new xv1((nx1) this.d0, 0);
                    this.Y = 1;
                    Object b2 = be5Var.A.b(new a7(xv1Var, 11), this);
                    if (b2 != x61Var4) {
                        b2 = jg7Var2;
                    }
                    if (b2 == x61Var4) {
                        return x61Var4;
                    }
                }
                return jg7Var2;
            case 4:
                s9 s9Var3 = (s9) this.d0;
                kd6 kd6Var = (kd6) s9Var3.e;
                MelonDSAndroidInterface melonDSAndroidInterface = MelonDSAndroidInterface.a;
                x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                int i13 = this.Y;
                if (i13 != 0) {
                    if (i13 == 1) {
                        oi2.Y(obj);
                        yr7Var = (yr7) this.Z;
                        B = obj;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    String str8 = ((Context) s9Var3.a).getApplicationInfo().nativeLibraryDir;
                    str8.getClass();
                    melonDSAndroidInterface.b(((ng6) kd6Var).z(str8));
                    yr7Var = VulkanPipelineProfile.Companion;
                    ng6 ng6Var = (ng6) kd6Var;
                    wp0 p2 = ng6Var.p("video_vulkan_fastpath_enabled", new tf6(ng6Var, 18));
                    this.Z = yr7Var;
                    this.Y = 1;
                    B = f04.B(p2, this);
                    if (B == x61Var5) {
                        return x61Var5;
                    }
                }
                boolean booleanValue = ((Boolean) B).booleanValue();
                yr7Var.getClass();
                if (booleanValue) {
                    vulkanPipelineProfile = VulkanPipelineProfile.FASTPATH;
                } else {
                    vulkanPipelineProfile = VulkanPipelineProfile.COMPATIBILITY;
                }
                if (!melonDSAndroidInterface.c()) {
                    return nw1.UNSUPPORTED;
                }
                if (melonDSAndroidInterface.a(vulkanPipelineProfile)) {
                    return null;
                }
                return nw1.INIT_FAILED;
            case 5:
                ConsoleType consoleType2 = (ConsoleType) this.d0;
                vw1 vw1Var = (vw1) this.Z;
                x61 x61Var6 = x61.COROUTINE_SUSPENDED;
                int i14 = this.Y;
                try {
                    if (i14 != 0) {
                        if (i14 == 1) {
                            oi2.Y(obj);
                            n = obj;
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        s9 s9Var4 = vw1Var.b;
                        this.Y = 1;
                        n = s9Var4.n(consoleType2, this);
                        if (n == x61Var6) {
                            return x61Var6;
                        }
                    }
                    uc2Var = (yc2) n;
                } catch (Throwable th) {
                    if (!(th instanceof CancellationException)) {
                        Log.e("LaunchValidationVM", "Firmware launch precondition check failed; blocking launch", th);
                        uc2Var = new uc2(new dz0(consoleType2, cz0.INVALID, new String[0], new vr4[0]));
                    } else {
                        throw th;
                    }
                }
                vw1Var.d.k(new fj3(uc2Var));
                if (uc2Var instanceof xc2) {
                    vw1Var.f = null;
                }
                return jg7.a;
            case 6:
                vw1 vw1Var2 = (vw1) this.Z;
                x61 x61Var7 = x61.COROUTINE_SUSPENDED;
                int i15 = this.Y;
                try {
                    if (i15 != 0) {
                        if (i15 == 1) {
                            oi2.Y(obj);
                            p = obj;
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        this.Y = 1;
                        p = vw1Var2.b.p((pq5) this.d0, this);
                        if (p == x61Var7) {
                            return x61Var7;
                        }
                    }
                    qx5Var = (wx5) p;
                } catch (Throwable th2) {
                    if (!(th2 instanceof CancellationException)) {
                        Log.e("LaunchValidationVM", "ROM launch precondition check failed; blocking launch", th2);
                        qx5Var = new qx5(new dz0(ConsoleType.DS, cz0.INVALID, new String[0], new vr4[0]));
                    } else {
                        throw th2;
                    }
                }
                vw1Var2.d.k(new gj3(qx5Var));
                if (qx5Var instanceof vx5) {
                    vw1Var2.f = null;
                }
                return jg7.a;
            case 7:
                x61 x61Var8 = x61.COROUTINE_SUSPENDED;
                int i16 = this.Y;
                if (i16 != 0) {
                    if (i16 != 1) {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    bt btVar2 = (bt) this.Z;
                    de5 de5Var = ((lz0) btVar2.B).d;
                    zb0 zb0Var = new zb0(4, btVar2, (Vibrator) this.d0);
                    this.Y = 1;
                    if (de5Var.A.b(zb0Var, this) == x61Var8) {
                        return x61Var8;
                    }
                }
                e41.c();
                return null;
            case 8:
                jg7 jg7Var3 = jg7.a;
                ConsoleType consoleType3 = (ConsoleType) this.d0;
                sz1 sz1Var = (sz1) this.Z;
                x61 x61Var9 = x61.COROUTINE_SUSPENDED;
                int i17 = this.Y;
                if (i17 != 0) {
                    if (i17 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    sz1.T(sz1Var, new yx1(null));
                    qx1 qx1Var = new qx1(consoleType3);
                    this.Y = 1;
                    ((ng6) sz1Var.c).b.getBoolean("ra_hardcore_enabled", false);
                    sx1 sx1Var = sz1Var.w;
                    sx1Var.b = false;
                    sx1Var.a = false;
                    sx1Var.d = false;
                    sx1Var.e = qx1Var;
                    if (jg7Var3 == x61Var9) {
                        return x61Var9;
                    }
                }
                hv.L(sz1Var.z, null, null, new y12(sz1Var, consoleType3, null), 3);
                return jg7Var3;
            case 9:
                Uri uri = (Uri) this.d0;
                sz1 sz1Var2 = (sz1) this.Z;
                x61 x61Var10 = x61.COROUTINE_SUSPENDED;
                int i18 = this.Y;
                if (i18 != 0) {
                    if (i18 == 1) {
                        oi2.Y(obj);
                        l = obj;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    p06 p06Var = sz1Var2.e;
                    this.Y = 1;
                    l = ((xb2) p06Var).l(uri, this);
                    if (l == x61Var10) {
                        return x61Var10;
                    }
                }
                pq5 pq5Var3 = (pq5) l;
                tp6 tp6Var = sz1Var2.p0;
                if (pq5Var3 != null) {
                    gy1 gy1Var = new gy1(pq5Var3);
                    tp6Var.getClass();
                    tp6Var.m(null, gy1Var);
                } else {
                    String uri2 = uri.toString();
                    uri2.getClass();
                    by1 by1Var = new by1(uri2);
                    tp6Var.getClass();
                    tp6Var.m(null, by1Var);
                }
                return jg7.a;
            case 10:
                String str9 = (String) this.d0;
                sz1 sz1Var3 = (sz1) this.Z;
                x61 x61Var11 = x61.COROUTINE_SUSPENDED;
                int i19 = this.Y;
                if (i19 != 0) {
                    if (i19 == 1) {
                        oi2.Y(obj);
                        k = obj;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    p06 p06Var2 = sz1Var3.e;
                    this.Y = 1;
                    k = ((xb2) p06Var2).k(str9, this);
                    if (k == x61Var11) {
                        return x61Var11;
                    }
                }
                pq5 pq5Var4 = (pq5) k;
                tp6 tp6Var2 = sz1Var3.p0;
                if (pq5Var4 != null) {
                    gy1 gy1Var2 = new gy1(pq5Var4);
                    tp6Var2.getClass();
                    tp6Var2.m(null, gy1Var2);
                } else {
                    by1 by1Var2 = new by1(str9);
                    tp6Var2.getClass();
                    tp6Var2.m(null, by1Var2);
                }
                return jg7.a;
            case 11:
                jg7 jg7Var4 = jg7.a;
                x61 x61Var12 = x61.COROUTINE_SUSPENDED;
                int i20 = this.Y;
                try {
                    if (i20 != 0) {
                        if (i20 == 1) {
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        kb5 kb5Var = (kb5) this.d0;
                        kw3 I = hf.I();
                        I.add(kb5Var.c.toString());
                        ArrayList arrayList = kb5Var.e;
                        int size = arrayList.size();
                        int i21 = 0;
                        while (i21 < size) {
                            Object obj2 = arrayList.get(i21);
                            i21++;
                            gb5 gb5Var = (gb5) obj2;
                            I.add(gb5Var.e.toString());
                            ArrayList arrayList2 = gb5Var.f;
                            int size2 = arrayList2.size();
                            int i22 = 0;
                            while (i22 < size2) {
                                Object obj3 = arrayList2.get(i22);
                                i22++;
                                eb5 eb5Var = (eb5) obj3;
                                I.add(eb5Var.a.k.toString());
                                I.add(eb5Var.a.j.toString());
                            }
                        }
                        kw3 A3 = hf.A(I);
                        hn5 hn5Var = ((sz1) this.Z).k;
                        this.Y = 1;
                        hn5Var.getClass();
                        xe1 xe1Var = xk1.a;
                        Object d0 = hv.d0(de1.L, new m5((Object) hn5Var, (Object) A3, (r41) null, 24), this);
                        if (d0 != x61.COROUTINE_SUSPENDED) {
                            d0 = jg7Var4;
                        }
                        if (d0 == x61Var12) {
                            return x61Var12;
                        }
                    }
                } catch (Exception unused) {
                }
                return jg7Var4;
            case 12:
                jg7 jg7Var5 = jg7.a;
                sz1 sz1Var4 = (sz1) this.Z;
                x61 x61Var13 = x61.COROUTINE_SUSPENDED;
                int i23 = this.Y;
                if (i23 != 0) {
                    if (i23 != 1) {
                        if (i23 == 2) {
                            oi2.Y(obj);
                            return jg7Var5;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                    w = obj;
                } else {
                    oi2.Y(obj);
                    this.Y = 1;
                    w = sz1.w(sz1Var4, (lx5) this.d0, this);
                    break;
                }
                jh jhVar = sz1Var4.v;
                this.Y = 2;
                jhVar.getClass();
                MelonEmulator.a.setupCheats((Cheat[]) ((List) w).toArray(new Cheat[0]));
                break;
            case 13:
                x61 x61Var14 = x61.COROUTINE_SUSPENDED;
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
                    jh jhVar2 = ((sz1) this.Z).v;
                    this.Y = 1;
                    jhVar2.getClass();
                    if (Boolean.valueOf(MelonEmulator.a.loadRewindState((RewindSaveState) this.d0)) == x61Var14) {
                        return x61Var14;
                    }
                }
                return jg7.a;
            case 14:
                x61 x61Var15 = x61.COROUTINE_SUSPENDED;
                int i25 = this.Y;
                if (i25 != 0) {
                    if (i25 == 1) {
                        oi2.Y(obj);
                        a = obj;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    tg0 tg0Var = (tg0) ((bt) this.Z).L;
                    kf0 kf0Var = ((of0) this.d0).a;
                    this.Y = 1;
                    synchronized (tg0Var.c) {
                        if (!tg0Var.d) {
                            xb0Var = ((rd0) ((m55) tg0Var.a.v).get()).d;
                        } else {
                            throw new IllegalStateException("Check failed.");
                        }
                    }
                    if (xb0Var != null) {
                        a = xb0Var.a(kf0Var, this);
                        if (a == x61Var15) {
                            return x61Var15;
                        }
                    } else {
                        i.m("Required value was null.");
                        return null;
                    }
                }
                of0 of0Var = (of0) this.d0;
                zy0 zy0Var = (zy0) a;
                int i26 = zy0Var.a;
                if (kj2.F("CXCP")) {
                    List<ji0> list = of0Var.a.b;
                    ArrayList arrayList3 = new ArrayList(ht0.v0(list, 10));
                    for (ji0 ji0Var : list) {
                        List<pp4> list2 = ji0Var.a;
                        ArrayList arrayList4 = new ArrayList(ht0.v0(list2, 10));
                        for (pp4 pp4Var : list2) {
                            arrayList4.add("size=" + pp4Var.a + ", format=" + ((Object) fr6.b(pp4Var.b)) + ", dynamicRangeProfile" + pp4Var.e);
                        }
                        arrayList3.add(arrayList4);
                    }
                    StringBuilder sb3 = new StringBuilder("FeatureCombinationQueryImpl#isSupported: result = ");
                    if (i26 == 1) {
                        str = "SUPPORTED";
                    } else if (i26 == 2) {
                        str = "UNSUPPORTED";
                    } else {
                        str = "UNKNOWN";
                    }
                    sb3.append((Object) str);
                    sb3.append(" for sessionParameters = ");
                    sb3.append(of0Var.a.g);
                    sb3.append(" and streams = ");
                    sb3.append(arrayList3);
                    Log.d("CXCP", sb3.toString());
                }
                if (zy0Var.a == 1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 15:
                xb2 xb2Var = (xb2) this.d0;
                ne2 ne2Var = (ne2) this.Z;
                x61 x61Var16 = x61.COROUTINE_SUSPENDED;
                int i27 = this.Y;
                if (i27 != 0) {
                    if (i27 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    if (xb2Var.n.compareAndSet(false, true)) {
                        hv.L(xb2Var.h, null, null, new ib2(xb2Var, null, 2), 3);
                    }
                    of6 of6Var = xb2Var.k;
                    this.Z = null;
                    this.Y = 1;
                    if (f04.A(ne2Var, of6Var, this) == x61Var16) {
                        return x61Var16;
                    }
                }
                return jg7.a;
            case 16:
                return v(obj);
            case 17:
                x61 x61Var17 = x61.COROUTINE_SUSPENDED;
                int i28 = this.Y;
                if (i28 != 0) {
                    if (i28 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    y6 y6Var = new y6((r35) this.Z, 8);
                    this.Y = 1;
                    if (((le2) this.d0).b(y6Var, this) == x61Var17) {
                        return x61Var17;
                    }
                }
                return jg7.a;
            case 18:
                return x(obj);
            case 19:
                return z(obj);
            case 20:
                return A(obj);
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return B(obj);
            case 22:
                return C(obj);
            case ConnectionResult.API_DISABLED /* 23 */:
                return D(obj);
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                return E(obj);
            case 25:
                return F(obj);
            case SubAllocator.N4 /* 26 */:
                return G(obj);
            case 27:
                return H(obj);
            case 28:
                return I(obj);
            default:
                ConnectivityManager connectivityManager = (ConnectivityManager) this.d0;
                r35 r35Var = (r35) this.Z;
                x61 x61Var18 = x61.COROUTINE_SUSPENDED;
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
                    c53 c53Var = new c53(r35Var, 1);
                    connectivityManager.registerDefaultNetworkCallback(c53Var);
                    ci2 ci2Var = new ci2(13, connectivityManager, c53Var);
                    this.Z = null;
                    this.Y = 1;
                    if (kj2.q(r35Var, ci2Var, this) == x61Var18) {
                        return x61Var18;
                    }
                }
                return jg7.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xd1(Object obj, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.d0 = obj;
    }
}
