package defpackage;

import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ao3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ao3 implements fo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;

    public /* synthetic */ ao3(boolean z, int i) {
        this.A = i;
        this.B = z;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        boolean z;
        String str;
        boolean z2;
        int i;
        int i2;
        int i3 = this.A;
        jg7 jg7Var = jg7.a;
        boolean z3 = this.B;
        switch (i3) {
            case 0:
                px0 px0Var = (px0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    if (z3) {
                        str = i61.l(xq2Var, 1527556255, R.string.edit, xq2Var, false);
                    } else {
                        xq2Var.b0(-832279649);
                        xq2Var.p(false);
                        str = "Редактировать копию";
                    }
                    x37.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 0, 0, 131070);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                px0 px0Var2 = (px0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(intValue2 & 1, z2)) {
                    e33 w = ii2.w();
                    x64 x64Var = x64.a;
                    i13.a(w, null, dj6.i(x64Var, 20.0f), kt0.b, xq2Var2, 3504, 0);
                    gi2.h(xq2Var2, dj6.l(x64Var, 8.0f));
                    if (z3) {
                        i = -414100778;
                        i2 = R.string.file_picker_settings;
                    } else {
                        i = -413986791;
                        i2 = R.string.set_rom_directory;
                    }
                    String l = i61.l(xq2Var2, i, i2, xq2Var2, false);
                    x37.b(l, null, 0L, hi2.D(14.5d), oj2.e0, qs7.a, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 1772544, 0, 130966);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
        }
    }
}
