package defpackage;

import android.content.DialogInterface;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qv  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class qv implements w92, jj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ qv(int i, Object obj) {
        this.A = i;
        this.B = obj;
    }

    @Override // defpackage.jj2
    public final wi2 a() {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                return new t9(2, 4, tv.class, (tv) obj, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V");
            default:
                return new t9(2, 4, EmulatorActivity.class, (EmulatorActivity) obj, "showHeavyShaderCompileDialog", "showHeavyShaderCompileDialog(Lme/magnum/melonds/ui/emulator/EmulatorViewModel$HeavyShaderCompileRequest;)V");
        }
    }

    @Override // defpackage.w92
    public final Object b(Object obj, j11 j11Var) {
        String string;
        int i;
        int i2 = this.A;
        o27 o27Var = o27.a;
        Object obj2 = this.B;
        switch (i2) {
            case 0:
                ((tv) obj2).k((pv) obj);
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                return o27Var;
            default:
                final bv1 bv1Var = (bv1) obj;
                EmulatorActivity emulatorActivity = (EmulatorActivity) obj2;
                int i3 = EmulatorActivity.P1;
                long j = bv1Var.b / 1000;
                if (j < 1) {
                    j = 1;
                }
                if (j >= 60) {
                    string = emulatorActivity.getString(R.string.shader_duration_minutes, Long.valueOf(j / 60), Long.valueOf(j % 60));
                    string.getClass();
                } else {
                    string = emulatorActivity.getString(R.string.shader_duration_seconds, Long.valueOf(j));
                    string.getClass();
                }
                if (bv1Var.c) {
                    i = R.string.shader_heavy_compile_measured;
                } else {
                    i = R.string.shader_heavy_compile_estimated;
                }
                String string2 = emulatorActivity.getString(i, bv1Var.a, string);
                string2.getClass();
                sb sbVar = new sb(emulatorActivity);
                sbVar.A(R.string.shader_heavy_compile_title);
                pb pbVar = (pb) sbVar.L;
                pbVar.f = string2;
                pbVar.m = false;
                sbVar.z(R.string.shader_heavy_compile_continue, new DialogInterface.OnClickListener() { // from class: tq1
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i4) {
                        int i5 = r2;
                        bv1 bv1Var2 = bv1Var;
                        switch (i5) {
                            case 0:
                                int i6 = EmulatorActivity.P1;
                                bv1Var2.d.c0(Boolean.TRUE);
                                return;
                            default:
                                int i7 = EmulatorActivity.P1;
                                bv1Var2.d.c0(Boolean.FALSE);
                                return;
                        }
                    }
                });
                sbVar.x(R.string.shader_heavy_compile_skip, new DialogInterface.OnClickListener() { // from class: tq1
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i4) {
                        int i5 = r2;
                        bv1 bv1Var2 = bv1Var;
                        switch (i5) {
                            case 0:
                                int i6 = EmulatorActivity.P1;
                                bv1Var2.d.c0(Boolean.TRUE);
                                return;
                            default:
                                int i7 = EmulatorActivity.P1;
                                bv1Var2.d.c0(Boolean.FALSE);
                                return;
                        }
                    }
                });
                sbVar.C();
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                return o27Var;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.A) {
            case 0:
                if (!(obj instanceof w92) || !(obj instanceof jj2)) {
                    return false;
                }
                return a().equals(((jj2) obj).a());
            default:
                if (!(obj instanceof w92) || !(obj instanceof jj2)) {
                    return false;
                }
                return a().equals(((jj2) obj).a());
        }
    }

    public final int hashCode() {
        switch (this.A) {
            case 0:
                return a().hashCode();
            default:
                return a().hashCode();
        }
    }
}
