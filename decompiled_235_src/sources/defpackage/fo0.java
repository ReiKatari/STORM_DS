package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.UUID;
import me.magnum.melonds.domain.model.DSiWareTitle;
import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
import me.magnum.melonds.domain.model.layout.BackgroundMode;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melonds.ui.romdetails.RomDetailsActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fo0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fo0 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object d0;

    public /* synthetic */ fo0(a74 a74Var, lq4 lq4Var, pq5 pq5Var, cu5 cu5Var, qn2 qn2Var, on2 on2Var, eo2 eo2Var, int i) {
        this.A = 4;
        this.B = a74Var;
        this.L = lq4Var;
        this.d0 = pq5Var;
        this.X = cu5Var;
        this.R = qn2Var;
        this.Z = on2Var;
        this.Y = eo2Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        Object obj3 = this.Y;
        Object obj4 = this.X;
        Object obj5 = this.R;
        Object obj6 = this.Z;
        Object obj7 = this.d0;
        Object obj8 = this.L;
        Object obj9 = this.B;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                nw7.l((a74) obj9, (lq4) obj8, (rp0) obj7, (qn2) obj5, (qn2) obj4, (eo2) obj3, (qn2) obj6, (px0) obj, ii2.a0(7));
                return jg7Var;
            case 1:
                ((Integer) obj2).getClass();
                nw7.u((a74) obj9, (lq4) obj8, (List) obj7, (qn2) obj5, (qn2) obj4, (eo2) obj3, (qn2) obj6, (px0) obj, ii2.a0(7));
                return jg7Var;
            case 2:
                ((Integer) obj2).getClass();
                ge7.e((a74) obj9, (DSiWareTitle) obj8, (on2) obj7, (on2) obj6, (qn2) obj5, (qn2) obj4, (on2) obj3, (px0) obj, ii2.a0(7));
                return jg7Var;
            case 3:
                ((Integer) obj2).getClass();
                gi2.d((UUID) obj9, (BackgroundMode) obj8, (eo2) obj3, (on2) obj7, (qn2) obj5, (on2) obj4, (on2) obj6, (px0) obj, ii2.a0(1));
                return jg7Var;
            case 4:
                ((Integer) obj2).getClass();
                qo2.j((a74) obj9, (lq4) obj8, (pq5) obj7, (cu5) obj4, (qn2) obj5, (on2) obj6, (eo2) obj3, (px0) obj, ii2.a0(1));
                return jg7Var;
            case 5:
                final RomDetailsActivity romDetailsActivity = (RomDetailsActivity) obj9;
                s9 s9Var = (s9) obj8;
                final qa4 qa4Var = (qa4) obj7;
                pp6 pp6Var = (pp6) obj5;
                pp6 pp6Var2 = (pp6) obj4;
                qa4 qa4Var2 = (qa4) obj6;
                pp6 pp6Var3 = (pp6) obj3;
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = RomDetailsActivity.J0;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    pq5 pq5Var = (pq5) qa4Var.getValue();
                    String str = (String) pp6Var.getValue();
                    cu5 cu5Var = (cu5) pp6Var2.getValue();
                    j06 j06Var = (j06) qa4Var2.getValue();
                    oi4 oi4Var = (oi4) pp6Var3.getValue();
                    boolean h = xq2Var.h(romDetailsActivity);
                    Object P = xq2Var.P();
                    vs0 vs0Var = ox0.a;
                    if (h || P == vs0Var) {
                        P = new av5(romDetailsActivity, 4);
                        xq2Var.l0(P);
                    }
                    on2 on2Var = (on2) P;
                    boolean h2 = xq2Var.h(s9Var);
                    Object P2 = xq2Var.P();
                    if (h2 || P2 == vs0Var) {
                        P2 = new ro5(s9Var, 3);
                        xq2Var.l0(P2);
                    }
                    qn2 qn2Var = (qn2) P2;
                    boolean h3 = xq2Var.h(romDetailsActivity);
                    Object P3 = xq2Var.P();
                    if (h3 || P3 == vs0Var) {
                        P3 = new qn2() { // from class: cv5
                            /* JADX WARN: Code restructure failed: missing block: B:79:0x0249, code lost:
                                if (r1 != false) goto L96;
                             */
                            /* JADX WARN: Removed duplicated region for block: B:103:0x037c  */
                            /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
                            @Override // defpackage.qn2
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object g(Object obj10) {
                                Object obj11;
                                jt5 a;
                                VideoFiltering videoFiltering;
                                boolean isSupportedByOpenGlSurface;
                                sw5 sw5Var;
                                jt5 a2;
                                jt5 jt5Var;
                                sw5 sw5Var2;
                                hi2 hi2Var;
                                u41 u41Var;
                                Object value;
                                int i3 = r2;
                                jg7 jg7Var2 = jg7.a;
                                RomDetailsActivity romDetailsActivity2 = romDetailsActivity;
                                switch (i3) {
                                    case 0:
                                        o75 o75Var = (o75) obj10;
                                        int i4 = RomDetailsActivity.J0;
                                        o75Var.getClass();
                                        romDetailsActivity2.A().f.k(lb1.h(o75Var.a, "https://retroachievements.org/achievement/"));
                                        return jg7Var2;
                                    case 1:
                                        romDetailsActivity2.H0.l((o6) obj10);
                                        return jg7Var2;
                                    default:
                                        tu5 tu5Var = (tu5) obj10;
                                        int i5 = RomDetailsActivity.J0;
                                        tu5Var.getClass();
                                        hw5 hw5Var = (hw5) romDetailsActivity2.C0.getValue();
                                        tp6 tp6Var = hw5Var.f;
                                        tp6 tp6Var2 = hw5Var.h;
                                        jt5 jt5Var2 = (jt5) tp6Var2.getValue();
                                        if (tu5Var instanceof nu5) {
                                            obj11 = null;
                                            a = jt5.a(jt5Var2, ((nu5) tu5Var).a, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 262142);
                                        } else {
                                            obj11 = null;
                                            if (tu5Var instanceof ou5) {
                                                a = jt5.a(jt5Var2, null, ((ou5) tu5Var).a, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 262141);
                                            } else if (tu5Var instanceof qu5) {
                                                a = jt5.a(jt5Var2, null, null, null, null, null, ((qu5) tu5Var).a, null, null, null, null, null, null, null, null, null, null, null, null, 262111);
                                            } else if (tu5Var instanceof hu5) {
                                                nx5 nx5Var = ((hu5) tu5Var).a;
                                                if (nx5Var != nx5.CUSTOM) {
                                                    u41Var = jt5Var2.h;
                                                } else {
                                                    u41Var = jt5Var2.h;
                                                    if (u41Var == null) {
                                                        u41Var = ((u41) ((tp6) ((ng6) hw5Var.d).g.getValue()).getValue()).a();
                                                    }
                                                }
                                                a = jt5.a(jt5Var2, null, null, null, null, null, false, nx5Var, u41Var, null, null, null, null, null, null, null, null, null, null, 261951);
                                            } else if (tu5Var instanceof ju5) {
                                                a = jt5.a(jt5Var2, null, null, ((ju5) tu5Var).a, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 262139);
                                            } else {
                                                if (tu5Var instanceof gu5) {
                                                    int i6 = dw5.a[((gu5) tu5Var).a.ordinal()];
                                                    if (i6 != 1) {
                                                        if (i6 != 2) {
                                                            if (i6 != 3) {
                                                                if (i6 != 4) {
                                                                    if (i6 == 5) {
                                                                        hi2Var = rw5.o;
                                                                    } else {
                                                                        i.d();
                                                                        return null;
                                                                    }
                                                                } else {
                                                                    hi2Var = tw5.o;
                                                                }
                                                            } else {
                                                                hi2Var = vw5.o;
                                                            }
                                                        } else {
                                                            hi2Var = new sw5(null, null);
                                                        }
                                                    } else {
                                                        hi2Var = uw5.o;
                                                    }
                                                    a = jt5.a(jt5Var2, null, null, null, hi2Var, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 262135);
                                                } else if (tu5Var instanceof eu5) {
                                                    hi2 hi2Var2 = jt5Var2.d;
                                                    if (hi2Var2 instanceof sw5) {
                                                        sw5Var2 = (sw5) hi2Var2;
                                                    } else {
                                                        sw5Var2 = null;
                                                    }
                                                    if (sw5Var2 != null) {
                                                        a2 = jt5.a(jt5Var2, null, null, null, new sw5(((eu5) tu5Var).a, sw5Var2.p), null, false, null, null, null, null, null, null, null, null, null, null, null, null, 262135);
                                                        jt5Var = a2;
                                                    }
                                                    a2 = null;
                                                    jt5Var = a2;
                                                } else if (tu5Var instanceof fu5) {
                                                    hi2 hi2Var3 = jt5Var2.d;
                                                    if (hi2Var3 instanceof sw5) {
                                                        sw5Var = (sw5) hi2Var3;
                                                    } else {
                                                        sw5Var = null;
                                                    }
                                                    if (sw5Var != null) {
                                                        a2 = jt5.a(jt5Var2, null, null, null, new sw5(sw5Var.o, ((fu5) tu5Var).a), null, false, null, null, null, null, null, null, null, null, null, null, null, null, 262135);
                                                        jt5Var = a2;
                                                    }
                                                    a2 = null;
                                                    jt5Var = a2;
                                                } else if (tu5Var instanceof du5) {
                                                    a = jt5.a(jt5Var2, null, null, null, null, ((du5) tu5Var).a, false, null, null, null, null, null, null, null, null, null, null, null, null, 262127);
                                                } else if (tu5Var instanceof su5) {
                                                    VideoRenderer videoRenderer = ((su5) tu5Var).a;
                                                    VideoFiltering videoFiltering2 = jt5Var2.l;
                                                    if (videoFiltering2 != null) {
                                                        if (videoRenderer != null) {
                                                            if (dw5.b[videoRenderer.ordinal()] == 1) {
                                                                isSupportedByOpenGlSurface = videoFiltering2.isSupportedByVulkan();
                                                                break;
                                                            } else {
                                                                isSupportedByOpenGlSurface = videoFiltering2.isSupportedByOpenGlSurface();
                                                                break;
                                                            }
                                                        }
                                                        videoFiltering = videoFiltering2;
                                                        a = jt5.a(jt5Var2, null, null, null, null, null, false, null, null, videoRenderer, null, null, videoFiltering, null, null, null, null, null, null, 259839);
                                                    }
                                                    videoFiltering = null;
                                                    a = jt5.a(jt5Var2, null, null, null, null, null, false, null, null, videoRenderer, null, null, videoFiltering, null, null, null, null, null, null, 259839);
                                                } else if (tu5Var instanceof pu5) {
                                                    a = jt5.a(jt5Var2, null, null, null, null, null, false, null, null, null, ((pu5) tu5Var).a, null, null, null, null, null, null, null, null, 261631);
                                                } else if (tu5Var instanceof iu5) {
                                                    a = jt5.a(jt5Var2, null, null, null, null, null, false, null, null, null, null, ((iu5) tu5Var).a, null, null, null, null, null, null, null, 261119);
                                                } else if (tu5Var instanceof ru5) {
                                                    a = jt5.a(jt5Var2, null, null, null, null, null, false, null, null, null, null, null, ((ru5) tu5Var).a, null, null, null, null, null, null, 260095);
                                                } else if (tu5Var instanceof mu5) {
                                                    a = jt5.a(jt5Var2, null, null, null, null, null, false, null, null, null, null, null, null, ((mu5) tu5Var).a, null, null, null, null, null, 258047);
                                                } else if (tu5Var instanceof lu5) {
                                                    a = jt5.a(jt5Var2, null, null, null, null, null, false, null, null, null, null, null, null, null, ((lu5) tu5Var).a, null, null, null, null, 253951);
                                                } else if (tu5Var instanceof ku5) {
                                                    a = jt5.a(jt5Var2, null, null, null, null, null, false, null, null, null, null, null, null, null, null, ((ku5) tu5Var).a, null, null, null, 245759);
                                                } else {
                                                    i.d();
                                                    return null;
                                                }
                                                if (jt5Var == null) {
                                                    hi2 hi2Var4 = jt5Var.d;
                                                    tp6Var2.m(obj11, jt5Var);
                                                    do {
                                                        value = tp6Var.getValue();
                                                    } while (!tp6Var.j(value, pq5.a((pq5) value, null, null, jt5Var, null, false, null, 0L, false, null, 8159)));
                                                    wh7 wh7Var = hw5Var.e;
                                                    if (hi2Var4 instanceof sw5) {
                                                        sw5 sw5Var3 = (sw5) hi2Var4;
                                                        Uri uri = sw5Var3.o;
                                                        if (uri != null) {
                                                            wh7Var.a(uri, sv4.READ);
                                                        }
                                                        Uri uri2 = sw5Var3.p;
                                                        if (uri2 != null) {
                                                            wh7Var.a(uri2, sv4.READ_WRITE);
                                                        }
                                                    }
                                                    ((xb2) hw5Var.c).B((pq5) tp6Var.getValue(), jt5Var);
                                                    return jg7Var2;
                                                }
                                                return jg7Var2;
                                            }
                                        }
                                        jt5Var = a;
                                        if (jt5Var == null) {
                                        }
                                }
                            }
                        };
                        xq2Var.l0(P3);
                    }
                    qn2 qn2Var2 = (qn2) P3;
                    boolean h4 = xq2Var.h(romDetailsActivity);
                    Object P4 = xq2Var.P();
                    if (h4 || P4 == vs0Var) {
                        P4 = new av5(romDetailsActivity, 0);
                        xq2Var.l0(P4);
                    }
                    on2 on2Var2 = (on2) P4;
                    boolean h5 = xq2Var.h(romDetailsActivity);
                    Object P5 = xq2Var.P();
                    if (h5 || P5 == vs0Var) {
                        P5 = new bv5(romDetailsActivity, 0);
                        xq2Var.l0(P5);
                    }
                    eo2 eo2Var = (eo2) P5;
                    boolean h6 = xq2Var.h(romDetailsActivity);
                    Object P6 = xq2Var.P();
                    if (h6 || P6 == vs0Var) {
                        P6 = new av5(romDetailsActivity, 1);
                        xq2Var.l0(P6);
                    }
                    on2 on2Var3 = (on2) P6;
                    boolean h7 = xq2Var.h(romDetailsActivity);
                    Object P7 = xq2Var.P();
                    if (h7 || P7 == vs0Var) {
                        P7 = new qn2() { // from class: cv5
                            /* JADX WARN: Code restructure failed: missing block: B:79:0x0249, code lost:
                                if (r1 != false) goto L96;
                             */
                            /* JADX WARN: Removed duplicated region for block: B:103:0x037c  */
                            /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
                            @Override // defpackage.qn2
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object g(Object obj10) {
                                Object obj11;
                                jt5 a;
                                VideoFiltering videoFiltering;
                                boolean isSupportedByOpenGlSurface;
                                sw5 sw5Var;
                                jt5 a2;
                                jt5 jt5Var;
                                sw5 sw5Var2;
                                hi2 hi2Var;
                                u41 u41Var;
                                Object value;
                                int i3 = r2;
                                jg7 jg7Var2 = jg7.a;
                                RomDetailsActivity romDetailsActivity2 = romDetailsActivity;
                                switch (i3) {
                                    case 0:
                                        o75 o75Var = (o75) obj10;
                                        int i4 = RomDetailsActivity.J0;
                                        o75Var.getClass();
                                        romDetailsActivity2.A().f.k(lb1.h(o75Var.a, "https://retroachievements.org/achievement/"));
                                        return jg7Var2;
                                    case 1:
                                        romDetailsActivity2.H0.l((o6) obj10);
                                        return jg7Var2;
                                    default:
                                        tu5 tu5Var = (tu5) obj10;
                                        int i5 = RomDetailsActivity.J0;
                                        tu5Var.getClass();
                                        hw5 hw5Var = (hw5) romDetailsActivity2.C0.getValue();
                                        tp6 tp6Var = hw5Var.f;
                                        tp6 tp6Var2 = hw5Var.h;
                                        jt5 jt5Var2 = (jt5) tp6Var2.getValue();
                                        if (tu5Var instanceof nu5) {
                                            obj11 = null;
                                            a = jt5.a(jt5Var2, ((nu5) tu5Var).a, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 262142);
                                        } else {
                                            obj11 = null;
                                            if (tu5Var instanceof ou5) {
                                                a = jt5.a(jt5Var2, null, ((ou5) tu5Var).a, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 262141);
                                            } else if (tu5Var instanceof qu5) {
                                                a = jt5.a(jt5Var2, null, null, null, null, null, ((qu5) tu5Var).a, null, null, null, null, null, null, null, null, null, null, null, null, 262111);
                                            } else if (tu5Var instanceof hu5) {
                                                nx5 nx5Var = ((hu5) tu5Var).a;
                                                if (nx5Var != nx5.CUSTOM) {
                                                    u41Var = jt5Var2.h;
                                                } else {
                                                    u41Var = jt5Var2.h;
                                                    if (u41Var == null) {
                                                        u41Var = ((u41) ((tp6) ((ng6) hw5Var.d).g.getValue()).getValue()).a();
                                                    }
                                                }
                                                a = jt5.a(jt5Var2, null, null, null, null, null, false, nx5Var, u41Var, null, null, null, null, null, null, null, null, null, null, 261951);
                                            } else if (tu5Var instanceof ju5) {
                                                a = jt5.a(jt5Var2, null, null, ((ju5) tu5Var).a, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 262139);
                                            } else {
                                                if (tu5Var instanceof gu5) {
                                                    int i6 = dw5.a[((gu5) tu5Var).a.ordinal()];
                                                    if (i6 != 1) {
                                                        if (i6 != 2) {
                                                            if (i6 != 3) {
                                                                if (i6 != 4) {
                                                                    if (i6 == 5) {
                                                                        hi2Var = rw5.o;
                                                                    } else {
                                                                        i.d();
                                                                        return null;
                                                                    }
                                                                } else {
                                                                    hi2Var = tw5.o;
                                                                }
                                                            } else {
                                                                hi2Var = vw5.o;
                                                            }
                                                        } else {
                                                            hi2Var = new sw5(null, null);
                                                        }
                                                    } else {
                                                        hi2Var = uw5.o;
                                                    }
                                                    a = jt5.a(jt5Var2, null, null, null, hi2Var, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 262135);
                                                } else if (tu5Var instanceof eu5) {
                                                    hi2 hi2Var2 = jt5Var2.d;
                                                    if (hi2Var2 instanceof sw5) {
                                                        sw5Var2 = (sw5) hi2Var2;
                                                    } else {
                                                        sw5Var2 = null;
                                                    }
                                                    if (sw5Var2 != null) {
                                                        a2 = jt5.a(jt5Var2, null, null, null, new sw5(((eu5) tu5Var).a, sw5Var2.p), null, false, null, null, null, null, null, null, null, null, null, null, null, null, 262135);
                                                        jt5Var = a2;
                                                    }
                                                    a2 = null;
                                                    jt5Var = a2;
                                                } else if (tu5Var instanceof fu5) {
                                                    hi2 hi2Var3 = jt5Var2.d;
                                                    if (hi2Var3 instanceof sw5) {
                                                        sw5Var = (sw5) hi2Var3;
                                                    } else {
                                                        sw5Var = null;
                                                    }
                                                    if (sw5Var != null) {
                                                        a2 = jt5.a(jt5Var2, null, null, null, new sw5(sw5Var.o, ((fu5) tu5Var).a), null, false, null, null, null, null, null, null, null, null, null, null, null, null, 262135);
                                                        jt5Var = a2;
                                                    }
                                                    a2 = null;
                                                    jt5Var = a2;
                                                } else if (tu5Var instanceof du5) {
                                                    a = jt5.a(jt5Var2, null, null, null, null, ((du5) tu5Var).a, false, null, null, null, null, null, null, null, null, null, null, null, null, 262127);
                                                } else if (tu5Var instanceof su5) {
                                                    VideoRenderer videoRenderer = ((su5) tu5Var).a;
                                                    VideoFiltering videoFiltering2 = jt5Var2.l;
                                                    if (videoFiltering2 != null) {
                                                        if (videoRenderer != null) {
                                                            if (dw5.b[videoRenderer.ordinal()] == 1) {
                                                                isSupportedByOpenGlSurface = videoFiltering2.isSupportedByVulkan();
                                                                break;
                                                            } else {
                                                                isSupportedByOpenGlSurface = videoFiltering2.isSupportedByOpenGlSurface();
                                                                break;
                                                            }
                                                        }
                                                        videoFiltering = videoFiltering2;
                                                        a = jt5.a(jt5Var2, null, null, null, null, null, false, null, null, videoRenderer, null, null, videoFiltering, null, null, null, null, null, null, 259839);
                                                    }
                                                    videoFiltering = null;
                                                    a = jt5.a(jt5Var2, null, null, null, null, null, false, null, null, videoRenderer, null, null, videoFiltering, null, null, null, null, null, null, 259839);
                                                } else if (tu5Var instanceof pu5) {
                                                    a = jt5.a(jt5Var2, null, null, null, null, null, false, null, null, null, ((pu5) tu5Var).a, null, null, null, null, null, null, null, null, 261631);
                                                } else if (tu5Var instanceof iu5) {
                                                    a = jt5.a(jt5Var2, null, null, null, null, null, false, null, null, null, null, ((iu5) tu5Var).a, null, null, null, null, null, null, null, 261119);
                                                } else if (tu5Var instanceof ru5) {
                                                    a = jt5.a(jt5Var2, null, null, null, null, null, false, null, null, null, null, null, ((ru5) tu5Var).a, null, null, null, null, null, null, 260095);
                                                } else if (tu5Var instanceof mu5) {
                                                    a = jt5.a(jt5Var2, null, null, null, null, null, false, null, null, null, null, null, null, ((mu5) tu5Var).a, null, null, null, null, null, 258047);
                                                } else if (tu5Var instanceof lu5) {
                                                    a = jt5.a(jt5Var2, null, null, null, null, null, false, null, null, null, null, null, null, null, ((lu5) tu5Var).a, null, null, null, null, 253951);
                                                } else if (tu5Var instanceof ku5) {
                                                    a = jt5.a(jt5Var2, null, null, null, null, null, false, null, null, null, null, null, null, null, null, ((ku5) tu5Var).a, null, null, null, 245759);
                                                } else {
                                                    i.d();
                                                    return null;
                                                }
                                                if (jt5Var == null) {
                                                    hi2 hi2Var4 = jt5Var.d;
                                                    tp6Var2.m(obj11, jt5Var);
                                                    do {
                                                        value = tp6Var.getValue();
                                                    } while (!tp6Var.j(value, pq5.a((pq5) value, null, null, jt5Var, null, false, null, 0L, false, null, 8159)));
                                                    wh7 wh7Var = hw5Var.e;
                                                    if (hi2Var4 instanceof sw5) {
                                                        sw5 sw5Var3 = (sw5) hi2Var4;
                                                        Uri uri = sw5Var3.o;
                                                        if (uri != null) {
                                                            wh7Var.a(uri, sv4.READ);
                                                        }
                                                        Uri uri2 = sw5Var3.p;
                                                        if (uri2 != null) {
                                                            wh7Var.a(uri2, sv4.READ_WRITE);
                                                        }
                                                    }
                                                    ((xb2) hw5Var.c).B((pq5) tp6Var.getValue(), jt5Var);
                                                    return jg7Var2;
                                                }
                                                return jg7Var2;
                                            }
                                        }
                                        jt5Var = a;
                                        if (jt5Var == null) {
                                        }
                                }
                            }
                        };
                        xq2Var.l0(P7);
                    }
                    qn2 qn2Var3 = (qn2) P7;
                    boolean h8 = xq2Var.h(romDetailsActivity);
                    Object P8 = xq2Var.P();
                    if (h8 || P8 == vs0Var) {
                        P8 = new av5(romDetailsActivity, 2);
                        xq2Var.l0(P8);
                    }
                    on2 on2Var4 = (on2) P8;
                    boolean h9 = xq2Var.h(romDetailsActivity) | xq2Var.f(qa4Var);
                    Object P9 = xq2Var.P();
                    if (h9 || P9 == vs0Var) {
                        P9 = new on2() { // from class: dv5
                            @Override // defpackage.on2
                            public final Object c() {
                                int i3 = r3;
                                jg7 jg7Var2 = jg7.a;
                                qa4 qa4Var3 = qa4Var;
                                RomDetailsActivity romDetailsActivity2 = romDetailsActivity;
                                switch (i3) {
                                    case 0:
                                        int i4 = RomDetailsActivity.J0;
                                        hv.L(bl2.C(romDetailsActivity2), null, null, new u12(romDetailsActivity2, (pq5) qa4Var3.getValue(), (r41) null, 27), 3);
                                        return jg7Var2;
                                    default:
                                        int i5 = RomDetailsActivity.J0;
                                        romDetailsActivity2.E0 = (pq5) qa4Var3.getValue();
                                        romDetailsActivity2.F0.a(new String[]{"*/*"});
                                        return jg7Var2;
                                }
                            }
                        };
                        xq2Var.l0(P9);
                    }
                    on2 on2Var5 = (on2) P9;
                    boolean h10 = xq2Var.h(romDetailsActivity) | xq2Var.f(qa4Var);
                    Object P10 = xq2Var.P();
                    if (h10 || P10 == vs0Var) {
                        P10 = new on2() { // from class: dv5
                            @Override // defpackage.on2
                            public final Object c() {
                                int i3 = r3;
                                jg7 jg7Var2 = jg7.a;
                                qa4 qa4Var3 = qa4Var;
                                RomDetailsActivity romDetailsActivity2 = romDetailsActivity;
                                switch (i3) {
                                    case 0:
                                        int i4 = RomDetailsActivity.J0;
                                        hv.L(bl2.C(romDetailsActivity2), null, null, new u12(romDetailsActivity2, (pq5) qa4Var3.getValue(), (r41) null, 27), 3);
                                        return jg7Var2;
                                    default:
                                        int i5 = RomDetailsActivity.J0;
                                        romDetailsActivity2.E0 = (pq5) qa4Var3.getValue();
                                        romDetailsActivity2.F0.a(new String[]{"*/*"});
                                        return jg7Var2;
                                }
                            }
                        };
                        xq2Var.l0(P10);
                    }
                    on2 on2Var6 = (on2) P10;
                    boolean h11 = xq2Var.h(romDetailsActivity);
                    Object P11 = xq2Var.P();
                    if (h11 || P11 == vs0Var) {
                        P11 = new qn2() { // from class: cv5
                            /* JADX WARN: Code restructure failed: missing block: B:79:0x0249, code lost:
                                if (r1 != false) goto L96;
                             */
                            /* JADX WARN: Removed duplicated region for block: B:103:0x037c  */
                            /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
                            @Override // defpackage.qn2
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object g(Object obj10) {
                                Object obj11;
                                jt5 a;
                                VideoFiltering videoFiltering;
                                boolean isSupportedByOpenGlSurface;
                                sw5 sw5Var;
                                jt5 a2;
                                jt5 jt5Var;
                                sw5 sw5Var2;
                                hi2 hi2Var;
                                u41 u41Var;
                                Object value;
                                int i3 = r2;
                                jg7 jg7Var2 = jg7.a;
                                RomDetailsActivity romDetailsActivity2 = romDetailsActivity;
                                switch (i3) {
                                    case 0:
                                        o75 o75Var = (o75) obj10;
                                        int i4 = RomDetailsActivity.J0;
                                        o75Var.getClass();
                                        romDetailsActivity2.A().f.k(lb1.h(o75Var.a, "https://retroachievements.org/achievement/"));
                                        return jg7Var2;
                                    case 1:
                                        romDetailsActivity2.H0.l((o6) obj10);
                                        return jg7Var2;
                                    default:
                                        tu5 tu5Var = (tu5) obj10;
                                        int i5 = RomDetailsActivity.J0;
                                        tu5Var.getClass();
                                        hw5 hw5Var = (hw5) romDetailsActivity2.C0.getValue();
                                        tp6 tp6Var = hw5Var.f;
                                        tp6 tp6Var2 = hw5Var.h;
                                        jt5 jt5Var2 = (jt5) tp6Var2.getValue();
                                        if (tu5Var instanceof nu5) {
                                            obj11 = null;
                                            a = jt5.a(jt5Var2, ((nu5) tu5Var).a, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 262142);
                                        } else {
                                            obj11 = null;
                                            if (tu5Var instanceof ou5) {
                                                a = jt5.a(jt5Var2, null, ((ou5) tu5Var).a, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 262141);
                                            } else if (tu5Var instanceof qu5) {
                                                a = jt5.a(jt5Var2, null, null, null, null, null, ((qu5) tu5Var).a, null, null, null, null, null, null, null, null, null, null, null, null, 262111);
                                            } else if (tu5Var instanceof hu5) {
                                                nx5 nx5Var = ((hu5) tu5Var).a;
                                                if (nx5Var != nx5.CUSTOM) {
                                                    u41Var = jt5Var2.h;
                                                } else {
                                                    u41Var = jt5Var2.h;
                                                    if (u41Var == null) {
                                                        u41Var = ((u41) ((tp6) ((ng6) hw5Var.d).g.getValue()).getValue()).a();
                                                    }
                                                }
                                                a = jt5.a(jt5Var2, null, null, null, null, null, false, nx5Var, u41Var, null, null, null, null, null, null, null, null, null, null, 261951);
                                            } else if (tu5Var instanceof ju5) {
                                                a = jt5.a(jt5Var2, null, null, ((ju5) tu5Var).a, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 262139);
                                            } else {
                                                if (tu5Var instanceof gu5) {
                                                    int i6 = dw5.a[((gu5) tu5Var).a.ordinal()];
                                                    if (i6 != 1) {
                                                        if (i6 != 2) {
                                                            if (i6 != 3) {
                                                                if (i6 != 4) {
                                                                    if (i6 == 5) {
                                                                        hi2Var = rw5.o;
                                                                    } else {
                                                                        i.d();
                                                                        return null;
                                                                    }
                                                                } else {
                                                                    hi2Var = tw5.o;
                                                                }
                                                            } else {
                                                                hi2Var = vw5.o;
                                                            }
                                                        } else {
                                                            hi2Var = new sw5(null, null);
                                                        }
                                                    } else {
                                                        hi2Var = uw5.o;
                                                    }
                                                    a = jt5.a(jt5Var2, null, null, null, hi2Var, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 262135);
                                                } else if (tu5Var instanceof eu5) {
                                                    hi2 hi2Var2 = jt5Var2.d;
                                                    if (hi2Var2 instanceof sw5) {
                                                        sw5Var2 = (sw5) hi2Var2;
                                                    } else {
                                                        sw5Var2 = null;
                                                    }
                                                    if (sw5Var2 != null) {
                                                        a2 = jt5.a(jt5Var2, null, null, null, new sw5(((eu5) tu5Var).a, sw5Var2.p), null, false, null, null, null, null, null, null, null, null, null, null, null, null, 262135);
                                                        jt5Var = a2;
                                                    }
                                                    a2 = null;
                                                    jt5Var = a2;
                                                } else if (tu5Var instanceof fu5) {
                                                    hi2 hi2Var3 = jt5Var2.d;
                                                    if (hi2Var3 instanceof sw5) {
                                                        sw5Var = (sw5) hi2Var3;
                                                    } else {
                                                        sw5Var = null;
                                                    }
                                                    if (sw5Var != null) {
                                                        a2 = jt5.a(jt5Var2, null, null, null, new sw5(sw5Var.o, ((fu5) tu5Var).a), null, false, null, null, null, null, null, null, null, null, null, null, null, null, 262135);
                                                        jt5Var = a2;
                                                    }
                                                    a2 = null;
                                                    jt5Var = a2;
                                                } else if (tu5Var instanceof du5) {
                                                    a = jt5.a(jt5Var2, null, null, null, null, ((du5) tu5Var).a, false, null, null, null, null, null, null, null, null, null, null, null, null, 262127);
                                                } else if (tu5Var instanceof su5) {
                                                    VideoRenderer videoRenderer = ((su5) tu5Var).a;
                                                    VideoFiltering videoFiltering2 = jt5Var2.l;
                                                    if (videoFiltering2 != null) {
                                                        if (videoRenderer != null) {
                                                            if (dw5.b[videoRenderer.ordinal()] == 1) {
                                                                isSupportedByOpenGlSurface = videoFiltering2.isSupportedByVulkan();
                                                                break;
                                                            } else {
                                                                isSupportedByOpenGlSurface = videoFiltering2.isSupportedByOpenGlSurface();
                                                                break;
                                                            }
                                                        }
                                                        videoFiltering = videoFiltering2;
                                                        a = jt5.a(jt5Var2, null, null, null, null, null, false, null, null, videoRenderer, null, null, videoFiltering, null, null, null, null, null, null, 259839);
                                                    }
                                                    videoFiltering = null;
                                                    a = jt5.a(jt5Var2, null, null, null, null, null, false, null, null, videoRenderer, null, null, videoFiltering, null, null, null, null, null, null, 259839);
                                                } else if (tu5Var instanceof pu5) {
                                                    a = jt5.a(jt5Var2, null, null, null, null, null, false, null, null, null, ((pu5) tu5Var).a, null, null, null, null, null, null, null, null, 261631);
                                                } else if (tu5Var instanceof iu5) {
                                                    a = jt5.a(jt5Var2, null, null, null, null, null, false, null, null, null, null, ((iu5) tu5Var).a, null, null, null, null, null, null, null, 261119);
                                                } else if (tu5Var instanceof ru5) {
                                                    a = jt5.a(jt5Var2, null, null, null, null, null, false, null, null, null, null, null, ((ru5) tu5Var).a, null, null, null, null, null, null, 260095);
                                                } else if (tu5Var instanceof mu5) {
                                                    a = jt5.a(jt5Var2, null, null, null, null, null, false, null, null, null, null, null, null, ((mu5) tu5Var).a, null, null, null, null, null, 258047);
                                                } else if (tu5Var instanceof lu5) {
                                                    a = jt5.a(jt5Var2, null, null, null, null, null, false, null, null, null, null, null, null, null, ((lu5) tu5Var).a, null, null, null, null, 253951);
                                                } else if (tu5Var instanceof ku5) {
                                                    a = jt5.a(jt5Var2, null, null, null, null, null, false, null, null, null, null, null, null, null, null, ((ku5) tu5Var).a, null, null, null, 245759);
                                                } else {
                                                    i.d();
                                                    return null;
                                                }
                                                if (jt5Var == null) {
                                                    hi2 hi2Var4 = jt5Var.d;
                                                    tp6Var2.m(obj11, jt5Var);
                                                    do {
                                                        value = tp6Var.getValue();
                                                    } while (!tp6Var.j(value, pq5.a((pq5) value, null, null, jt5Var, null, false, null, 0L, false, null, 8159)));
                                                    wh7 wh7Var = hw5Var.e;
                                                    if (hi2Var4 instanceof sw5) {
                                                        sw5 sw5Var3 = (sw5) hi2Var4;
                                                        Uri uri = sw5Var3.o;
                                                        if (uri != null) {
                                                            wh7Var.a(uri, sv4.READ);
                                                        }
                                                        Uri uri2 = sw5Var3.p;
                                                        if (uri2 != null) {
                                                            wh7Var.a(uri2, sv4.READ_WRITE);
                                                        }
                                                    }
                                                    ((xb2) hw5Var.c).B((pq5) tp6Var.getValue(), jt5Var);
                                                    return jg7Var2;
                                                }
                                                return jg7Var2;
                                            }
                                        }
                                        jt5Var = a;
                                        if (jt5Var == null) {
                                        }
                                }
                            }
                        };
                        xq2Var.l0(P11);
                    }
                    qn2 qn2Var4 = (qn2) P11;
                    boolean h12 = xq2Var.h(romDetailsActivity);
                    Object P12 = xq2Var.P();
                    if (h12 || P12 == vs0Var) {
                        P12 = new bv5(romDetailsActivity, 2);
                        xq2Var.l0(P12);
                    }
                    l.d(pq5Var, str, cu5Var, j06Var, oi4Var, on2Var, qn2Var, qn2Var2, on2Var2, eo2Var, on2Var3, qn2Var3, on2Var4, on2Var5, on2Var6, qn2Var4, (eo2) P12, xq2Var, RendererDebugBridge.CAPTURE_HEIGHT);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                ((Integer) obj2).getClass();
                vy7.t((sr7) obj9, (String) obj8, (List) obj7, (on2) obj6, (qn2) obj5, (qn2) obj4, (on2) obj3, (px0) obj, ii2.a0(1));
                return jg7Var;
        }
    }

    public /* synthetic */ fo0(a74 a74Var, lq4 lq4Var, Object obj, qn2 qn2Var, qn2 qn2Var2, eo2 eo2Var, qn2 qn2Var3, int i, int i2) {
        this.A = i2;
        this.B = a74Var;
        this.L = lq4Var;
        this.d0 = obj;
        this.R = qn2Var;
        this.X = qn2Var2;
        this.Y = eo2Var;
        this.Z = qn2Var3;
    }

    public /* synthetic */ fo0(Object obj, Object obj2, Object obj3, on2 on2Var, qn2 qn2Var, qn2 qn2Var2, on2 on2Var2, int i, int i2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
        this.d0 = obj3;
        this.Z = on2Var;
        this.R = qn2Var;
        this.X = qn2Var2;
        this.Y = on2Var2;
    }

    public /* synthetic */ fo0(UUID uuid, BackgroundMode backgroundMode, eo2 eo2Var, on2 on2Var, qn2 qn2Var, on2 on2Var2, on2 on2Var3, int i) {
        this.A = 3;
        this.B = uuid;
        this.L = backgroundMode;
        this.Y = eo2Var;
        this.d0 = on2Var;
        this.R = qn2Var;
        this.X = on2Var2;
        this.Z = on2Var3;
    }

    public /* synthetic */ fo0(RomDetailsActivity romDetailsActivity, s9 s9Var, qa4 qa4Var, qa4 qa4Var2, qa4 qa4Var3, qa4 qa4Var4, qa4 qa4Var5) {
        this.A = 5;
        this.B = romDetailsActivity;
        this.L = s9Var;
        this.d0 = qa4Var;
        this.R = qa4Var2;
        this.X = qa4Var3;
        this.Z = qa4Var4;
        this.Y = qa4Var5;
    }
}
