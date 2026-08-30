package me.magnum.melonds.ui.emulator;

import a0.m;
import a4.n;
import a6.j2;
import a6.l2;
import a6.p0;
import a7.v;
import ah.h1;
import ah.j1;
import ah.m1;
import ah.o;
import ah.p;
import ah.x;
import ah.y;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Display;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.fragment.app.b1;
import androidx.lifecycle.s0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b9.e;
import cd.q1;
import com.squareup.picasso.a0;
import h.g;
import hh.c0;
import hh.d0;
import hh.e1;
import ih.a;
import ih.f;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import k7.w;
import kf.d2;
import me.magnum.melonds.MelonEmulator;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.impl.emulator.EmulatorMessageQueue;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import n2.f1;
import n2.s;
import nc.k;
import nc.u;
import oe.b0;
import oe.h0;
import p7.t;
import pf.q;
import sd.h;
import sf.c;
import sf.d;
import ve.i;
import w.x0;
import yb.j;
import yf.b;
import zc.g0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class EmulatorActivity extends j1 {

    /* renamed from: a1  reason: collision with root package name */
    public static final /* synthetic */ int f9503a1 = 0;
    public d A0;
    public c B0;
    public a0 C0;
    public h D0;
    public q E0;
    public b F0;
    public f G0;
    public Handler H0;
    public final p I0;
    public final eh.c J0;
    public v K0;
    public n L0;
    public x0 M0;
    public a N0;
    public ah.b O0;
    public m P0;
    public e Q0;
    public final ah.q R0;
    public final g S0;
    public final g T0;
    public final g U0;
    public final a7.n V0;
    public final jh.c W0;
    public final f1 X0;
    public final f1 Y0;
    public final n Z0;

    /* renamed from: y0  reason: collision with root package name */
    public d5.f f9504y0;

    /* renamed from: z0  reason: collision with root package name */
    public final v f9505z0;

    public EmulatorActivity() {
        super(0);
        ah.c cVar = new ah.c(this, 0);
        this.f9505z0 = new v(u.a(h1.class), new x(this, 1), new x(this, 0), new y(cVar, this));
        this.I0 = new p(this, 0);
        this.J0 = new eh.c();
        this.R0 = new ah.q(this);
        this.S0 = (g) s(new b1(4), new h.b(this) { // from class: ah.k
            public final /* synthetic */ EmulatorActivity B;

            {
                this.B = this;
            }

            @Override // h.b
            public final void a(Object obj) {
                hh.k kVar;
                ze.a aVar;
                oe.e0 e0Var;
                int i2 = r2;
                EmulatorActivity emulatorActivity = this.B;
                switch (i2) {
                    case 0:
                        int i10 = EmulatorActivity.f9503a1;
                        ((h.a) obj).getClass();
                        h1 C = emulatorActivity.C();
                        zc.x.v(C.f775o, null, null, new a2.o(C, (hh.o) C.f777q.getValue(), (cc.c) null, 3), 3);
                        emulatorActivity.getWindow().setSustainedPerformanceMode(((d2) emulatorActivity.C().f763b).f8181b.getBoolean("enable_sustained_performance", false));
                        emulatorActivity.D();
                        emulatorActivity.C().s();
                        return;
                    case DSiCameraSource.FrontCamera /* 1 */:
                        int i11 = EmulatorActivity.f9503a1;
                        ((h.a) obj).getClass();
                        h1 C2 = emulatorActivity.C();
                        Object value = C2.f777q.getValue();
                        if (value instanceof hh.k) {
                            kVar = (hh.k) value;
                        } else {
                            kVar = null;
                        }
                        if (kVar != null && (aVar = kVar.f6537a) != null) {
                            xf.a aVar2 = C2.f767f;
                            Uri uri = aVar.f15056d;
                            aVar2.getClass();
                            uri.getClass();
                            zd.f a10 = aVar2.a(k6.a.d(aVar2.f14600a, uri));
                            if (a10 != null) {
                                e0Var = a10.a(aVar);
                            } else {
                                e0Var = null;
                            }
                            if (e0Var != null) {
                                zc.x.v(C2.f775o, null, null, new a5.o(C2, e0Var, null, 5), 3);
                            }
                        }
                        emulatorActivity.C().s();
                        return;
                    default:
                        Map map = (Map) obj;
                        int i12 = EmulatorActivity.f9503a1;
                        map.getClass();
                        zc.x.v(androidx.lifecycle.s0.f(emulatorActivity), null, null, new w(map, emulatorActivity, null), 3);
                        return;
                }
            }
        });
        this.T0 = (g) s(new b1(4), new h.b(this) { // from class: ah.k
            public final /* synthetic */ EmulatorActivity B;

            {
                this.B = this;
            }

            @Override // h.b
            public final void a(Object obj) {
                hh.k kVar;
                ze.a aVar;
                oe.e0 e0Var;
                int i2 = r2;
                EmulatorActivity emulatorActivity = this.B;
                switch (i2) {
                    case 0:
                        int i10 = EmulatorActivity.f9503a1;
                        ((h.a) obj).getClass();
                        h1 C = emulatorActivity.C();
                        zc.x.v(C.f775o, null, null, new a2.o(C, (hh.o) C.f777q.getValue(), (cc.c) null, 3), 3);
                        emulatorActivity.getWindow().setSustainedPerformanceMode(((d2) emulatorActivity.C().f763b).f8181b.getBoolean("enable_sustained_performance", false));
                        emulatorActivity.D();
                        emulatorActivity.C().s();
                        return;
                    case DSiCameraSource.FrontCamera /* 1 */:
                        int i11 = EmulatorActivity.f9503a1;
                        ((h.a) obj).getClass();
                        h1 C2 = emulatorActivity.C();
                        Object value = C2.f777q.getValue();
                        if (value instanceof hh.k) {
                            kVar = (hh.k) value;
                        } else {
                            kVar = null;
                        }
                        if (kVar != null && (aVar = kVar.f6537a) != null) {
                            xf.a aVar2 = C2.f767f;
                            Uri uri = aVar.f15056d;
                            aVar2.getClass();
                            uri.getClass();
                            zd.f a10 = aVar2.a(k6.a.d(aVar2.f14600a, uri));
                            if (a10 != null) {
                                e0Var = a10.a(aVar);
                            } else {
                                e0Var = null;
                            }
                            if (e0Var != null) {
                                zc.x.v(C2.f775o, null, null, new a5.o(C2, e0Var, null, 5), 3);
                            }
                        }
                        emulatorActivity.C().s();
                        return;
                    default:
                        Map map = (Map) obj;
                        int i12 = EmulatorActivity.f9503a1;
                        map.getClass();
                        zc.x.v(androidx.lifecycle.s0.f(emulatorActivity), null, null, new w(map, emulatorActivity, null), 3);
                        return;
                }
            }
        });
        this.U0 = (g) s(new b1(2), new h.b(this) { // from class: ah.k
            public final /* synthetic */ EmulatorActivity B;

            {
                this.B = this;
            }

            @Override // h.b
            public final void a(Object obj) {
                hh.k kVar;
                ze.a aVar;
                oe.e0 e0Var;
                int i2 = r2;
                EmulatorActivity emulatorActivity = this.B;
                switch (i2) {
                    case 0:
                        int i10 = EmulatorActivity.f9503a1;
                        ((h.a) obj).getClass();
                        h1 C = emulatorActivity.C();
                        zc.x.v(C.f775o, null, null, new a2.o(C, (hh.o) C.f777q.getValue(), (cc.c) null, 3), 3);
                        emulatorActivity.getWindow().setSustainedPerformanceMode(((d2) emulatorActivity.C().f763b).f8181b.getBoolean("enable_sustained_performance", false));
                        emulatorActivity.D();
                        emulatorActivity.C().s();
                        return;
                    case DSiCameraSource.FrontCamera /* 1 */:
                        int i11 = EmulatorActivity.f9503a1;
                        ((h.a) obj).getClass();
                        h1 C2 = emulatorActivity.C();
                        Object value = C2.f777q.getValue();
                        if (value instanceof hh.k) {
                            kVar = (hh.k) value;
                        } else {
                            kVar = null;
                        }
                        if (kVar != null && (aVar = kVar.f6537a) != null) {
                            xf.a aVar2 = C2.f767f;
                            Uri uri = aVar.f15056d;
                            aVar2.getClass();
                            uri.getClass();
                            zd.f a10 = aVar2.a(k6.a.d(aVar2.f14600a, uri));
                            if (a10 != null) {
                                e0Var = a10.a(aVar);
                            } else {
                                e0Var = null;
                            }
                            if (e0Var != null) {
                                zc.x.v(C2.f775o, null, null, new a5.o(C2, e0Var, null, 5), 3);
                            }
                        }
                        emulatorActivity.C().s();
                        return;
                    default:
                        Map map = (Map) obj;
                        int i12 = EmulatorActivity.f9503a1;
                        map.getClass();
                        zc.x.v(androidx.lifecycle.s0.f(emulatorActivity), null, null, new w(map, emulatorActivity, null), 3);
                        return;
                }
            }
        });
        this.V0 = new a7.n(1, this);
        this.W0 = new jh.c(new a2.c(4, this));
        Boolean bool = Boolean.FALSE;
        this.X0 = s.w(bool);
        this.Y0 = s.w(bool);
        this.Z0 = new n(new ah.c(this, 4), new ah.c(this, 5));
    }

    public static final void A(EmulatorActivity emulatorActivity) {
        d5.f fVar = emulatorActivity.f9504y0;
        if (fVar != null) {
            ((RuntimeLayoutView) fVar.f3846h).setVisibility(4);
            d5.f fVar2 = emulatorActivity.f9504y0;
            if (fVar2 != null) {
                ((TextView) fVar2.f3844f).setVisibility(8);
                d5.f fVar3 = emulatorActivity.f9504y0;
                if (fVar3 != null) {
                    ((TextView) fVar3.f3845g).setVisibility(0);
                    return;
                } else {
                    k.f("binding");
                    throw null;
                }
            }
            k.f("binding");
            throw null;
        }
        k.f("binding");
        throw null;
    }

    public final void B() {
        this.Z0.F(hh.d.REWIND_WINDOW);
        d5.f fVar = this.f9504y0;
        if (fVar != null) {
            ((MotionLayout) fVar.f3839a).z(R.id.rewind_hidden);
            C().s();
            return;
        }
        k.f("binding");
        throw null;
    }

    public final h1 C() {
        return (h1) this.f9505z0.getValue();
    }

    public final void D() {
        String string = ((d2) C().f763b).f8181b.getString("fps_counter_position", "hidden");
        string.getClass();
        String upperCase = string.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        oe.p valueOf = oe.p.valueOf(upperCase);
        oe.p pVar = oe.p.HIDDEN;
        d5.f fVar = this.f9504y0;
        if (valueOf == pVar) {
            if (fVar != null) {
                ((TextView) fVar.f3844f).setVisibility(8);
            } else {
                k.f("binding");
                throw null;
            }
        } else if (fVar != null) {
            ((TextView) fVar.f3844f).setVisibility(0);
            d5.f fVar2 = this.f9504y0;
            if (fVar2 != null) {
                ViewGroup.LayoutParams layoutParams = ((TextView) fVar2.f3844f).getLayoutParams();
                layoutParams.getClass();
                i5.f fVar3 = (i5.f) layoutParams;
                switch (o.f802a[valueOf.ordinal()]) {
                    case DSiCameraSource.FrontCamera /* 1 */:
                        fVar3.f6843i = 0;
                        fVar3.f6835e = 0;
                        break;
                    case 2:
                        fVar3.f6843i = 0;
                        fVar3.f6835e = 0;
                        fVar3.f6841h = 0;
                        break;
                    case 3:
                        fVar3.f6843i = 0;
                        fVar3.f6841h = 0;
                        break;
                    case 4:
                        fVar3.f6849l = 0;
                        fVar3.f6835e = 0;
                        break;
                    case l1.c.f8511g /* 5 */:
                        fVar3.f6849l = 0;
                        fVar3.f6835e = 0;
                        fVar3.f6841h = 0;
                        break;
                    case l1.c.f8509e /* 6 */:
                        fVar3.f6849l = 0;
                        fVar3.f6841h = 0;
                        break;
                    case 7:
                        break;
                    default:
                        m9.o.o();
                        return;
                }
                d5.f fVar4 = this.f9504y0;
                if (fVar4 != null) {
                    ((TextView) fVar4.f3844f).setLayoutParams(fVar3);
                    return;
                } else {
                    k.f("binding");
                    throw null;
                }
            }
            k.f("binding");
            throw null;
        } else {
            k.f("binding");
            throw null;
        }
    }

    public final void E() {
        Integer num;
        Integer num2;
        Display display;
        Display B = aj.g.B(this);
        B.getClass();
        if (this.A0 != null) {
            Display a10 = d.a(this);
            c cVar = this.B0;
            if (cVar != null) {
                i b10 = cVar.b(B, a10);
                q1 q1Var = (q1) C().f772k.f3844f;
                q1Var.getClass();
                q1Var.k(null, b10);
                ah.q qVar = this.R0;
                f fVar = this.G0;
                if (fVar != null && (display = fVar.getDisplay()) != null) {
                    num = Integer.valueOf(display.getDisplayId());
                } else {
                    num = null;
                }
                if (a10 != null) {
                    num2 = Integer.valueOf(a10.getDisplayId());
                } else {
                    num2 = null;
                }
                if (!k.a(num, num2)) {
                    f fVar2 = this.G0;
                    if (fVar2 != null) {
                        fVar2.dismiss();
                    }
                    this.G0 = null;
                    if (a10 != null) {
                        x0 x0Var = this.M0;
                        if (x0Var != null) {
                            f fVar3 = new f(this, a10, x0Var);
                            RuntimeLayoutView runtimeLayoutView = fVar3.B;
                            runtimeLayoutView.setLayoutComponentViewBuilderFactory(new m1(0, (byte) 0));
                            runtimeLayoutView.setFrontendInputHandler(qVar);
                            m mVar = this.P0;
                            if (mVar != null) {
                                runtimeLayoutView.setSystemInputHandler(mVar);
                                e1 e1Var = (e1) C().f782v.A.getValue();
                                if (e1Var != null) {
                                    RuntimeLayoutView runtimeLayoutView2 = fVar3.B;
                                    sh.d dVar = sh.d.SECONDARY_SCREEN;
                                    runtimeLayoutView2.getClass();
                                    dVar.getClass();
                                    runtimeLayoutView2.f9511d0 = e1Var;
                                    runtimeLayoutView2.e(e1Var.f6521e, dVar);
                                    runtimeLayoutView2.h();
                                    runtimeLayoutView2.j();
                                    runtimeLayoutView2.g(ve.c.BUTTON_TOGGLE_SOFT_INPUT, runtimeLayoutView2.f9514g0);
                                    fVar3.a();
                                }
                                runtimeLayoutView.g(ve.c.BUTTON_FAST_FORWARD_TOGGLE, qVar.f807a);
                                runtimeLayoutView.g(ve.c.BUTTON_MICROPHONE_TOGGLE, qVar.f808b);
                                runtimeLayoutView.setConnectedControllersState((hh.c) this.J0.f4489f.A.getValue());
                                hh.f1 f1Var = (hh.f1) C().f785y.A.getValue();
                                fVar3.Y = f1Var;
                                ih.d dVar2 = fVar3.X.f9508d0;
                                if (dVar2 != null) {
                                    ah.b bVar = (ah.b) dVar2;
                                    synchronized (bVar.f722b) {
                                        bVar.f723c = f1Var;
                                        bVar.f724d = true;
                                    }
                                }
                                h0 h0Var = (h0) C().C.A.getValue();
                                h0Var.getClass();
                                ah.b bVar2 = fVar3.R;
                                bVar2.getClass();
                                synchronized (bVar2.f734o) {
                                    bVar2.f735p = h0Var;
                                    bVar2.f736q = true;
                                    bVar2.f725e = true;
                                    bVar2.f726f = false;
                                }
                                d5.f fVar4 = this.f9504y0;
                                if (fVar4 != null) {
                                    if (((RuntimeLayoutView) fVar4.f3846h).f9515h0) {
                                        RuntimeLayoutView runtimeLayoutView3 = fVar3.B;
                                        runtimeLayoutView3.f9515h0 = !runtimeLayoutView3.f9515h0;
                                        runtimeLayoutView3.i();
                                        fVar3.a();
                                    }
                                    if (!((ArrayList) this.Z0.R).isEmpty()) {
                                        fVar3.L.setVisibility(0);
                                    }
                                    fVar3.show();
                                    this.G0 = fVar3;
                                    return;
                                }
                                k.f("binding");
                                throw null;
                            }
                            k.f("melonTouchHandler");
                            throw null;
                        }
                        k.f("frameRenderCoordinator");
                        throw null;
                    }
                    return;
                }
                return;
            }
            k.f("deviceLayoutDisplayMapper");
            throw null;
        }
        k.f("secondaryDisplaySelector");
        throw null;
    }

    public final void F() {
        j jVar;
        b0 b0Var;
        float f8;
        boolean z10;
        d5.f fVar = this.f9504y0;
        b0 b0Var2 = null;
        if (fVar != null) {
            RuntimeLayoutView runtimeLayoutView = (RuntimeLayoutView) fVar.f3846h;
            if (runtimeLayoutView.f9515h0) {
                jVar = new j(ve.c.BOTTOM_SCREEN, ve.c.TOP_SCREEN);
            } else {
                jVar = new j(ve.c.TOP_SCREEN, ve.c.BOTTOM_SCREEN);
            }
            ve.c cVar = (ve.c) jVar.B;
            og.i c4 = runtimeLayoutView.c((ve.c) jVar.A);
            d5.f fVar2 = this.f9504y0;
            if (fVar2 != null) {
                og.i c10 = ((RuntimeLayoutView) fVar2.f3846h).c(cVar);
                ah.b bVar = this.O0;
                if (bVar != null) {
                    if (c4 != null) {
                        b0Var = c4.b();
                    } else {
                        b0Var = null;
                    }
                    if (c10 != null) {
                        b0Var2 = c10.b();
                    }
                    b0 b0Var3 = b0Var2;
                    float f10 = 1.0f;
                    if (c4 != null) {
                        f8 = c4.f11007c;
                    } else {
                        f8 = 1.0f;
                    }
                    if (c10 != null) {
                        f10 = c10.f11007c;
                    }
                    float f11 = f10;
                    if (c10 != null) {
                        z10 = c10.f11008d;
                    } else {
                        z10 = false;
                    }
                    bVar.f(b0Var, b0Var3, f8, f11, z10);
                    return;
                }
                k.f("mainScreenRenderer");
                throw null;
            }
            k.f("binding");
            throw null;
        }
        k.f("binding");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009f, code lost:
        if (r12 > 0.0f) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a1, code lost:
        r12 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ac, code lost:
        if (r12 < 0.0f) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b3, code lost:
        if (r10.f4496b == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
        if (java.lang.Math.abs(r12) >= 0.5f) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c4, code lost:
        if (java.lang.Math.abs(r12) < 0.5f) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c6, code lost:
        r3 = (oe.j) r2.B;
        r11 = r11.f4493b;
        r3.getClass();
        r3 = r3.f10941a;
        r14 = r3.size();
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d6, code lost:
        if (r15 >= r14) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d8, code lost:
        r17 = r3.get(r15);
        r15 = r15 + 1;
        r7 = (oe.y) r17;
        r7 = p7.t.y(r7.f10963b, r7.f10964c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f2, code lost:
        if (r7.isEmpty() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f5, code lost:
        r7 = r7.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fd, code lost:
        if (r7.hasNext() == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ff, code lost:
        r8 = (oe.x) r7.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0107, code lost:
        if ((r8 instanceof oe.u) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0109, code lost:
        r8 = (oe.u) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x010c, code lost:
        r8 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x010e, code lost:
        if (r8 == 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0112, code lost:
        if (r8.f10957b != r11) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0116, code lost:
        if (r8.f10958c != r13) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0120, code lost:
        r17 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0122, code lost:
        r0 = (oe.y) r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0126, code lost:
        if (r0 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0128, code lost:
        r0 = r0.f10962a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x012b, code lost:
        r0 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x012d, code lost:
        if (r0 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0131, code lost:
        if (r10.f4496b == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0133, code lost:
        r10.f4496b = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013a, code lost:
        if (r0.isSystemInput() == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013c, code lost:
        r5.d(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0140, code lost:
        r4.d(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0144, code lost:
        r10.f4496b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x014c, code lost:
        if (r0.isSystemInput() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014e, code lost:
        r5.e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0152, code lost:
        r4.e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0157, code lost:
        r10.f4495a = r12;
        r7 = 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: me.magnum.melonds.ui.emulator.EmulatorActivity.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // l.i, m5.e, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        oe.v vVar;
        keyEvent.getClass();
        if (((ArrayList) this.Z0.R).isEmpty()) {
            e eVar = this.Q0;
            oe.s sVar = null;
            if (eVar != null) {
                eh.k kVar = (eh.k) eVar.R;
                eh.k kVar2 = (eh.k) eVar.L;
                int keyCode = keyEvent.getKeyCode();
                ArrayList arrayList = ((oe.j) eVar.B).f10941a;
                int size = arrayList.size();
                int i2 = 0;
                loop0: while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    Object obj = arrayList.get(i2);
                    i2++;
                    oe.y yVar = (oe.y) obj;
                    List<oe.x> y10 = t.y(yVar.f10963b, yVar.f10964c);
                    if (!y10.isEmpty()) {
                        for (oe.x xVar : y10) {
                            if (xVar instanceof oe.v) {
                                vVar = (oe.v) xVar;
                            } else {
                                vVar = null;
                            }
                            if (vVar != null && vVar.f10960b == keyCode) {
                                sVar = yVar.f10962a;
                                break loop0;
                            }
                        }
                        continue;
                    }
                }
                if (sVar != null) {
                    if (sVar.isSystemInput()) {
                        int action = keyEvent.getAction();
                        if (action != 0) {
                            if (action == 1) {
                                kVar2.d(sVar);
                                return true;
                            }
                        } else {
                            kVar2.e(sVar);
                            return true;
                        }
                    } else {
                        int action2 = keyEvent.getAction();
                        if (action2 != 0) {
                            if (action2 == 1) {
                                kVar.d(sVar);
                                return true;
                            }
                        } else {
                            kVar.e(sVar);
                            return true;
                        }
                    }
                }
            } else {
                k.f("nativeInputListener");
                throw null;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // l.i, d.k, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        bf.a aVar;
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 1) {
            aVar = bf.a.PORTRAIT;
        } else {
            aVar = bf.a.LANDSCAPE;
        }
        h1 C = C();
        aVar.getClass();
        q1 q1Var = (q1) C.f772k.f3842d;
        q1Var.getClass();
        q1Var.k(null, aVar);
        Handler handler = this.H0;
        if (handler != null) {
            handler.post(new ah.h(this, 0));
        } else {
            k.f("handler");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r13v10, types: [d5.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v24, types: [a0.m, java.lang.Object] */
    @Override // ah.j1, androidx.fragment.app.o0, d.k, m5.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        aj.g j2Var;
        a bVar;
        bf.a aVar;
        super.onCreate(bundle);
        this.H0 = new Handler(getMainLooper());
        q qVar = this.E0;
        if (qVar != null) {
            qVar.f11646a = this;
            this.A.a(new q7.a(3, qVar));
            View inflate = getLayoutInflater().inflate(R.layout.activity_emulator, (ViewGroup) null, false);
            int i2 = R.id.layout_achievement;
            ComposeView composeView = (ComposeView) w.k(inflate, R.id.layout_achievement);
            if (composeView != null) {
                i2 = R.id.layout_rewind;
                RelativeLayout relativeLayout = (RelativeLayout) w.k(inflate, R.id.layout_rewind);
                if (relativeLayout != null) {
                    MotionLayout motionLayout = (MotionLayout) inflate;
                    int i10 = R.id.list_rewind;
                    RecyclerView recyclerView = (RecyclerView) w.k(inflate, R.id.list_rewind);
                    if (recyclerView != null) {
                        i10 = R.id.surfaceMain;
                        EmulatorSurfaceView emulatorSurfaceView = (EmulatorSurfaceView) w.k(inflate, R.id.surfaceMain);
                        if (emulatorSurfaceView != null) {
                            i10 = R.id.textFps;
                            TextView textView = (TextView) w.k(inflate, R.id.textFps);
                            if (textView != null) {
                                i10 = R.id.textLoading;
                                TextView textView2 = (TextView) w.k(inflate, R.id.textLoading);
                                if (textView2 != null) {
                                    i10 = R.id.view_layout_controls;
                                    RuntimeLayoutView runtimeLayoutView = (RuntimeLayoutView) w.k(inflate, R.id.view_layout_controls);
                                    if (runtimeLayoutView != null) {
                                        ?? obj = new Object();
                                        obj.f3839a = motionLayout;
                                        obj.f3840b = composeView;
                                        obj.f3841c = relativeLayout;
                                        obj.f3842d = recyclerView;
                                        obj.f3843e = emulatorSurfaceView;
                                        obj.f3844f = textView;
                                        obj.f3845g = textView2;
                                        obj.f3846h = runtimeLayoutView;
                                        this.f9504y0 = obj;
                                        v().i(1);
                                        d5.f fVar = this.f9504y0;
                                        if (fVar != null) {
                                            setContentView((MotionLayout) fVar.f3839a);
                                            Window window = getWindow();
                                            window.getClass();
                                            a0.b bVar2 = new a0.b(window.getDecorView());
                                            int i11 = Build.VERSION.SDK_INT;
                                            if (i11 >= 35) {
                                                j2Var = new l2(window, bVar2);
                                            } else if (i11 >= 30) {
                                                j2Var = new l2(window, bVar2);
                                            } else if (i11 >= 26) {
                                                j2Var = new j2(window, bVar2);
                                            } else {
                                                j2Var = new j2(window, bVar2);
                                            }
                                            j2Var.H(2);
                                            j2Var.n0();
                                            d5.f fVar2 = this.f9504y0;
                                            if (fVar2 != null) {
                                                ah.e eVar = new ah.e(0, this);
                                                WeakHashMap weakHashMap = a6.x0.f533a;
                                                p0.k((MotionLayout) fVar2.f3839a, eVar);
                                                a().b(this.V0);
                                                this.K0 = new v(this, new a0.b(9, this));
                                                this.L0 = new n(this, s0.f(this), this.J0);
                                                x0 x0Var = new x0(4);
                                                this.M0 = x0Var;
                                                if (i11 >= 33) {
                                                    bVar = new ih.c(x0Var);
                                                } else {
                                                    bVar = new ih.b(x0Var);
                                                }
                                                this.N0 = bVar;
                                                this.P0 = new Object();
                                                ah.b bVar3 = new ah.b(this);
                                                this.O0 = bVar3;
                                                d5.f fVar3 = this.f9504y0;
                                                if (fVar3 != null) {
                                                    ((EmulatorSurfaceView) fVar3.f3843e).setRenderer(bVar3);
                                                    d5.f fVar4 = this.f9504y0;
                                                    if (fVar4 != null) {
                                                        ((TextView) fVar4.f3844f).setVisibility(4);
                                                        d5.f fVar5 = this.f9504y0;
                                                        if (fVar5 != null) {
                                                            ((RuntimeLayoutView) fVar5.f3846h).setLayoutComponentViewBuilderFactory(new m1(0, (byte) 0));
                                                            d5.f fVar6 = this.f9504y0;
                                                            if (fVar6 != null) {
                                                                ((RelativeLayout) fVar6.f3841c).setOnClickListener(new ah.f(0, this));
                                                                d5.f fVar7 = this.f9504y0;
                                                                if (fVar7 != null) {
                                                                    RecyclerView recyclerView2 = (RecyclerView) fVar7.f3842d;
                                                                    recyclerView2.getContext();
                                                                    recyclerView2.setLayoutManager(new LinearLayoutManager(0, true));
                                                                    recyclerView2.i(new com.google.android.material.datepicker.j());
                                                                    recyclerView2.setAdapter(this.W0);
                                                                    d5.f fVar8 = this.f9504y0;
                                                                    if (fVar8 != null) {
                                                                        RuntimeLayoutView runtimeLayoutView2 = (RuntimeLayoutView) fVar8.f3846h;
                                                                        runtimeLayoutView2.setFrontendInputHandler(this.R0);
                                                                        m mVar = this.P0;
                                                                        if (mVar != null) {
                                                                            runtimeLayoutView2.setSystemInputHandler(mVar);
                                                                            aa.a aVar2 = new aa.a(1, this);
                                                                            d5.f fVar9 = this.f9504y0;
                                                                            if (fVar9 != null) {
                                                                                ((RuntimeLayoutView) fVar9.f3846h).addOnLayoutChangeListener(aVar2);
                                                                                Configuration configuration = getResources().getConfiguration();
                                                                                configuration.getClass();
                                                                                if (configuration.orientation == 1) {
                                                                                    aVar = bf.a.PORTRAIT;
                                                                                } else {
                                                                                    aVar = bf.a.LANDSCAPE;
                                                                                }
                                                                                h1 C = C();
                                                                                aVar.getClass();
                                                                                q1 q1Var = (q1) C.f772k.f3842d;
                                                                                q1Var.getClass();
                                                                                q1Var.k(null, aVar);
                                                                                getWindow().addFlags(128);
                                                                                d5.f fVar10 = this.f9504y0;
                                                                                if (fVar10 != null) {
                                                                                    ((ComposeView) fVar10.f3840b).setContent(new v2.c(553795587, true, new ah.g(this, 0)));
                                                                                    zc.x.v(s0.f(this), null, null, new ah.s(this, null, 25), 3);
                                                                                    zc.x.v(s0.f(this), null, null, new ah.s(this, null, 27), 3);
                                                                                    zc.x.v(s0.f(this), null, null, new ah.s(this, null, 1), 3);
                                                                                    zc.x.v(s0.f(this), null, null, new ah.s(this, null, 3), 3);
                                                                                    zc.x.v(s0.f(this), null, null, new ah.s(this, null, 5), 3);
                                                                                    zc.x.v(s0.f(this), null, null, new ah.s(this, null, 7), 3);
                                                                                    zc.x.v(s0.f(this), null, null, new ah.s(this, null, 9), 3);
                                                                                    zc.x.v(s0.f(this), null, null, new ah.s(this, null, 11), 3);
                                                                                    zc.x.v(s0.f(this), null, null, new ah.s(this, null, 13), 3);
                                                                                    zc.x.v(s0.f(this), null, null, new ah.s(this, null, 15), 3);
                                                                                    zc.x.v(s0.f(this), null, null, new ah.s(this, null, 17), 3);
                                                                                    zc.x.v(s0.f(this), null, null, new ah.s(this, null, 19), 3);
                                                                                    zc.x.v(s0.f(this), null, null, new ah.s(this, null, 21), 3);
                                                                                    zc.x.v(s0.f(this), null, null, new ah.s(this, null, 23), 3);
                                                                                    return;
                                                                                }
                                                                                k.f("binding");
                                                                                throw null;
                                                                            }
                                                                            k.f("binding");
                                                                            throw null;
                                                                        }
                                                                        k.f("melonTouchHandler");
                                                                        throw null;
                                                                    }
                                                                    k.f("binding");
                                                                    throw null;
                                                                }
                                                                k.f("binding");
                                                                throw null;
                                                            }
                                                            k.f("binding");
                                                            throw null;
                                                        }
                                                        k.f("binding");
                                                        throw null;
                                                    }
                                                    k.f("binding");
                                                    throw null;
                                                }
                                                k.f("binding");
                                                throw null;
                                            }
                                            k.f("binding");
                                            throw null;
                                        }
                                        k.f("binding");
                                        throw null;
                                    }
                                }
                            }
                        }
                    }
                    i2 = i10;
                }
            }
            m9.o.i("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
            return;
        }
        k.f("lifecycleOwnerProvider");
        throw null;
    }

    @Override // ah.j1, l.i, androidx.fragment.app.o0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        x0 x0Var = this.M0;
        if (x0Var != null) {
            ih.g gVar = (ih.g) x0Var.f14090c;
            gVar.B = false;
            androidx.preference.v vVar = gVar.A;
            if (vVar != null) {
                vVar.sendEmptyMessage(3);
            }
            ((ih.g) x0Var.f14090c).quitSafely();
            ((ih.g) x0Var.f14090c).join();
            f fVar = this.G0;
            if (fVar != null) {
                fVar.dismiss();
                return;
            }
            return;
        }
        k.f("frameRenderCoordinator");
        throw null;
    }

    @Override // d.k, android.app.Activity
    public final void onNewIntent(final Intent intent) {
        boolean z10;
        eg.j jVar;
        ze.a aVar;
        boolean z11;
        Uri uri;
        intent.getClass();
        super.onNewIntent(intent);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            z10 = extras.getBoolean("boot_firmware_only");
        } else {
            z10 = false;
        }
        final pc.a aVar2 = null;
        if (z10) {
            int i2 = extras.getInt("boot_firmware_console", -1);
            if (i2 != -1) {
                aVar2 = new hh.a0((ConsoleType) ((fc.b) ConsoleType.getEntries()).get(i2));
            }
        } else {
            if (extras != null) {
                jVar = (eg.j) ((Parcelable) p7.o.k(extras, "rom", eg.j.class));
            } else {
                jVar = null;
            }
            if (jVar != null) {
                aVar = jVar.A;
            } else {
                aVar = null;
            }
            if (aVar != null) {
                aVar2 = new hh.b0(jVar.A);
            } else if (intent.getData() != null) {
                Uri data = intent.getData();
                data.getClass();
                aVar2 = new d0(data);
            } else {
                boolean z12 = true;
                if (extras != null && extras.containsKey("PATH")) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    String string = extras.getString("PATH");
                    string.getClass();
                    aVar2 = new c0(string);
                } else {
                    if (extras == null || !extras.containsKey("uri")) {
                        z12 = false;
                    }
                    if (z12) {
                        Object obj = extras.get("uri");
                        if (obj instanceof String) {
                            uri = Uri.parse((String) obj);
                        } else if (obj instanceof Uri) {
                            uri = (Uri) obj;
                        } else {
                            uri = null;
                        }
                        if (uri != null) {
                            aVar2 = new d0(uri);
                        }
                    }
                }
            }
        }
        if (aVar2 != null && ((hh.o) C().f778r.A.getValue()).a()) {
            C().q(false);
            this.Z0.k(hh.d.SWITCH_NEW_ROM_DIALOG);
            bk.a aVar3 = new bk.a(this);
            l.d dVar = (l.d) aVar3.L;
            dVar.f8359d = getString(R.string.title_emulator_running);
            dVar.f8361f = getString(R.string.message_stop_emulation);
            aVar3.v(R.string.ok, new DialogInterface.OnClickListener() { // from class: ah.n
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    int i11 = EmulatorActivity.f9503a1;
                    EmulatorActivity emulatorActivity = EmulatorActivity.this;
                    emulatorActivity.setIntent(intent);
                    h1 C = emulatorActivity.C();
                    if (((hh.o) C.f777q.getValue()).a()) {
                        zc.x.v(androidx.lifecycle.s0.h(C), null, null, new g0(C, null, 13), 3);
                        pf.j jVar2 = C.f773l;
                        jVar2.getClass();
                        MelonEmulator.f9466a.stopEmulation();
                        jVar2.f11634g.a();
                        EmulatorMessageQueue emulatorMessageQueue = jVar2.f11638k;
                        emulatorMessageQueue.f9482c.post(new pf.l(emulatorMessageQueue, 0));
                        ByteBuffer byteBuffer = C.f771j.f706a;
                        if (byteBuffer != null) {
                            byteBuffer.position(0);
                            int capacity = byteBuffer.capacity() / 4;
                            for (int i12 = 0; i12 < capacity; i12++) {
                                byteBuffer.putInt(-16777216);
                            }
                        }
                    }
                    C.p(aVar2);
                }
            });
            aVar3.u(R.string.no, new ah.m(1));
            dVar.f8369o = new ah.j(this, 3);
            dVar.f8368n = new ah.d(this, 0);
            aVar3.y();
        }
    }

    @Override // androidx.fragment.app.o0, android.app.Activity
    public final void onPause() {
        super.onPause();
        getWindow().clearFlags(128);
        a aVar = this.N0;
        if (aVar != null) {
            aVar.a();
            C().q(false);
            return;
        }
        k.f("choreographerFrameRenderer");
        throw null;
    }

    @Override // androidx.fragment.app.o0, android.app.Activity
    public final void onResume() {
        super.onResume();
        a aVar = this.N0;
        if (aVar != null) {
            aVar.b();
            if (((ArrayList) this.Z0.R).isEmpty()) {
                getWindow().addFlags(128);
                C().s();
                return;
            }
            return;
        }
        k.f("choreographerFrameRenderer");
        throw null;
    }

    @Override // l.i, androidx.fragment.app.o0, android.app.Activity
    public final void onStart() {
        Object value;
        ArrayList arrayList;
        eh.c cVar = this.J0;
        super.onStart();
        E();
        DisplayManager displayManager = (DisplayManager) getSystemService(DisplayManager.class);
        if (displayManager != null) {
            displayManager.registerDisplayListener(this.I0, null);
        }
        InputManager inputManager = (InputManager) getSystemService(InputManager.class);
        if (inputManager != null) {
            inputManager.registerInputDeviceListener(cVar, null);
        }
        ah.h0 h0Var = cVar.f4484a;
        if (h0Var != null) {
            zc.x.f(h0Var, null);
        }
        gd.f fVar = g0.f15015a;
        ah.h0 a10 = zc.x.a(ed.n.f4465a.Y);
        zc.x.v(a10, null, null, new a9.b(8, null, cVar), 3);
        cVar.f4484a = a10;
        q1 q1Var = cVar.f4486c;
        do {
            value = q1Var.getValue();
            List list = (List) value;
            arrayList = new ArrayList();
            int[] deviceIds = InputDevice.getDeviceIds();
            deviceIds.getClass();
            for (int i2 : deviceIds) {
                InputDevice device = InputDevice.getDevice(i2);
                if (device != null && eh.c.a(device)) {
                    arrayList.add(device);
                }
            }
        } while (!q1Var.i(value, arrayList));
        x0 x0Var = this.M0;
        if (x0Var != null) {
            d5.f fVar2 = this.f9504y0;
            if (fVar2 != null) {
                EmulatorSurfaceView emulatorSurfaceView = (EmulatorSurfaceView) fVar2.f3843e;
                synchronized (x0Var.f14092e) {
                    ((ArrayList) x0Var.f14093f).add(emulatorSurfaceView);
                }
                return;
            }
            k.f("binding");
            throw null;
        }
        k.f("frameRenderCoordinator");
        throw null;
    }

    @Override // l.i, androidx.fragment.app.o0, android.app.Activity
    public final void onStop() {
        super.onStop();
        DisplayManager displayManager = (DisplayManager) getSystemService(DisplayManager.class);
        if (displayManager != null) {
            displayManager.unregisterDisplayListener(this.I0);
        }
        InputManager inputManager = (InputManager) getSystemService(InputManager.class);
        eh.c cVar = this.J0;
        if (inputManager != null) {
            inputManager.unregisterInputDeviceListener(cVar);
        }
        ah.h0 h0Var = cVar.f4484a;
        if (h0Var != null) {
            zc.x.f(h0Var, null);
        }
        q1 q1Var = cVar.f4486c;
        q1Var.getClass();
        q1Var.k(null, zb.q.A);
        x0 x0Var = this.M0;
        if (x0Var != null) {
            d5.f fVar = this.f9504y0;
            if (fVar != null) {
                x0Var.o((EmulatorSurfaceView) fVar.f3843e);
                return;
            } else {
                k.f("binding");
                throw null;
            }
        }
        k.f("frameRenderCoordinator");
        throw null;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z10) {
        aj.g j2Var;
        super.onWindowFocusChanged(z10);
        Window window = getWindow();
        window.getClass();
        a0.b bVar = new a0.b(window.getDecorView());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35) {
            j2Var = new l2(window, bVar);
        } else if (i2 >= 30) {
            j2Var = new l2(window, bVar);
        } else if (i2 >= 26) {
            j2Var = new j2(window, bVar);
        } else {
            j2Var = new j2(window, bVar);
        }
        j2Var.H(2);
        j2Var.n0();
    }
}
