package defpackage;

import java.lang.reflect.Method;
import java.util.Objects;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ls4  reason: default package */
/* loaded from: classes.dex */
public final class ls4 extends uj2 {
    public final Method h;
    public final int i;
    public final String j;
    public final d90 k;
    public final boolean l;

    public ls4(Method method, int i, String str, boolean z) {
        d90 d90Var = d90.B;
        this.h = method;
        this.i = i;
        Objects.requireNonNull(str, "name == null");
        this.j = str;
        this.k = d90Var;
        this.l = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f4  */
    /* JADX WARN: Type inference failed for: r0v9, types: [k80, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [k80] */
    /* JADX WARN: Type inference failed for: r2v9, types: [k80] */
    @Override // defpackage.uj2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(ok5 ok5Var, Object obj) {
        String str;
        String replace;
        String str2 = this.j;
        if (obj != null) {
            this.k.getClass();
            String obj2 = obj.toString();
            if (ok5Var.c != null) {
                int length = obj2.length();
                int i = 0;
                while (i < length) {
                    int codePointAt = obj2.codePointAt(i);
                    boolean z = this.l;
                    int i2 = 47;
                    int i3 = -1;
                    int i4 = 127;
                    int i5 = 32;
                    if (codePointAt >= 32 && codePointAt < 127 && " \"<>^`{}|\\?#".indexOf(codePointAt) == -1 && (z || (codePointAt != 47 && codePointAt != 37))) {
                        i += Character.charCount(codePointAt);
                    } else {
                        ?? obj3 = new Object();
                        obj3.s0(0, i, obj2);
                        ?? r2 = 0;
                        while (i < length) {
                            int codePointAt2 = obj2.codePointAt(i);
                            if (!z || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                                if (codePointAt2 >= i5 && codePointAt2 < i4 && " \"<>^`{}|\\?#".indexOf(codePointAt2) == i3 && (z || (codePointAt2 != i2 && codePointAt2 != 37))) {
                                    obj3.u0(codePointAt2);
                                } else {
                                    if (r2 == 0) {
                                        r2 = new Object();
                                    }
                                    r2.u0(codePointAt2);
                                    long j = r2.B;
                                    long j2 = 0;
                                    r2 = r2;
                                    while (j2 < j) {
                                        byte v = r2.v(j2);
                                        obj3.n0(37);
                                        char[] cArr = ok5.l;
                                        obj3.n0(cArr[((v & 255) >> 4) & 15]);
                                        obj3.n0(cArr[v & 15]);
                                        j2++;
                                        r2 = r2;
                                    }
                                    r2.e();
                                }
                            }
                            i += Character.charCount(codePointAt2);
                            i2 = 47;
                            i3 = -1;
                            i4 = 127;
                            i5 = 32;
                            r2 = r2;
                        }
                        str = obj3.c0();
                        replace = ok5Var.c.replace("{" + str2 + "}", str);
                        if (ok5.m.matcher(replace).matches()) {
                            ok5Var.c = replace;
                            return;
                        } else {
                            i.h("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(obj2));
                            return;
                        }
                    }
                }
                str = obj2;
                replace = ok5Var.c.replace("{" + str2 + "}", str);
                if (ok5.m.matcher(replace).matches()) {
                }
            } else {
                throw new AssertionError();
            }
        } else {
            throw ak7.v0(this.h, this.i, lb1.A("Path parameter \"", str2, "\" value must not be null."), new Object[0]);
        }
    }
}
