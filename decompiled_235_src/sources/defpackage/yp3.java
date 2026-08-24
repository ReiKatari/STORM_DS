package defpackage;

import java.util.Comparator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yp3  reason: default package */
/* loaded from: classes.dex */
public final class yp3 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ ei b;

    public /* synthetic */ yp3(ei eiVar, int i) {
        this.a = i;
        this.b = eiVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        ei eiVar = this.b;
        switch (i) {
            case 0:
                return g04.z(Integer.valueOf(eiVar.e(((gq3) obj).getKey())), Integer.valueOf(eiVar.e(((gq3) obj2).getKey())));
            case 1:
                return g04.z(Integer.valueOf(eiVar.e(((gq3) obj).getKey())), Integer.valueOf(eiVar.e(((gq3) obj2).getKey())));
            case 2:
                return g04.z(Integer.valueOf(eiVar.e(((gq3) obj2).getKey())), Integer.valueOf(eiVar.e(((gq3) obj).getKey())));
            default:
                return g04.z(Integer.valueOf(eiVar.e(((gq3) obj2).getKey())), Integer.valueOf(eiVar.e(((gq3) obj).getKey())));
        }
    }
}
