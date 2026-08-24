package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import me.magnum.melonds.ui.romlist.a;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jn3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jn3 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ jn3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
        this.X = obj4;
        this.Y = obj5;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        Object obj = this.Y;
        Object obj2 = this.X;
        Object obj3 = this.R;
        Object obj4 = this.L;
        Object obj5 = this.B;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) ((qa4) obj2).getValue();
                bool.booleanValue();
                ((go2) obj5).l((String) ((qa4) obj4).getValue(), (ck3) ((qa4) obj3).getValue(), bool, Integer.valueOf(u24.E(((rs4) obj).h())));
                return jg7Var;
            case 1:
                hv.L((w61) obj5, null, null, new kp5((ss5) obj4, (ip3) obj3, (pr3) obj2, (om6) obj, null, 1), 3);
                return jg7Var;
            case 2:
                Context context = (Context) obj4;
                String string = context.getString(R.string.threaded_rendering);
                string.getClass();
                ((mi6) obj5).a(string, hf.c0(null, Boolean.TRUE, Boolean.FALSE), new qk4(13, context, (String) obj2), ((zt5) obj3).n, new y00(11, (qn2) obj));
                return jg7Var;
            case 3:
                String string2 = ((Context) obj4).getString(R.string.label_rom_config_gba_slot);
                string2.getClass();
                ((mi6) obj5).a(string2, gt0.k1(ax5.getEntries()), new ro5((String[]) obj2, 2), ((zt5) obj3).h.a, new y00(9, (qn2) obj));
                return jg7Var;
            default:
                w61 w61Var = (w61) obj5;
                qa4 qa4Var = (qa4) obj4;
                qa4 qa4Var2 = (qa4) obj3;
                qa4Var.setValue(xc1.DECRYPTING);
                qa4Var2.setValue(Float.valueOf((float) RecyclerView.B1));
                xe1 xe1Var = xk1.a;
                hv.L(w61Var, de1.L, null, new uy5((a) obj2, (pq5) obj, w61Var, qa4Var2, qa4Var, null), 2);
                return jg7Var;
        }
    }
}
