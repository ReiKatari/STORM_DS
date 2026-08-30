package defpackage;

import android.content.DialogInterface;
import androidx.recyclerview.widget.RecyclerView;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.emulator.a;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dt0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dt0 extends t9 implements aj2 {
    public final /* synthetic */ int c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dt0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.c0 = i3;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        int i = this.c0;
        o27 o27Var = o27.a;
        Object obj3 = this.A;
        switch (i) {
            case 0:
                ((et0) obj3).a((tu0) obj, ((Number) obj2).intValue());
                return o27Var;
            case 1:
                n35 n35Var = (n35) obj;
                j11 j11Var = (j11) obj2;
                final EmulatorActivity emulatorActivity = (EmulatorActivity) obj3;
                os osVar = emulatorActivity.O1;
                tb tbVar = emulatorActivity.s1;
                if (tbVar != null) {
                    tbVar.setOnDismissListener(null);
                }
                tb tbVar2 = emulatorActivity.s1;
                if (tbVar2 != null) {
                    tbVar2.dismiss();
                }
                emulatorActivity.s1 = null;
                tb tbVar3 = emulatorActivity.t1;
                if (tbVar3 != null) {
                    tbVar3.setOnDismissListener(null);
                }
                tb tbVar4 = emulatorActivity.t1;
                if (tbVar4 != null) {
                    tbVar4.dismiss();
                }
                emulatorActivity.t1 = null;
                tb tbVar5 = emulatorActivity.u1;
                if (tbVar5 != null) {
                    tbVar5.setOnDismissListener(null);
                }
                tb tbVar6 = emulatorActivity.u1;
                if (tbVar6 != null) {
                    tbVar6.dismiss();
                }
                emulatorActivity.u1 = null;
                ts1 ts1Var = ts1.RA_PENDING_EXIT;
                osVar.M(ts1Var);
                ts1 ts1Var2 = ts1.RA_PENDING_SYNC;
                osVar.M(ts1Var2);
                if (!b53.x(n35Var, k35.a)) {
                    boolean z2 = n35Var instanceof j35;
                    int i2 = R.string.offline_ra_continue_playing_button;
                    if (z2) {
                        j35 j35Var = (j35) n35Var;
                        final long j = j35Var.a;
                        b35 b35Var = j35Var.b;
                        if (j35Var.c == c35.RESUMABLE_SESSION) {
                            z = true;
                        } else {
                            z = false;
                        }
                        tb tbVar7 = emulatorActivity.s1;
                        if (tbVar7 != null) {
                            tbVar7.dismiss();
                        }
                        osVar.l(ts1Var);
                        sb sbVar = new sb(emulatorActivity);
                        pb pbVar = (pb) sbVar.L;
                        pbVar.d = emulatorActivity.getString(R.string.ra_pending_exit_title);
                        pbVar.f = emulatorActivity.getString(R.string.ra_pending_exit_message, Integer.valueOf(b35Var.a), Integer.valueOf(b35Var.b), Integer.valueOf(b35Var.c));
                        pbVar.m = false;
                        sbVar.z(R.string.ra_pending_sync_and_exit, new DialogInterface.OnClickListener() { // from class: pq1
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                int i4 = r4;
                                long j2 = j;
                                EmulatorActivity emulatorActivity2 = emulatorActivity;
                                switch (i4) {
                                    case 0:
                                        int i5 = EmulatorActivity.P1;
                                        emulatorActivity2.U().d1(j2, xp2.SYNC_AND_EXIT);
                                        return;
                                    case 1:
                                        int i6 = EmulatorActivity.P1;
                                        emulatorActivity2.U().d1(j2, xp2.DISCARD_AND_EXIT);
                                        return;
                                    default:
                                        int i7 = EmulatorActivity.P1;
                                        emulatorActivity2.U().d1(j2, xp2.CONTINUE_PLAYING);
                                        return;
                                }
                            }
                        });
                        sbVar.x(R.string.ra_pending_discard_and_exit, new DialogInterface.OnClickListener() { // from class: pq1
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                int i4 = r4;
                                long j2 = j;
                                EmulatorActivity emulatorActivity2 = emulatorActivity;
                                switch (i4) {
                                    case 0:
                                        int i5 = EmulatorActivity.P1;
                                        emulatorActivity2.U().d1(j2, xp2.SYNC_AND_EXIT);
                                        return;
                                    case 1:
                                        int i6 = EmulatorActivity.P1;
                                        emulatorActivity2.U().d1(j2, xp2.DISCARD_AND_EXIT);
                                        return;
                                    default:
                                        int i7 = EmulatorActivity.P1;
                                        emulatorActivity2.U().d1(j2, xp2.CONTINUE_PLAYING);
                                        return;
                                }
                            }
                        });
                        if (z) {
                            sbVar.y(R.string.offline_ra_continue_playing_button, new DialogInterface.OnClickListener() { // from class: pq1
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i3) {
                                    int i4 = r4;
                                    long j2 = j;
                                    EmulatorActivity emulatorActivity2 = emulatorActivity;
                                    switch (i4) {
                                        case 0:
                                            int i5 = EmulatorActivity.P1;
                                            emulatorActivity2.U().d1(j2, xp2.SYNC_AND_EXIT);
                                            return;
                                        case 1:
                                            int i6 = EmulatorActivity.P1;
                                            emulatorActivity2.U().d1(j2, xp2.DISCARD_AND_EXIT);
                                            return;
                                        default:
                                            int i7 = EmulatorActivity.P1;
                                            emulatorActivity2.U().d1(j2, xp2.CONTINUE_PLAYING);
                                            return;
                                    }
                                }
                            });
                        }
                        final tb l = sbVar.l();
                        l.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: qq1
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                int i3 = r3;
                                tb tbVar8 = l;
                                EmulatorActivity emulatorActivity2 = emulatorActivity;
                                switch (i3) {
                                    case 0:
                                        if (emulatorActivity2.s1 == tbVar8) {
                                            emulatorActivity2.O1.M(ts1.RA_PENDING_EXIT);
                                            emulatorActivity2.s1 = null;
                                            return;
                                        }
                                        return;
                                    case 1:
                                        if (emulatorActivity2.t1 == tbVar8) {
                                            emulatorActivity2.O1.M(ts1.RA_PENDING_SYNC);
                                            emulatorActivity2.t1 = null;
                                            return;
                                        }
                                        return;
                                    default:
                                        if (emulatorActivity2.u1 == tbVar8) {
                                            emulatorActivity2.O1.M(ts1.RA_PENDING_SYNC);
                                            emulatorActivity2.u1 = null;
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        emulatorActivity.s1 = l;
                        l.show();
                    } else if (n35Var instanceof m35) {
                        b35 b35Var2 = ((m35) n35Var).b;
                        tb tbVar8 = emulatorActivity.u1;
                        if (tbVar8 != null) {
                            tbVar8.dismiss();
                        }
                        tb tbVar9 = emulatorActivity.t1;
                        if (tbVar9 != null) {
                            tbVar9.dismiss();
                        }
                        osVar.l(ts1Var2);
                        sb sbVar2 = new sb(emulatorActivity);
                        sbVar2.A(R.string.ra_pending_syncing_title);
                        String string = emulatorActivity.getString(R.string.ra_pending_syncing_message, Integer.valueOf(b35Var2.a), Integer.valueOf(b35Var2.b), Integer.valueOf(b35Var2.c));
                        pb pbVar2 = (pb) sbVar2.L;
                        pbVar2.f = string;
                        pbVar2.m = false;
                        final tb l2 = sbVar2.l();
                        l2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: qq1
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                int i3 = r3;
                                tb tbVar82 = l2;
                                EmulatorActivity emulatorActivity2 = emulatorActivity;
                                switch (i3) {
                                    case 0:
                                        if (emulatorActivity2.s1 == tbVar82) {
                                            emulatorActivity2.O1.M(ts1.RA_PENDING_EXIT);
                                            emulatorActivity2.s1 = null;
                                            return;
                                        }
                                        return;
                                    case 1:
                                        if (emulatorActivity2.t1 == tbVar82) {
                                            emulatorActivity2.O1.M(ts1.RA_PENDING_SYNC);
                                            emulatorActivity2.t1 = null;
                                            return;
                                        }
                                        return;
                                    default:
                                        if (emulatorActivity2.u1 == tbVar82) {
                                            emulatorActivity2.O1.M(ts1.RA_PENDING_SYNC);
                                            emulatorActivity2.u1 = null;
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        emulatorActivity.t1 = l2;
                        l2.show();
                    } else if (n35Var instanceof l35) {
                        l35 l35Var = (l35) n35Var;
                        final long j2 = l35Var.a;
                        t35 t35Var = l35Var.b;
                        final u35 u35Var = l35Var.c;
                        tb tbVar10 = emulatorActivity.t1;
                        if (tbVar10 != null) {
                            tbVar10.dismiss();
                        }
                        emulatorActivity.t1 = null;
                        tb tbVar11 = emulatorActivity.u1;
                        if (tbVar11 != null) {
                            tbVar11.dismiss();
                        }
                        osVar.l(ts1Var2);
                        sb sbVar3 = new sb(emulatorActivity);
                        sbVar3.A(R.string.ra_pending_sync_result_title);
                        int i3 = t35Var.c;
                        b35 b35Var3 = t35Var.h;
                        String string2 = emulatorActivity.getString(R.string.ra_pending_sync_result_message, Integer.valueOf(i3), Integer.valueOf(t35Var.d), Integer.valueOf(t35Var.e), Integer.valueOf(t35Var.f), Integer.valueOf(t35Var.g), Integer.valueOf(b35Var3.a), Integer.valueOf(b35Var3.e));
                        pb pbVar3 = (pb) sbVar3.L;
                        pbVar3.f = string2;
                        pbVar3.m = false;
                        int i4 = a.a[u35Var.ordinal()];
                        if (i4 != 1) {
                            if (i4 != 2) {
                                if (i4 == 3) {
                                    i2 = R.string.ra_pending_review_submissions;
                                } else {
                                    i.c();
                                    return null;
                                }
                            }
                        } else {
                            i2 = R.string.pause;
                        }
                        sbVar3.z(i2, new DialogInterface.OnClickListener() { // from class: uq1
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i5) {
                                l35 l35Var2;
                                boolean z3;
                                EmulatorActivity emulatorActivity2 = EmulatorActivity.this;
                                long j3 = j2;
                                u35 u35Var2 = u35Var;
                                int i6 = EmulatorActivity.P1;
                                hv1 U = emulatorActivity2.U();
                                U.getClass();
                                u35Var2.getClass();
                                q9 q9Var = U.h0;
                                q9Var.getClass();
                                synchronized (q9Var.B) {
                                    try {
                                        Object value = ((ee6) q9Var.R).getValue();
                                        if (value instanceof l35) {
                                            l35Var2 = (l35) value;
                                        } else {
                                            l35Var2 = null;
                                        }
                                        z3 = false;
                                        if (l35Var2 != null && l35Var2.a == j3 && l35Var2.c == u35Var2) {
                                            ee6 ee6Var = (ee6) q9Var.R;
                                            k35 k35Var = k35.a;
                                            ee6Var.getClass();
                                            ee6Var.l(null, k35Var);
                                            z3 = true;
                                        }
                                    } finally {
                                    }
                                }
                                if (!z3) {
                                    return;
                                }
                                int i7 = lv1.k[u35Var2.ordinal()];
                                if (i7 != 1) {
                                    if (i7 != 2) {
                                        if (i7 == 3) {
                                            U.S0(c35.TERMINAL_STOP);
                                            return;
                                        } else {
                                            i.c();
                                            return;
                                        }
                                    }
                                    U.V0();
                                    return;
                                }
                                U.O0(true);
                            }
                        });
                        final tb l3 = sbVar3.l();
                        l3.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: qq1
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                int i32 = r3;
                                tb tbVar82 = l3;
                                EmulatorActivity emulatorActivity2 = emulatorActivity;
                                switch (i32) {
                                    case 0:
                                        if (emulatorActivity2.s1 == tbVar82) {
                                            emulatorActivity2.O1.M(ts1.RA_PENDING_EXIT);
                                            emulatorActivity2.s1 = null;
                                            return;
                                        }
                                        return;
                                    case 1:
                                        if (emulatorActivity2.t1 == tbVar82) {
                                            emulatorActivity2.O1.M(ts1.RA_PENDING_SYNC);
                                            emulatorActivity2.t1 = null;
                                            return;
                                        }
                                        return;
                                    default:
                                        if (emulatorActivity2.u1 == tbVar82) {
                                            emulatorActivity2.O1.M(ts1.RA_PENDING_SYNC);
                                            emulatorActivity2.u1 = null;
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        emulatorActivity.u1 = l3;
                        l3.show();
                    } else {
                        i.c();
                        return null;
                    }
                }
                return o27Var;
            case 2:
                float floatValue = ((Number) obj).floatValue();
                j11 j11Var2 = (j11) obj2;
                ex4 ex4Var = (ex4) obj3;
                boolean b = ex4Var.b();
                pj4 pj4Var = ex4Var.f;
                float f = RecyclerView.A1;
                if (!b) {
                    if (ex4Var.a() > ex4Var.g.h()) {
                        ((ki2) ex4Var.b.getValue()).c();
                    }
                    tq5.w(ex4Var.a, null, null, new cc(ex4Var, RecyclerView.A1, null, 2), 3);
                    if (pj4Var.h() == RecyclerView.A1 || floatValue < RecyclerView.A1) {
                        floatValue = 0.0f;
                    }
                    pj4Var.i(RecyclerView.A1);
                    f = floatValue;
                }
                return new Float(f);
            case 3:
                j11 j11Var3 = (j11) obj2;
                rw5 rw5Var = (rw5) obj3;
                tq5.w(rw5Var.G0.C(), null, null, new pw5(rw5Var, ((p77) obj).a, null, 2), 3);
                return o27Var;
            default:
                j11 j11Var4 = (j11) obj2;
                rw5 rw5Var2 = (rw5) obj3;
                tq5.w(rw5Var2.G0.C(), null, null, new pw5(rw5Var2, ((p77) obj).a, null, 1), 3);
                return o27Var;
        }
    }
}
