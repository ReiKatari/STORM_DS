package defpackage;

import android.content.DialogInterface;
import com.stormds.emulator.R;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iw  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class iw implements ne2, no2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ iw(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    @Override // defpackage.ne2
    public final Object a(Object obj, r41 r41Var) {
        String string;
        int i;
        int i2 = this.A;
        jg7 jg7Var = jg7.a;
        Object obj2 = this.B;
        switch (i2) {
            case 0:
                ((lw) obj2).k((hw) obj);
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                return jg7Var;
            default:
                final mz1 mz1Var = (mz1) obj;
                EmulatorActivity emulatorActivity = (EmulatorActivity) obj2;
                int i3 = EmulatorActivity.Z1;
                long j = mz1Var.b / 1000;
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
                if (mz1Var.c) {
                    i = R.string.shader_heavy_compile_measured;
                } else {
                    i = R.string.shader_heavy_compile_estimated;
                }
                String string2 = emulatorActivity.getString(i, mz1Var.a, string);
                string2.getClass();
                zb zbVar = new zb(emulatorActivity);
                zbVar.z(R.string.shader_heavy_compile_title);
                wb wbVar = (wb) zbVar.L;
                wbVar.f = string2;
                wbVar.m = false;
                zbVar.y(R.string.shader_heavy_compile_continue, new DialogInterface.OnClickListener() { // from class: fv1
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i4) {
                        int i5 = r2;
                        mz1 mz1Var2 = mz1Var;
                        switch (i5) {
                            case 0:
                                int i6 = EmulatorActivity.Z1;
                                mz1Var2.d.b0(Boolean.TRUE);
                                return;
                            default:
                                int i7 = EmulatorActivity.Z1;
                                mz1Var2.d.b0(Boolean.FALSE);
                                return;
                        }
                    }
                });
                zbVar.x(R.string.shader_heavy_compile_skip, new DialogInterface.OnClickListener() { // from class: fv1
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i4) {
                        int i5 = r2;
                        mz1 mz1Var2 = mz1Var;
                        switch (i5) {
                            case 0:
                                int i6 = EmulatorActivity.Z1;
                                mz1Var2.d.b0(Boolean.TRUE);
                                return;
                            default:
                                int i7 = EmulatorActivity.Z1;
                                mz1Var2.d.b0(Boolean.FALSE);
                                return;
                        }
                    }
                });
                zbVar.B();
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                return jg7Var;
        }
    }

    @Override // defpackage.no2
    public final ao2 b() {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                return new u9(2, 4, lw.class, (lw) obj, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V");
            default:
                return new u9(2, 4, EmulatorActivity.class, (EmulatorActivity) obj, "showHeavyShaderCompileDialog", "showHeavyShaderCompileDialog(Lme/magnum/melonds/ui/emulator/EmulatorViewModel$HeavyShaderCompileRequest;)V");
        }
    }

    public final boolean equals(Object obj) {
        switch (this.A) {
            case 0:
                if (!(obj instanceof ne2) || !(obj instanceof no2)) {
                    return false;
                }
                return b().equals(((no2) obj).b());
            default:
                if (!(obj instanceof ne2) || !(obj instanceof no2)) {
                    return false;
                }
                return b().equals(((no2) obj).b());
        }
    }

    public final int hashCode() {
        switch (this.A) {
            case 0:
                return b().hashCode();
            default:
                return b().hashCode();
        }
    }
}
