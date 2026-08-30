package defpackage;

import java.util.List;
import java.util.UUID;
import me.magnum.melonds.domain.model.layout.BackgroundMode;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melonds.ui.romdetails.RomDetailsActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xl0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class xl0 implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object c0;

    public /* synthetic */ xl0(zy3 zy3Var, ih4 ih4Var, rg5 rg5Var, mj5 mj5Var, mi2 mi2Var, ki2 ki2Var, aj2 aj2Var, int i) {
        this.A = 3;
        this.B = zy3Var;
        this.L = ih4Var;
        this.c0 = rg5Var;
        this.X = mj5Var;
        this.R = mi2Var;
        this.Z = ki2Var;
        this.Y = aj2Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        o27 o27Var = o27.a;
        Object obj3 = this.Y;
        Object obj4 = this.Z;
        Object obj5 = this.X;
        Object obj6 = this.R;
        Object obj7 = this.c0;
        Object obj8 = this.L;
        Object obj9 = this.B;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                f34.b((zy3) obj9, (ih4) obj8, (gn0) obj7, (mi2) obj6, (mi2) obj5, (aj2) obj3, (mi2) obj4, (tu0) obj, ep2.I(7));
                return o27Var;
            case 1:
                ((Integer) obj2).getClass();
                f34.f((zy3) obj9, (ih4) obj8, (List) obj7, (mi2) obj6, (mi2) obj5, (aj2) obj3, (mi2) obj4, (tu0) obj, ep2.I(7));
                return o27Var;
            case 2:
                ((Integer) obj2).getClass();
                sn2.b((UUID) obj9, (BackgroundMode) obj8, (aj2) obj3, (ki2) obj7, (mi2) obj6, (ki2) obj5, (ki2) obj4, (tu0) obj, ep2.I(1));
                return o27Var;
            case 3:
                ((Integer) obj2).getClass();
                nl2.l((zy3) obj9, (ih4) obj8, (rg5) obj7, (mj5) obj5, (mi2) obj6, (ki2) obj4, (aj2) obj3, (tu0) obj, ep2.I(1));
                return o27Var;
            default:
                final RomDetailsActivity romDetailsActivity = (RomDetailsActivity) obj9;
                r9 r9Var = (r9) obj8;
                final k24 k24Var = (k24) obj7;
                ae6 ae6Var = (ae6) obj6;
                ae6 ae6Var2 = (ae6) obj5;
                k24 k24Var2 = (k24) obj4;
                ae6 ae6Var3 = (ae6) obj3;
                tu0 tu0Var = (tu0) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = RomDetailsActivity.I0;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    rg5 rg5Var = (rg5) k24Var.getValue();
                    String str = (String) ae6Var.getValue();
                    mj5 mj5Var = (mj5) ae6Var2.getValue();
                    pp5 pp5Var = (pp5) k24Var2.getValue();
                    r94 r94Var = (r94) ae6Var3.getValue();
                    boolean h = sk2Var.h(romDetailsActivity);
                    Object L = sk2Var.L();
                    sn1 sn1Var = su0.a;
                    if (h || L == sn1Var) {
                        L = new jk5(romDetailsActivity, 4);
                        sk2Var.h0(L);
                    }
                    ki2 ki2Var = (ki2) L;
                    boolean h2 = sk2Var.h(r9Var);
                    Object L2 = sk2Var.L();
                    if (h2 || L2 == sn1Var) {
                        L2 = new n95(5, r9Var);
                        sk2Var.h0(L2);
                    }
                    mi2 mi2Var = (mi2) L2;
                    boolean h3 = sk2Var.h(romDetailsActivity);
                    Object L3 = sk2Var.L();
                    if (h3 || L3 == sn1Var) {
                        L3 = new mi2() { // from class: lk5
                            /* JADX WARN: Code restructure failed: missing block: B:79:0x020a, code lost:
                                if (r1 != false) goto L96;
                             */
                            /* JADX WARN: Removed duplicated region for block: B:103:0x030c  */
                            /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
                            @Override // defpackage.mi2
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object n(java.lang.Object r24) {
                                /*
                                    Method dump skipped, instructions count: 904
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.lk5.n(java.lang.Object):java.lang.Object");
                            }
                        };
                        sk2Var.h0(L3);
                    }
                    mi2 mi2Var2 = (mi2) L3;
                    boolean h4 = sk2Var.h(romDetailsActivity);
                    Object L4 = sk2Var.L();
                    if (h4 || L4 == sn1Var) {
                        L4 = new jk5(romDetailsActivity, 0);
                        sk2Var.h0(L4);
                    }
                    ki2 ki2Var2 = (ki2) L4;
                    boolean h5 = sk2Var.h(romDetailsActivity);
                    Object L5 = sk2Var.L();
                    if (h5 || L5 == sn1Var) {
                        L5 = new kk5(romDetailsActivity, 0);
                        sk2Var.h0(L5);
                    }
                    aj2 aj2Var = (aj2) L5;
                    boolean h6 = sk2Var.h(romDetailsActivity);
                    Object L6 = sk2Var.L();
                    if (h6 || L6 == sn1Var) {
                        L6 = new jk5(romDetailsActivity, 1);
                        sk2Var.h0(L6);
                    }
                    ki2 ki2Var3 = (ki2) L6;
                    boolean h7 = sk2Var.h(romDetailsActivity);
                    Object L7 = sk2Var.L();
                    if (h7 || L7 == sn1Var) {
                        L7 = new mi2() { // from class: lk5
                            @Override // defpackage.mi2
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object n(java.lang.Object r24) {
                                /*
                                    Method dump skipped, instructions count: 904
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.lk5.n(java.lang.Object):java.lang.Object");
                            }
                        };
                        sk2Var.h0(L7);
                    }
                    mi2 mi2Var3 = (mi2) L7;
                    boolean h8 = sk2Var.h(romDetailsActivity);
                    Object L8 = sk2Var.L();
                    if (h8 || L8 == sn1Var) {
                        L8 = new jk5(romDetailsActivity, 2);
                        sk2Var.h0(L8);
                    }
                    ki2 ki2Var4 = (ki2) L8;
                    boolean h9 = sk2Var.h(romDetailsActivity) | sk2Var.f(k24Var);
                    Object L9 = sk2Var.L();
                    if (h9 || L9 == sn1Var) {
                        L9 = new ki2() { // from class: mk5
                            @Override // defpackage.ki2
                            public final Object c() {
                                int i3 = r3;
                                o27 o27Var2 = o27.a;
                                k24 k24Var3 = k24Var;
                                RomDetailsActivity romDetailsActivity2 = romDetailsActivity;
                                switch (i3) {
                                    case 0:
                                        int i4 = RomDetailsActivity.I0;
                                        tq5.w(hk2.y(romDetailsActivity2), null, null, new wx1(romDetailsActivity2, (rg5) k24Var3.getValue(), null, 23), 3);
                                        return o27Var2;
                                    default:
                                        int i5 = RomDetailsActivity.I0;
                                        romDetailsActivity2.D0 = (rg5) k24Var3.getValue();
                                        romDetailsActivity2.E0.a(new String[]{"*/*"});
                                        return o27Var2;
                                }
                            }
                        };
                        sk2Var.h0(L9);
                    }
                    ki2 ki2Var5 = (ki2) L9;
                    boolean h10 = sk2Var.h(romDetailsActivity) | sk2Var.f(k24Var);
                    Object L10 = sk2Var.L();
                    if (h10 || L10 == sn1Var) {
                        L10 = new ki2() { // from class: mk5
                            @Override // defpackage.ki2
                            public final Object c() {
                                int i3 = r3;
                                o27 o27Var2 = o27.a;
                                k24 k24Var3 = k24Var;
                                RomDetailsActivity romDetailsActivity2 = romDetailsActivity;
                                switch (i3) {
                                    case 0:
                                        int i4 = RomDetailsActivity.I0;
                                        tq5.w(hk2.y(romDetailsActivity2), null, null, new wx1(romDetailsActivity2, (rg5) k24Var3.getValue(), null, 23), 3);
                                        return o27Var2;
                                    default:
                                        int i5 = RomDetailsActivity.I0;
                                        romDetailsActivity2.D0 = (rg5) k24Var3.getValue();
                                        romDetailsActivity2.E0.a(new String[]{"*/*"});
                                        return o27Var2;
                                }
                            }
                        };
                        sk2Var.h0(L10);
                    }
                    ki2 ki2Var6 = (ki2) L10;
                    boolean h11 = sk2Var.h(romDetailsActivity);
                    Object L11 = sk2Var.L();
                    if (h11 || L11 == sn1Var) {
                        L11 = new mi2() { // from class: lk5
                            @Override // defpackage.mi2
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object n(java.lang.Object r24) {
                                /*
                                    Method dump skipped, instructions count: 904
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.lk5.n(java.lang.Object):java.lang.Object");
                            }
                        };
                        sk2Var.h0(L11);
                    }
                    mi2 mi2Var4 = (mi2) L11;
                    boolean h12 = sk2Var.h(romDetailsActivity);
                    Object L12 = sk2Var.L();
                    if (h12 || L12 == sn1Var) {
                        L12 = new kk5(romDetailsActivity, 2);
                        sk2Var.h0(L12);
                    }
                    jv3.g(rg5Var, str, mj5Var, pp5Var, r94Var, ki2Var, mi2Var, mi2Var2, ki2Var2, aj2Var, ki2Var3, mi2Var3, ki2Var4, ki2Var5, ki2Var6, mi2Var4, (aj2) L12, sk2Var, RendererDebugBridge.CAPTURE_HEIGHT);
                } else {
                    sk2Var.R();
                }
                return o27Var;
        }
    }

    public /* synthetic */ xl0(zy3 zy3Var, ih4 ih4Var, Object obj, mi2 mi2Var, mi2 mi2Var2, aj2 aj2Var, mi2 mi2Var3, int i, int i2) {
        this.A = i2;
        this.B = zy3Var;
        this.L = ih4Var;
        this.c0 = obj;
        this.R = mi2Var;
        this.X = mi2Var2;
        this.Y = aj2Var;
        this.Z = mi2Var3;
    }

    public /* synthetic */ xl0(UUID uuid, BackgroundMode backgroundMode, aj2 aj2Var, ki2 ki2Var, mi2 mi2Var, ki2 ki2Var2, ki2 ki2Var3, int i) {
        this.A = 2;
        this.B = uuid;
        this.L = backgroundMode;
        this.Y = aj2Var;
        this.c0 = ki2Var;
        this.R = mi2Var;
        this.X = ki2Var2;
        this.Z = ki2Var3;
    }

    public /* synthetic */ xl0(RomDetailsActivity romDetailsActivity, r9 r9Var, k24 k24Var, k24 k24Var2, k24 k24Var3, k24 k24Var4, k24 k24Var5) {
        this.A = 4;
        this.B = romDetailsActivity;
        this.L = r9Var;
        this.c0 = k24Var;
        this.R = k24Var2;
        this.X = k24Var3;
        this.Z = k24Var4;
        this.Y = k24Var5;
    }
}
