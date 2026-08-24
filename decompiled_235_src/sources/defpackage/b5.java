package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class b5 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ List B;

    public /* synthetic */ b5(int i, List list) {
        this.A = i;
        this.B = list;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        List list = this.B;
        switch (i) {
            case 0:
                return new ts4(((c6) gt0.H0(list)).a);
            case 1:
                Object obj = list.get(2);
                obj.getClass();
                return (Integer) obj;
            case 2:
                return list;
            case 3:
                return ((hg3) list.get(0)).c();
            default:
                return ((hg3) list.get(0)).c();
        }
    }
}
