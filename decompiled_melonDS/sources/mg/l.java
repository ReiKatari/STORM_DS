package mg;

import java.util.regex.Pattern;
import l4.b0;
import l4.c0;
import l4.i0;
import n2.f1;
import n2.s;
import p1.a0;
import q4.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: g  reason: collision with root package name */
    public static final a0 f9652g = y2.k.b(new b0(26, (byte) 0), new c0(17));

    /* renamed from: a  reason: collision with root package name */
    public final boolean f9653a;

    /* renamed from: b  reason: collision with root package name */
    public final f1 f9654b;

    /* renamed from: c  reason: collision with root package name */
    public final f1 f9655c;

    /* renamed from: d  reason: collision with root package name */
    public final f1 f9656d;

    /* renamed from: e  reason: collision with root package name */
    public final f1 f9657e;

    /* renamed from: f  reason: collision with root package name */
    public final f1 f9658f;

    public l(String str, String str2, String str3, boolean z10) {
        str.getClass();
        str3.getClass();
        this.f9653a = z10;
        int length = str.length();
        this.f9654b = s.w(new x(str, 4, i0.b(length, length)));
        int length2 = str2.length();
        this.f9655c = s.w(new x(str2, 4, i0.b(length2, length2)));
        int length3 = str3.length();
        this.f9656d = s.w(n.e(new x(str3, 4, i0.b(length3, length3))));
        this.f9657e = s.w(null);
        this.f9658f = s.w(null);
    }

    public final kg.e a() {
        String obj = vc.h.C0(((x) this.f9654b.getValue()).f12276a.B).toString();
        String obj2 = vc.h.C0(((x) this.f9655c.getValue()).f12276a.B).toString();
        String obj3 = vc.h.C0(((x) this.f9656d.getValue()).f12276a.B).toString();
        obj3.getClass();
        String replace = obj3.replace('\n', ' ');
        replace.getClass();
        return new kg.e(obj, obj2, replace);
    }

    public final boolean b() {
        f1 f1Var = this.f9656d;
        boolean j02 = vc.h.j0(((x) f1Var.getValue()).f12276a.B);
        f1 f1Var2 = this.f9658f;
        if (j02) {
            f1Var2.setValue(k.CANNOT_BE_EMPTY);
            return false;
        }
        String obj = vc.h.C0(((x) f1Var.getValue()).f12276a.B).toString();
        Pattern compile = Pattern.compile("[ \n]");
        compile.getClass();
        obj.getClass();
        String replaceAll = compile.matcher(obj).replaceAll("");
        replaceAll.getClass();
        if (replaceAll.length() % 16 == 0) {
            f1Var2.setValue(null);
            return true;
        }
        f1Var2.setValue(k.INVALID_FORMAT);
        return false;
    }

    public l(boolean z10) {
        this("", "", "", z10);
    }
}
