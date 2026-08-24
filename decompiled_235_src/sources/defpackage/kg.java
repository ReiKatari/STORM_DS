package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kg  reason: default package */
/* loaded from: classes.dex */
public final class kg extends aj3 implements qn2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ ArrayList L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kg(int i, ArrayList arrayList) {
        super(1);
        this.B = i;
        this.L = arrayList;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.B;
        jg7 jg7Var = jg7.a;
        ArrayList arrayList = this.L;
        switch (i) {
            case 0:
                cx4 cx4Var = (cx4) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    cx4.l(cx4Var, (dx4) arrayList.get(i2), 0, 0);
                }
                return jg7Var;
            case 1:
                cx4 cx4Var2 = (cx4) obj;
                int size2 = arrayList.size() - 1;
                if (size2 >= 0) {
                    int i3 = 0;
                    while (true) {
                        cx4.l(cx4Var2, (dx4) arrayList.get(i3), 0, 0);
                        if (i3 != size2) {
                            i3++;
                        }
                    }
                }
                return jg7Var;
            case 2:
                cx4 cx4Var3 = (cx4) obj;
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    cx4.j(cx4Var3, (dx4) arrayList.get(i4), 0, 0);
                }
                return jg7Var;
            default:
                cx4 cx4Var4 = (cx4) obj;
                int size4 = arrayList.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    cx4.m(cx4Var4, (dx4) arrayList.get(i5), 0, 0);
                }
                return jg7Var;
        }
    }
}
