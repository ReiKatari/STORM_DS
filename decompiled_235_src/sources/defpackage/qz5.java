package defpackage;

import java.util.LinkedHashSet;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qz5  reason: default package */
/* loaded from: classes.dex */
public final class qz5 extends hw6 implements eo2 {
    public lb6 X;
    public tz5 Y;
    public pq5 Z;
    public int d0;
    public int e0;
    public /* synthetic */ Object f0;
    public final /* synthetic */ tz5 g0;
    public final /* synthetic */ pq5 h0;
    public final /* synthetic */ String i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz5(tz5 tz5Var, pq5 pq5Var, String str, r41 r41Var) {
        super(2, r41Var);
        this.g0 = tz5Var;
        this.h0 = pq5Var;
        this.i0 = str;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((qz5) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        qz5 qz5Var = new qz5(this.g0, this.h0, this.i0, r41Var);
        qz5Var.f0 = obj;
        return qz5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
        if (r8 == r1) goto L39;
     */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        tz5 tz5Var;
        int i;
        lb6 lb6Var;
        pq5 pq5Var;
        Object value;
        Map map;
        String str;
        w61 w61Var = (w61) this.f0;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i2 = this.e0;
        String str2 = null;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        w61 w61Var2 = (w61) this.Y;
                        lb6Var = this.X;
                        oi2.Y(obj);
                        String str3 = (String) obj;
                        if (!(str3 instanceof em5)) {
                            str2 = str3;
                        }
                        String str4 = str2;
                        lb6Var.c();
                        tp6 tp6Var = this.g0.l;
                        String str5 = this.i0;
                        do {
                            value = tp6Var.getValue();
                            map = (Map) value;
                            if (str4 == null) {
                                str = "";
                            } else {
                                str = str4;
                            }
                        } while (!tp6Var.j(value, c14.p0(map, new vr4(str5, str))));
                        tz5 tz5Var2 = this.g0;
                        LinkedHashSet linkedHashSet = tz5Var2.n;
                        String str6 = this.i0;
                        synchronized (linkedHashSet) {
                            tz5Var2.n.remove(str6);
                        }
                        return jg7.a;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i3 = this.d0;
                pq5Var = this.Z;
                tz5Var = this.Y;
                lb6 lb6Var2 = this.X;
                oi2.Y(obj);
                i = i3;
                lb6Var = lb6Var2;
            } else {
                oi2.Y(obj);
                tz5 tz5Var3 = this.g0;
                lb6 lb6Var3 = tz5Var3.o;
                pq5 pq5Var2 = this.h0;
                this.f0 = w61Var;
                this.X = lb6Var3;
                this.Y = tz5Var3;
                this.Z = pq5Var2;
                this.d0 = 0;
                this.e0 = 1;
                if (lb6Var3.a(this) != x61Var) {
                    tz5Var = tz5Var3;
                    i = 0;
                    lb6Var = lb6Var3;
                    pq5Var = pq5Var2;
                }
                return x61Var;
            }
            e70 e70Var = tz5Var.i;
            this.f0 = null;
            this.X = lb6Var;
            this.Y = null;
            this.Z = null;
            this.d0 = i;
            this.e0 = 2;
            obj = e70Var.e(pq5Var, this);
        }
    }
}
