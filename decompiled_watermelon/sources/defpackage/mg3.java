package defpackage;

import android.content.Context;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mg3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class mg3 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ mg3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
        this.X = obj4;
        this.Y = obj5;
    }

    @Override // defpackage.ki2
    public final Object c() {
        int i = this.A;
        o27 o27Var = o27.a;
        Object obj = this.Y;
        Object obj2 = this.X;
        Object obj3 = this.R;
        Object obj4 = this.L;
        Object obj5 = this.B;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) ((k24) obj2).getValue();
                bool.booleanValue();
                ((cj2) obj5).q((String) ((k24) obj4).getValue(), (kd3) ((k24) obj3).getValue(), bool, Integer.valueOf(jv3.X(((pj4) obj).h())));
                return o27Var;
            case 1:
                tq5.w((o31) obj5, null, null, new m5((ri5) obj4, (ki3) obj3, (pk3) obj2, (za6) obj, null, 29), 3);
                return o27Var;
            case 2:
                Context context = (Context) obj4;
                String string = context.getString(R.string.threaded_rendering);
                string.getClass();
                ((x66) obj5).a(string, l07.c0(null, Boolean.TRUE, Boolean.FALSE), new zr4(8, context, (String) obj2), ((jj5) obj3).n, new hz(10, (mi2) obj));
                return o27Var;
            default:
                String string2 = ((Context) obj4).getString(R.string.label_rom_config_gba_slot);
                string2.getClass();
                ((x66) obj5).a(string2, tq0.n1(lm5.getEntries()), new n95(4, (String[]) obj2), ((jj5) obj3).h.a, new hz(7, (mi2) obj));
                return o27Var;
        }
    }
}
