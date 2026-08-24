package defpackage;

import android.graphics.Bitmap;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ua0  reason: default package */
/* loaded from: classes.dex */
public final class ua0 {
    public final pa a;
    public final ta0 b;
    public final Date c;
    public final String d;
    public final Date e;
    public final String f;
    public final Date g;
    public final long h;
    public final long i;
    public final String j;
    public final int k;

    public ua0(pa paVar, ta0 ta0Var) {
        int i;
        this.a = paVar;
        this.b = ta0Var;
        this.k = -1;
        if (ta0Var != null) {
            this.h = ta0Var.c;
            this.i = ta0Var.d;
            yw2 yw2Var = ta0Var.f;
            int size = yw2Var.size();
            for (int i2 = 0; i2 < size; i2++) {
                String b = yw2Var.b(i2);
                if (b.equalsIgnoreCase("Date")) {
                    String a = yw2Var.a("Date");
                    this.c = a != null ? cc1.a(a) : null;
                    this.d = yw2Var.d(i2);
                } else if (b.equalsIgnoreCase("Expires")) {
                    String a2 = yw2Var.a("Expires");
                    this.g = a2 != null ? cc1.a(a2) : null;
                } else if (b.equalsIgnoreCase("Last-Modified")) {
                    String a3 = yw2Var.a("Last-Modified");
                    this.e = a3 != null ? cc1.a(a3) : null;
                    this.f = yw2Var.d(i2);
                } else if (b.equalsIgnoreCase("ETag")) {
                    this.j = yw2Var.d(i2);
                } else if (b.equalsIgnoreCase("Age")) {
                    String d = yw2Var.d(i2);
                    Bitmap.Config[] configArr = k.a;
                    Long i0 = xs6.i0(d);
                    if (i0 != null) {
                        long longValue = i0.longValue();
                        if (longValue > 2147483647L) {
                            i = Integer.MAX_VALUE;
                        } else if (longValue < 0) {
                            i = 0;
                        } else {
                            i = (int) longValue;
                        }
                    } else {
                        i = -1;
                    }
                    this.k = i;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d1, code lost:
        if (r4 > 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final va0 a() {
        ta0 ta0Var;
        long j;
        String sb;
        long j2;
        long j3;
        Date date;
        long j4;
        int i;
        pa paVar = this.a;
        i03 i03Var = (i03) paVar.B;
        ta0 ta0Var2 = this.b;
        if (ta0Var2 == null) {
            return new va0(paVar, null);
        }
        go3 go3Var = ta0Var2.a;
        if (i03Var.f() && !ta0Var2.e) {
            return new va0(paVar, null);
        }
        ma0 ma0Var = (ma0) go3Var.getValue();
        if (!paVar.h().b && !((ma0) go3Var.getValue()).b && !nb3.k(ta0Var2.f.a("Vary"), "*")) {
            ma0 h = paVar.h();
            if (!h.a) {
                yw2 yw2Var = (yw2) paVar.R;
                String str = "If-Modified-Since";
                if (yw2Var.a("If-Modified-Since") == null && yw2Var.a("If-None-Match") == null) {
                    long j5 = this.i;
                    Date date2 = this.c;
                    if (date2 != null) {
                        ta0Var = ta0Var2;
                        j = Math.max(0L, j5 - date2.getTime());
                    } else {
                        ta0Var = ta0Var2;
                        j = 0;
                    }
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    int i2 = this.k;
                    if (i2 != -1) {
                        j = Math.max(j, timeUnit.toMillis(i2));
                    }
                    long j6 = this.h;
                    long longValue = j + (j5 - j6) + (((Number) y57.a.c()).longValue() - j5);
                    int i3 = ((ma0) go3Var.getValue()).c;
                    Date date3 = this.e;
                    if (i3 != -1) {
                        j2 = timeUnit.toMillis(i3);
                    } else {
                        Date date4 = this.g;
                        if (date4 != null) {
                            if (date2 != null) {
                                j5 = date2.getTime();
                            }
                            j2 = date4.getTime() - j5;
                        } else {
                            if (date3 != null) {
                                List list = i03Var.g;
                                if (list == null) {
                                    sb = null;
                                } else {
                                    StringBuilder sb2 = new StringBuilder();
                                    x31.o(list, sb2);
                                    sb = sb2.toString();
                                }
                                if (sb == null) {
                                    if (date2 != null) {
                                        j6 = date2.getTime();
                                    }
                                    long time = j6 - date3.getTime();
                                    if (time > 0) {
                                        j2 = time / 10;
                                    }
                                }
                            }
                            j2 = 0;
                        }
                    }
                    int i4 = h.c;
                    if (i4 != -1) {
                        j2 = Math.min(j2, timeUnit.toMillis(i4));
                    }
                    int i5 = h.i;
                    if (i5 != -1) {
                        j3 = timeUnit.toMillis(i5);
                    } else {
                        j3 = 0;
                    }
                    if (!ma0Var.g && (i = h.h) != -1) {
                        date = date3;
                        j4 = timeUnit.toMillis(i);
                    } else {
                        date = date3;
                        j4 = 0;
                    }
                    if (!ma0Var.a && longValue + j3 < j2 + j4) {
                        return new va0(null, ta0Var);
                    }
                    ta0 ta0Var3 = ta0Var;
                    String str2 = this.j;
                    if (str2 != null) {
                        str = "If-None-Match";
                    } else if (date != null) {
                        str2 = this.f;
                        str2.getClass();
                    } else if (date2 != null) {
                        str2 = this.d;
                        str2.getClass();
                    } else {
                        return new va0(paVar, null);
                    }
                    s9 o = paVar.o();
                    ((ww2) o.c).b(str, str2);
                    return new va0(new pa(o), ta0Var3);
                }
            }
            return new va0(paVar, null);
        }
        return new va0(paVar, null);
    }
}
