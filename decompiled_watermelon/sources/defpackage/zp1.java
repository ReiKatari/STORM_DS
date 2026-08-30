package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zp1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class zp1 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ tb b;
    public final /* synthetic */ EmulatorActivity c;
    public final /* synthetic */ ki2 d;

    public /* synthetic */ zp1(tb tbVar, EmulatorActivity emulatorActivity, ki2 ki2Var) {
        this.b = tbVar;
        this.c = emulatorActivity;
        this.d = ki2Var;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        Button f;
        int i = this.a;
        ki2 ki2Var = this.d;
        final EmulatorActivity emulatorActivity = this.c;
        final tb tbVar = this.b;
        switch (i) {
            case 0:
                int i2 = EmulatorActivity.P1;
                if (ki2Var != null && (f = tbVar.f(-2)) != null) {
                    f.setOnClickListener(new dq1(tbVar, emulatorActivity, ki2Var, 0));
                }
                Button f2 = tbVar.f(-3);
                if (f2 != null) {
                    f2.setOnClickListener(new View.OnClickListener() { // from class: eq1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i3 = r3;
                            tb tbVar2 = tbVar;
                            EmulatorActivity emulatorActivity2 = emulatorActivity;
                            switch (i3) {
                                case 0:
                                    int i4 = EmulatorActivity.P1;
                                    emulatorActivity2.M0();
                                    emulatorActivity2.P0(tbVar2);
                                    return;
                                default:
                                    int i5 = EmulatorActivity.P1;
                                    emulatorActivity2.M0();
                                    emulatorActivity2.P0(tbVar2);
                                    return;
                            }
                        }
                    });
                }
                Button f3 = tbVar.f(-1);
                if (f3 != null) {
                    f3.setOnClickListener(new fq1(emulatorActivity, 0));
                }
                emulatorActivity.P0(tbVar);
                return;
            default:
                int i3 = EmulatorActivity.P1;
                Button f4 = tbVar.f(-2);
                if (f4 != null) {
                    f4.setOnClickListener(new dq1(tbVar, emulatorActivity, ki2Var, 1));
                }
                Button f5 = tbVar.f(-3);
                if (f5 != null) {
                    f5.setOnClickListener(new View.OnClickListener() { // from class: eq1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i32 = r3;
                            tb tbVar2 = tbVar;
                            EmulatorActivity emulatorActivity2 = emulatorActivity;
                            switch (i32) {
                                case 0:
                                    int i4 = EmulatorActivity.P1;
                                    emulatorActivity2.M0();
                                    emulatorActivity2.P0(tbVar2);
                                    return;
                                default:
                                    int i5 = EmulatorActivity.P1;
                                    emulatorActivity2.M0();
                                    emulatorActivity2.P0(tbVar2);
                                    return;
                            }
                        }
                    });
                }
                Button f6 = tbVar.f(-1);
                if (f6 != null) {
                    f6.setOnClickListener(new fq1(emulatorActivity, 2));
                }
                emulatorActivity.P0(tbVar);
                return;
        }
    }

    public /* synthetic */ zp1(ki2 ki2Var, tb tbVar, EmulatorActivity emulatorActivity) {
        this.d = ki2Var;
        this.b = tbVar;
        this.c = emulatorActivity;
    }
}
