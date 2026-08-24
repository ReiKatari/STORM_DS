package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kk5  reason: default package */
/* loaded from: classes.dex */
public final class kk5 {
    public final List a;
    public final Map b;
    public final Map c;
    public final List d;
    public final bl5 e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [zt1] */
    public kk5(List list, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, ArrayList arrayList, bl5 bl5Var, int i) {
        int i2 = i & 2;
        ?? r1 = zt1.A;
        linkedHashMap = i2 != 0 ? r1 : linkedHashMap;
        linkedHashMap2 = (i & 4) != 0 ? r1 : linkedHashMap2;
        List list2 = (i & 8) != 0 ? yt1.A : arrayList;
        bl5Var = (i & 16) != 0 ? null : bl5Var;
        linkedHashMap.getClass();
        linkedHashMap2.getClass();
        list2.getClass();
        this.a = list;
        this.b = linkedHashMap;
        this.c = linkedHashMap2;
        this.d = list2;
        this.e = bl5Var;
    }

    public final String toString() {
        bl5 bl5Var;
        String str;
        if (this.e == null) {
            str = "";
        } else {
            str = ", template=" + ((Object) bl5.b(bl5Var.a));
        }
        return "Request(streams=" + this.a + str + ")@" + Integer.toHexString(hashCode());
    }
}
