package defpackage;

import android.content.Context;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tt5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class tt5 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ mi6 B;
    public final /* synthetic */ Context L;
    public final /* synthetic */ zt5 R;
    public final /* synthetic */ String X;
    public final /* synthetic */ String[] Y;
    public final /* synthetic */ qn2 Z;

    public /* synthetic */ tt5(mi6 mi6Var, Context context, String[] strArr, zt5 zt5Var, String str, qn2 qn2Var) {
        this.A = 0;
        this.B = mi6Var;
        this.L = context;
        this.Y = strArr;
        this.R = zt5Var;
        this.X = str;
        this.Z = qn2Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        qn2 qn2Var = this.Z;
        String[] strArr = this.Y;
        String str = this.X;
        zt5 zt5Var = this.R;
        Context context = this.L;
        switch (i) {
            case 0:
                String string = context.getString(R.string.internal_resolution);
                string.getClass();
                this.B.a(string, gt0.V0(hf.b0(null), gt0.k1(new j93(1, strArr.length, 1))), new st5(str, strArr, context, 2), zt5Var.p, new y00(13, qn2Var));
                return jg7Var;
            case 1:
                String string2 = context.getString(R.string.label_rom_config_input_mode);
                string2.getClass();
                this.B.a(string2, gt0.k1(nx5.getEntries()), new st5(str, strArr, context, 0), zt5Var.k, new y00(7, qn2Var));
                return jg7Var;
            case 2:
                String string3 = context.getString(R.string.label_rom_config_console);
                string3.getClass();
                this.B.a(string3, gt0.k1(u26.getEntries()), new st5(str, strArr, context, 1), zt5Var.a, new y00(10, qn2Var));
                return jg7Var;
            default:
                String string4 = context.getString(R.string.microphone_source);
                string4.getClass();
                this.B.a(string4, gt0.k1(a36.getEntries()), new st5(str, strArr, context, 4), zt5Var.c, new y00(21, qn2Var));
                return jg7Var;
        }
    }

    public /* synthetic */ tt5(mi6 mi6Var, Context context, zt5 zt5Var, String str, String[] strArr, qn2 qn2Var, int i) {
        this.A = i;
        this.B = mi6Var;
        this.L = context;
        this.R = zt5Var;
        this.X = str;
        this.Y = strArr;
        this.Z = qn2Var;
    }
}
