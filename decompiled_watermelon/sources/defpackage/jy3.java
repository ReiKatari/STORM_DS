package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jy3  reason: default package */
/* loaded from: classes.dex */
public final class jy3 implements fy3 {
    public final /* synthetic */ int a;
    public final k91 b;

    public /* synthetic */ jy3(k91 k91Var, int i) {
        this.a = i;
        this.b = k91Var;
    }

    public static m17 d(j17 j17Var) {
        String f = j17Var.f();
        String g = j17Var.g();
        List<fr4> h = j17Var.h();
        ArrayList arrayList = new ArrayList(uq0.y0(h, 10));
        for (fr4 fr4Var : h) {
            arrayList.add(new hr4(new z55(fr4Var.f().i(), fr4Var.f().j(), fr4Var.f().h(), fr4Var.f().g()), fr4Var.e(), null, null));
        }
        return new m17(f, g, arrayList);
    }

    @Override // defpackage.fy3
    public final int a() {
        switch (this.a) {
            case 0:
                return 25;
            default:
                return 36;
        }
    }

    @Override // defpackage.fy3
    public final int b() {
        switch (this.a) {
            case 0:
                return 26;
            default:
                return 37;
        }
    }

    @Override // defpackage.fy3
    public final void c() {
        int i = this.a;
        k91 k91Var = this.b;
        switch (i) {
            case 0:
                k91Var.I("layouts.json", md3.class, new gi3(this, 13));
                return;
            default:
                k91Var.I("rom_data.json", xl5.class, new gi3(16));
                return;
        }
    }
}
