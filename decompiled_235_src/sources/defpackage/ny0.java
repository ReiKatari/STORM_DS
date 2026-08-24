package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.github.junrar.unpack.vm.RarVM;
import java.io.InputStream;
import java.util.List;
import java.util.Locale;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ny0  reason: default package */
/* loaded from: classes.dex */
public abstract class ny0 implements pw5 {
    public static final List d = hf.c0("nds", "dsi", "ids");
    public final Context a;
    public final uh7 b;
    public final ud4 c;

    public ny0(Context context, uh7 uh7Var, ud4 ud4Var) {
        this.a = context;
        this.b = uh7Var;
        this.c = ud4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Comparable h(ny0 ny0Var, pq5 pq5Var, s41 s41Var) {
        my0 my0Var;
        int i;
        try {
            if (s41Var instanceof my0) {
                my0Var = (my0) s41Var;
                int i2 = my0Var.Y;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    my0Var.Y = i2 - Integer.MIN_VALUE;
                    Object obj = my0Var.R;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = my0Var.Y;
                    if (i == 0) {
                        if (i == 1) {
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        Uri d2 = ny0Var.c.d(pq5Var, true);
                        if (d2 != null) {
                            return d2;
                        }
                        my0Var.Y = 1;
                        obj = ny0Var.e(pq5Var, my0Var);
                        if (obj == x61Var) {
                            return x61Var;
                        }
                    }
                    return (Uri) obj;
                }
            }
            if (i == 0) {
            }
            return (Uri) obj;
        } catch (ly0 unused) {
            return null;
        }
        my0Var = new my0(ny0Var, s41Var);
        Object obj2 = my0Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = my0Var.Y;
    }

    public static boolean i(String str) {
        String lowerCase = qs6.O0('.', str, str).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return d.contains(lowerCase);
    }

    @Override // defpackage.pw5
    public final lx5 a(pq5 pq5Var) {
        pq5Var.getClass();
        try {
            InputStream f = f(pq5Var);
            if (f == null) {
                return null;
            }
            lx5 J = kn2.J(pq5Var, f);
            f.close();
            return J;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // defpackage.pw5
    public final Object b(pq5 pq5Var, dh dhVar) {
        return h(this, pq5Var, dhVar);
    }

    @Override // defpackage.pw5
    public final Bitmap c(pq5 pq5Var) {
        pq5Var.getClass();
        try {
            InputStream f = f(pq5Var);
            if (f == null) {
                return null;
            }
            Bitmap I = kn2.I(f);
            f.close();
            return I;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0084, code lost:
        if (r1 == null) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050 A[Catch: all -> 0x005e, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0020, blocks: (B:3:0x0006, B:5:0x000e, B:7:0x0014, B:20:0x003a, B:25:0x0044, B:41:0x006b, B:49:0x0079, B:56:0x0089, B:59:0x008f, B:62:0x0095, B:65:0x009b, B:68:0x00eb, B:73:0x00f3, B:66:0x00c5, B:15:0x0023, B:17:0x0029, B:27:0x0050, B:30:0x005a, B:38:0x0065, B:39:0x0068), top: B:81:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0079 A[Catch: Exception -> 0x0020, TryCatch #4 {Exception -> 0x0020, blocks: (B:3:0x0006, B:5:0x000e, B:7:0x0014, B:20:0x003a, B:25:0x0044, B:41:0x006b, B:49:0x0079, B:56:0x0089, B:59:0x008f, B:62:0x0095, B:65:0x009b, B:68:0x00eb, B:73:0x00f3, B:66:0x00c5, B:15:0x0023, B:17:0x0029, B:27:0x0050, B:30:0x005a, B:38:0x0065, B:39:0x0068), top: B:81:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0089 A[Catch: Exception -> 0x0020, TryCatch #4 {Exception -> 0x0020, blocks: (B:3:0x0006, B:5:0x000e, B:7:0x0014, B:20:0x003a, B:25:0x0044, B:41:0x006b, B:49:0x0079, B:56:0x0089, B:59:0x008f, B:62:0x0095, B:65:0x009b, B:68:0x00eb, B:73:0x00f3, B:66:0x00c5, B:15:0x0023, B:17:0x0029, B:27:0x0050, B:30:0x005a, B:38:0x0065, B:39:0x0068), top: B:81:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0095 A[Catch: Exception -> 0x0020, TRY_ENTER, TryCatch #4 {Exception -> 0x0020, blocks: (B:3:0x0006, B:5:0x000e, B:7:0x0014, B:20:0x003a, B:25:0x0044, B:41:0x006b, B:49:0x0079, B:56:0x0089, B:59:0x008f, B:62:0x0095, B:65:0x009b, B:68:0x00eb, B:73:0x00f3, B:66:0x00c5, B:15:0x0023, B:17:0x0029, B:27:0x0050, B:30:0x005a, B:38:0x0065, B:39:0x0068), top: B:81:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x009b A[Catch: Exception -> 0x0020, TryCatch #4 {Exception -> 0x0020, blocks: (B:3:0x0006, B:5:0x000e, B:7:0x0014, B:20:0x003a, B:25:0x0044, B:41:0x006b, B:49:0x0079, B:56:0x0089, B:59:0x008f, B:62:0x0095, B:65:0x009b, B:68:0x00eb, B:73:0x00f3, B:66:0x00c5, B:15:0x0023, B:17:0x0029, B:27:0x0050, B:30:0x005a, B:38:0x0065, B:39:0x0068), top: B:81:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c5 A[Catch: Exception -> 0x0020, TryCatch #4 {Exception -> 0x0020, blocks: (B:3:0x0006, B:5:0x000e, B:7:0x0014, B:20:0x003a, B:25:0x0044, B:41:0x006b, B:49:0x0079, B:56:0x0089, B:59:0x008f, B:62:0x0095, B:65:0x009b, B:68:0x00eb, B:73:0x00f3, B:66:0x00c5, B:15:0x0023, B:17:0x0029, B:27:0x0050, B:30:0x005a, B:38:0x0065, B:39:0x0068), top: B:81:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00eb A[Catch: Exception -> 0x0020, TryCatch #4 {Exception -> 0x0020, blocks: (B:3:0x0006, B:5:0x000e, B:7:0x0014, B:20:0x003a, B:25:0x0044, B:41:0x006b, B:49:0x0079, B:56:0x0089, B:59:0x008f, B:62:0x0095, B:65:0x009b, B:68:0x00eb, B:73:0x00f3, B:66:0x00c5, B:15:0x0023, B:17:0x0029, B:27:0x0050, B:30:0x005a, B:38:0x0065, B:39:0x0068), top: B:81:0x0006 }] */
    @Override // defpackage.pw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pq5 d(Uri uri, Uri uri2) {
        String str;
        String str2;
        InputStream openInputStream;
        uz5 uz5Var;
        String str3;
        boolean z;
        boolean z2;
        String str4;
        jt5 jt5Var;
        String str5;
        String str6;
        String i;
        try {
            zl1 a = this.b.a(uri);
            if (a != null && (str = hf.V(a)) != null) {
                if (ln2.G(str)) {
                    str = null;
                }
                if (str == null) {
                }
                if (a != null && (i = a.i()) != null) {
                    str2 = i;
                    openInputStream = this.a.getContentResolver().openInputStream(uri);
                    if (openInputStream == null) {
                        ss0 g = g(openInputStream);
                        if (g != null) {
                            try {
                                uz5Var = kn2.K(g);
                                g.close();
                            } finally {
                            }
                        } else {
                            uz5Var = null;
                        }
                        openInputStream.close();
                    } else {
                        uz5Var = null;
                    }
                    if (uz5Var != null) {
                        str3 = uz5Var.a;
                        if (ln2.G(str3)) {
                            str3 = null;
                        }
                    }
                    str3 = str;
                    if (uz5Var == null) {
                        z = uz5Var.c;
                    } else {
                        z = false;
                    }
                    z2 = z;
                    if (uz5Var != null) {
                        str4 = "";
                    } else {
                        str4 = uz5Var.b;
                    }
                    if (!z2) {
                        jt5Var = new jt5(u26.DSi, a36.DEFAULT, null, uw5.o, null, false, nx5.GLOBAL, null, null, null, null, null, null, null, null, null, null, null);
                    } else {
                        jt5Var = new jt5(null, null, null, null, null, false, null, null, null, null, null, null, null, null, RarVM.VM_MEMMASK);
                    }
                    if (uz5Var != null && (str6 = uz5Var.d) != null) {
                        str5 = str6;
                        return new pq5(str3, str4, str2, uri, uri2, jt5Var, null, z2, str5, 0L, false, null, null, 7680);
                    }
                    str5 = "";
                    return new pq5(str3, str4, str2, uri, uri2, jt5Var, null, z2, str5, 0L, false, null, null, 7680);
                }
                str2 = str;
                openInputStream = this.a.getContentResolver().openInputStream(uri);
                if (openInputStream == null) {
                }
                if (uz5Var != null) {
                }
                str3 = str;
                if (uz5Var == null) {
                }
                z2 = z;
                if (uz5Var != null) {
                }
                if (!z2) {
                }
                if (uz5Var != null) {
                    str5 = str6;
                    return new pq5(str3, str4, str2, uri, uri2, jt5Var, null, z2, str5, 0L, false, null, null, 7680);
                }
                str5 = "";
                return new pq5(str3, str4, str2, uri, uri2, jt5Var, null, z2, str5, 0L, false, null, null, 7680);
            }
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                String O0 = qs6.O0('/', lastPathSegment, lastPathSegment);
                str = qs6.R0('.', O0, O0);
            } else {
                str = "Compressed Game";
            }
            if (a != null) {
                str2 = i;
                openInputStream = this.a.getContentResolver().openInputStream(uri);
                if (openInputStream == null) {
                }
                if (uz5Var != null) {
                }
                str3 = str;
                if (uz5Var == null) {
                }
                z2 = z;
                if (uz5Var != null) {
                }
                if (!z2) {
                }
                if (uz5Var != null) {
                }
                str5 = "";
                return new pq5(str3, str4, str2, uri, uri2, jt5Var, null, z2, str5, 0L, false, null, null, 7680);
            }
            str2 = str;
            openInputStream = this.a.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
            }
            if (uz5Var != null) {
            }
            str3 = str;
            if (uz5Var == null) {
            }
            z2 = z;
            if (uz5Var != null) {
            }
            if (!z2) {
            }
            if (uz5Var != null) {
            }
            str5 = "";
            return new pq5(str3, str4, str2, uri, uri2, jt5Var, null, z2, str5, 0L, false, null, null, 7680);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final Object e(pq5 pq5Var, my0 my0Var) {
        ud4 ud4Var = this.c;
        r41 V = np2.V(my0Var);
        n36 n36Var = new n36(V, x61.UNDECIDED);
        InputStream openInputStream = this.a.getContentResolver().openInputStream(pq5Var.d);
        if (openInputStream != null) {
            try {
                ss0 g = g(openInputStream);
                if (g != null) {
                    ud4Var.a(pq5Var, new u63(24, g, n36Var));
                    if (yh2.z(V.b())) {
                        Uri d2 = ud4Var.d(pq5Var, false);
                        if (d2 == null) {
                            n36Var.i(new em5(new Exception("Failed to find extracted NDS ROM file")));
                        } else {
                            n36Var.i(d2);
                        }
                    }
                    g.close();
                } else {
                    n36Var.i(new em5(new Exception("Failed to find an NDS ROM to extract")));
                }
                openInputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ge7.t(openInputStream, th);
                    throw th2;
                }
            }
        } else {
            n36Var.i(new em5(new Exception("Failed to open compressed file for extraction")));
        }
        return n36Var.a();
    }

    public final InputStream f(pq5 pq5Var) {
        Uri d2 = this.c.d(pq5Var, false);
        Context context = this.a;
        if (d2 != null) {
            return context.getContentResolver().openInputStream(d2);
        }
        InputStream openInputStream = context.getContentResolver().openInputStream(pq5Var.d);
        if (openInputStream != null) {
            return g(openInputStream);
        }
        return null;
    }

    public abstract ss0 g(InputStream inputStream);
}
