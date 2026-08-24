package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c64  reason: default package */
/* loaded from: classes.dex */
public final class c64 implements y54 {
    public final /* synthetic */ int a;
    public final yc1 b;

    public /* synthetic */ c64(int i, yc1 yc1Var) {
        this.a = i;
        this.b = yc1Var;
    }

    public static hf7 d(ef7 ef7Var) {
        String f = ef7Var.f();
        String g = ef7Var.g();
        List<i05> h = ef7Var.h();
        ArrayList arrayList = new ArrayList(ht0.v0(h, 10));
        for (i05 i05Var : h) {
            arrayList.add(new k05(new pf5(i05Var.f().i(), i05Var.f().j(), i05Var.f().h(), i05Var.f().g()), i05Var.e(), null, null));
        }
        return new hf7(f, g, arrayList);
    }

    @Override // defpackage.y54
    public final int a() {
        switch (this.a) {
            case 0:
                return 25;
            default:
                return 36;
        }
    }

    @Override // defpackage.y54
    public final void b() {
        int i = this.a;
        yc1 yc1Var = this.b;
        switch (i) {
            case 0:
                yc1Var.H("layouts.json", ek3.class, new v83(this, 25));
                return;
            default:
                yc1Var.H("rom_data.json", mw5.class, new v83(28));
                return;
        }
    }

    @Override // defpackage.y54
    public final int c() {
        switch (this.a) {
            case 0:
                return 26;
            default:
                return 37;
        }
    }
}
