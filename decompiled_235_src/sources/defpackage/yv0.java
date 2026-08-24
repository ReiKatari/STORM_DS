package defpackage;

import android.content.DialogInterface;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.emulator.a;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yv0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yv0 extends u9 implements eo2 {
    public final /* synthetic */ int d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yv0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.d0 = i3;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        int i = this.d0;
        jg7 jg7Var = jg7.a;
        Object obj3 = this.A;
        switch (i) {
            case 0:
                ((zv0) obj3).a((px0) obj, ((Number) obj2).intValue());
                return jg7Var;
            case 1:
                xc5 xc5Var = (xc5) obj;
                r41 r41Var = (r41) obj2;
                final EmulatorActivity emulatorActivity = (EmulatorActivity) obj3;
                bt btVar = emulatorActivity.V1;
                ac acVar = emulatorActivity.y1;
                if (acVar != null) {
                    acVar.setOnDismissListener(null);
                }
                ac acVar2 = emulatorActivity.y1;
                if (acVar2 != null) {
                    acVar2.dismiss();
                }
                emulatorActivity.y1 = null;
                ac acVar3 = emulatorActivity.z1;
                if (acVar3 != null) {
                    acVar3.setOnDismissListener(null);
                }
                ac acVar4 = emulatorActivity.z1;
                if (acVar4 != null) {
                    acVar4.dismiss();
                }
                emulatorActivity.z1 = null;
                ac acVar5 = emulatorActivity.A1;
                if (acVar5 != null) {
                    acVar5.setOnDismissListener(null);
                }
                ac acVar6 = emulatorActivity.A1;
                if (acVar6 != null) {
                    acVar6.dismiss();
                }
                emulatorActivity.A1 = null;
                ex1 ex1Var = ex1.RA_PENDING_EXIT;
                btVar.T(ex1Var);
                ex1 ex1Var2 = ex1.RA_PENDING_SYNC;
                btVar.T(ex1Var2);
                if (!nb3.k(xc5Var, uc5.a)) {
                    boolean z2 = xc5Var instanceof tc5;
                    int i2 = R.string.offline_ra_continue_playing_button;
                    if (z2) {
                        tc5 tc5Var = (tc5) xc5Var;
                        final long j = tc5Var.a;
                        lc5 lc5Var = tc5Var.b;
                        if (tc5Var.c == mc5.RESUMABLE_SESSION) {
                            z = true;
                        } else {
                            z = false;
                        }
                        ac acVar7 = emulatorActivity.y1;
                        if (acVar7 != null) {
                            acVar7.dismiss();
                        }
                        btVar.z(ex1Var);
                        zb zbVar = new zb(emulatorActivity);
                        wb wbVar = (wb) zbVar.L;
                        wbVar.d = emulatorActivity.getString(R.string.ra_pending_exit_title);
                        wbVar.f = emulatorActivity.getString(R.string.ra_pending_exit_message, Integer.valueOf(lc5Var.a), Integer.valueOf(lc5Var.b), Integer.valueOf(lc5Var.c));
                        wbVar.m = false;
                        zbVar.y(R.string.ra_pending_sync_and_exit, new DialogInterface.OnClickListener() { // from class: dv1
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                int i4 = r4;
                                long j2 = j;
                                EmulatorActivity emulatorActivity2 = emulatorActivity;
                                switch (i4) {
                                    case 0:
                                        int i5 = EmulatorActivity.Z1;
                                        emulatorActivity2.W().b1(j2, yv2.SYNC_AND_EXIT);
                                        return;
                                    case 1:
                                        int i6 = EmulatorActivity.Z1;
                                        emulatorActivity2.W().b1(j2, yv2.DISCARD_AND_EXIT);
                                        return;
                                    default:
                                        int i7 = EmulatorActivity.Z1;
                                        emulatorActivity2.W().b1(j2, yv2.CONTINUE_PLAYING);
                                        return;
                                }
                            }
                        });
                        zbVar.x(R.string.ra_pending_discard_and_exit, new DialogInterface.OnClickListener() { // from class: dv1
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                int i4 = r4;
                                long j2 = j;
                                EmulatorActivity emulatorActivity2 = emulatorActivity;
                                switch (i4) {
                                    case 0:
                                        int i5 = EmulatorActivity.Z1;
                                        emulatorActivity2.W().b1(j2, yv2.SYNC_AND_EXIT);
                                        return;
                                    case 1:
                                        int i6 = EmulatorActivity.Z1;
                                        emulatorActivity2.W().b1(j2, yv2.DISCARD_AND_EXIT);
                                        return;
                                    default:
                                        int i7 = EmulatorActivity.Z1;
                                        emulatorActivity2.W().b1(j2, yv2.CONTINUE_PLAYING);
                                        return;
                                }
                            }
                        });
                        if (z) {
                            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: dv1
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i3) {
                                    int i4 = r4;
                                    long j2 = j;
                                    EmulatorActivity emulatorActivity2 = emulatorActivity;
                                    switch (i4) {
                                        case 0:
                                            int i5 = EmulatorActivity.Z1;
                                            emulatorActivity2.W().b1(j2, yv2.SYNC_AND_EXIT);
                                            return;
                                        case 1:
                                            int i6 = EmulatorActivity.Z1;
                                            emulatorActivity2.W().b1(j2, yv2.DISCARD_AND_EXIT);
                                            return;
                                        default:
                                            int i7 = EmulatorActivity.Z1;
                                            emulatorActivity2.W().b1(j2, yv2.CONTINUE_PLAYING);
                                            return;
                                    }
                                }
                            };
                            wbVar.k = wbVar.a.getText(R.string.offline_ra_continue_playing_button);
                            wbVar.l = onClickListener;
                        }
                        final ac l = zbVar.l();
                        l.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ev1
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                int i3 = r3;
                                ac acVar8 = l;
                                EmulatorActivity emulatorActivity2 = emulatorActivity;
                                switch (i3) {
                                    case 0:
                                        if (emulatorActivity2.y1 == acVar8) {
                                            emulatorActivity2.V1.T(ex1.RA_PENDING_EXIT);
                                            emulatorActivity2.y1 = null;
                                            return;
                                        }
                                        return;
                                    case 1:
                                        if (emulatorActivity2.z1 == acVar8) {
                                            emulatorActivity2.V1.T(ex1.RA_PENDING_SYNC);
                                            emulatorActivity2.z1 = null;
                                            return;
                                        }
                                        return;
                                    default:
                                        if (emulatorActivity2.A1 == acVar8) {
                                            emulatorActivity2.V1.T(ex1.RA_PENDING_SYNC);
                                            emulatorActivity2.A1 = null;
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        emulatorActivity.y1 = l;
                        l.show();
                    } else if (xc5Var instanceof wc5) {
                        lc5 lc5Var2 = ((wc5) xc5Var).b;
                        ac acVar8 = emulatorActivity.A1;
                        if (acVar8 != null) {
                            acVar8.dismiss();
                        }
                        ac acVar9 = emulatorActivity.z1;
                        if (acVar9 != null) {
                            acVar9.dismiss();
                        }
                        btVar.z(ex1Var2);
                        zb zbVar2 = new zb(emulatorActivity);
                        zbVar2.z(R.string.ra_pending_syncing_title);
                        String string = emulatorActivity.getString(R.string.ra_pending_syncing_message, Integer.valueOf(lc5Var2.a), Integer.valueOf(lc5Var2.b), Integer.valueOf(lc5Var2.c));
                        wb wbVar2 = (wb) zbVar2.L;
                        wbVar2.f = string;
                        wbVar2.m = false;
                        final ac l2 = zbVar2.l();
                        l2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ev1
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                int i3 = r3;
                                ac acVar82 = l2;
                                EmulatorActivity emulatorActivity2 = emulatorActivity;
                                switch (i3) {
                                    case 0:
                                        if (emulatorActivity2.y1 == acVar82) {
                                            emulatorActivity2.V1.T(ex1.RA_PENDING_EXIT);
                                            emulatorActivity2.y1 = null;
                                            return;
                                        }
                                        return;
                                    case 1:
                                        if (emulatorActivity2.z1 == acVar82) {
                                            emulatorActivity2.V1.T(ex1.RA_PENDING_SYNC);
                                            emulatorActivity2.z1 = null;
                                            return;
                                        }
                                        return;
                                    default:
                                        if (emulatorActivity2.A1 == acVar82) {
                                            emulatorActivity2.V1.T(ex1.RA_PENDING_SYNC);
                                            emulatorActivity2.A1 = null;
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        emulatorActivity.z1 = l2;
                        l2.show();
                    } else if (xc5Var instanceof vc5) {
                        vc5 vc5Var = (vc5) xc5Var;
                        final long j2 = vc5Var.a;
                        dd5 dd5Var = vc5Var.b;
                        final ed5 ed5Var = vc5Var.c;
                        ac acVar10 = emulatorActivity.z1;
                        if (acVar10 != null) {
                            acVar10.dismiss();
                        }
                        emulatorActivity.z1 = null;
                        ac acVar11 = emulatorActivity.A1;
                        if (acVar11 != null) {
                            acVar11.dismiss();
                        }
                        btVar.z(ex1Var2);
                        zb zbVar3 = new zb(emulatorActivity);
                        zbVar3.z(R.string.ra_pending_sync_result_title);
                        int i3 = dd5Var.c;
                        lc5 lc5Var3 = dd5Var.h;
                        String string2 = emulatorActivity.getString(R.string.ra_pending_sync_result_message, Integer.valueOf(i3), Integer.valueOf(dd5Var.d), Integer.valueOf(dd5Var.e), Integer.valueOf(dd5Var.f), Integer.valueOf(dd5Var.g), Integer.valueOf(lc5Var3.a), Integer.valueOf(lc5Var3.e));
                        wb wbVar3 = (wb) zbVar3.L;
                        wbVar3.f = string2;
                        wbVar3.m = false;
                        int i4 = a.a[ed5Var.ordinal()];
                        if (i4 != 1) {
                            if (i4 != 2) {
                                if (i4 == 3) {
                                    i2 = R.string.ra_pending_review_submissions;
                                } else {
                                    i.d();
                                    return null;
                                }
                            }
                        } else {
                            i2 = R.string.pause;
                        }
                        zbVar3.y(i2, new DialogInterface.OnClickListener() { // from class: hv1
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i5) {
                                vc5 vc5Var2;
                                boolean z3;
                                EmulatorActivity emulatorActivity2 = EmulatorActivity.this;
                                long j3 = j2;
                                ed5 ed5Var2 = ed5Var;
                                int i6 = EmulatorActivity.Z1;
                                sz1 W = emulatorActivity2.W();
                                W.getClass();
                                ed5Var2.getClass();
                                eb ebVar = W.h0;
                                ebVar.getClass();
                                synchronized (ebVar.B) {
                                    try {
                                        Object value = ((tp6) ebVar.R).getValue();
                                        if (value instanceof vc5) {
                                            vc5Var2 = (vc5) value;
                                        } else {
                                            vc5Var2 = null;
                                        }
                                        z3 = false;
                                        if (vc5Var2 != null && vc5Var2.a == j3 && vc5Var2.c == ed5Var2) {
                                            tp6 tp6Var = (tp6) ebVar.R;
                                            uc5 uc5Var = uc5.a;
                                            tp6Var.getClass();
                                            tp6Var.m(null, uc5Var);
                                            z3 = true;
                                        }
                                    } finally {
                                    }
                                }
                                if (!z3) {
                                    return;
                                }
                                int i7 = wz1.k[ed5Var2.ordinal()];
                                if (i7 != 1) {
                                    if (i7 != 2) {
                                        if (i7 == 3) {
                                            W.Q0(mc5.TERMINAL_STOP);
                                            return;
                                        } else {
                                            i.d();
                                            return;
                                        }
                                    }
                                    W.T0();
                                    return;
                                }
                                W.M0(true);
                            }
                        });
                        final ac l3 = zbVar3.l();
                        l3.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ev1
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                int i32 = r3;
                                ac acVar82 = l3;
                                EmulatorActivity emulatorActivity2 = emulatorActivity;
                                switch (i32) {
                                    case 0:
                                        if (emulatorActivity2.y1 == acVar82) {
                                            emulatorActivity2.V1.T(ex1.RA_PENDING_EXIT);
                                            emulatorActivity2.y1 = null;
                                            return;
                                        }
                                        return;
                                    case 1:
                                        if (emulatorActivity2.z1 == acVar82) {
                                            emulatorActivity2.V1.T(ex1.RA_PENDING_SYNC);
                                            emulatorActivity2.z1 = null;
                                            return;
                                        }
                                        return;
                                    default:
                                        if (emulatorActivity2.A1 == acVar82) {
                                            emulatorActivity2.V1.T(ex1.RA_PENDING_SYNC);
                                            emulatorActivity2.A1 = null;
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        emulatorActivity.A1 = l3;
                        l3.show();
                    } else {
                        i.d();
                        return null;
                    }
                }
                return jg7Var;
            case 2:
                float floatValue = ((Number) obj).floatValue();
                r41 r41Var2 = (r41) obj2;
                n65 n65Var = (n65) obj3;
                boolean b = n65Var.b();
                rs4 rs4Var = n65Var.f;
                float f = RecyclerView.B1;
                if (!b) {
                    if (n65Var.a() > n65Var.g.h()) {
                        ((on2) n65Var.b.getValue()).c();
                    }
                    hv.L(n65Var.a, null, null, new qc(n65Var, RecyclerView.B1, null, 2), 3);
                    if (rs4Var.h() == RecyclerView.B1 || floatValue < RecyclerView.B1) {
                        floatValue = 0.0f;
                    }
                    rs4Var.i(RecyclerView.B1);
                    f = floatValue;
                }
                return new Float(f);
            case 3:
                r41 r41Var3 = (r41) obj2;
                e86 e86Var = (e86) obj3;
                hv.L(e86Var.H0.D(), null, null, new c86(e86Var, ((ol7) obj).a, null, 2), 3);
                return jg7Var;
            default:
                r41 r41Var4 = (r41) obj2;
                e86 e86Var2 = (e86) obj3;
                hv.L(e86Var2.H0.D(), null, null, new c86(e86Var2, ((ol7) obj).a, null, 1), 3);
                return jg7Var;
        }
    }
}
