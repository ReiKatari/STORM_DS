package defpackage;

import android.content.Context;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ej5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ej5 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ x66 B;
    public final /* synthetic */ Context L;
    public final /* synthetic */ jj5 R;
    public final /* synthetic */ String X;
    public final /* synthetic */ String[] Y;
    public final /* synthetic */ mi2 Z;

    public /* synthetic */ ej5(x66 x66Var, Context context, String[] strArr, jj5 jj5Var, String str, mi2 mi2Var) {
        this.A = 0;
        this.B = x66Var;
        this.L = context;
        this.Y = strArr;
        this.R = jj5Var;
        this.X = str;
        this.Z = mi2Var;
    }

    @Override // defpackage.ki2
    public final Object c() {
        int i = this.A;
        o27 o27Var = o27.a;
        mi2 mi2Var = this.Z;
        String[] strArr = this.Y;
        String str = this.X;
        jj5 jj5Var = this.R;
        Context context = this.L;
        switch (i) {
            case 0:
                String string = context.getString(R.string.internal_resolution);
                string.getClass();
                this.B.a(string, tq0.X0(l07.b0(null), tq0.n1(new b33(1, strArr.length, 1))), new dj5(str, strArr, context, 2), jj5Var.p, new hz(12, mi2Var));
                return o27Var;
            case 1:
                String string2 = context.getString(R.string.label_rom_config_input_mode);
                string2.getClass();
                this.B.a(string2, tq0.n1(ym5.getEntries()), new dj5(str, strArr, context, 5), jj5Var.k, new hz(21, mi2Var));
                return o27Var;
            case 2:
                String string3 = context.getString(R.string.label_rom_config_console);
                string3.getClass();
                this.B.a(string3, tq0.n1(cs5.getEntries()), new dj5(str, strArr, context, 1), jj5Var.a, new hz(9, mi2Var));
                return o27Var;
            default:
                String string4 = context.getString(R.string.microphone_source);
                string4.getClass();
                this.B.a(string4, tq0.n1(is5.getEntries()), new dj5(str, strArr, context, 3), jj5Var.c, new hz(18, mi2Var));
                return o27Var;
        }
    }

    public /* synthetic */ ej5(x66 x66Var, Context context, jj5 jj5Var, String str, String[] strArr, mi2 mi2Var, int i) {
        this.A = i;
        this.B = x66Var;
        this.L = context;
        this.R = jj5Var;
        this.X = str;
        this.Y = strArr;
        this.Z = mi2Var;
    }
}
