package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.github.junrar.unpack.vm.RarVM;
import java.io.InputStream;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vd4  reason: default package */
/* loaded from: classes.dex */
public final class vd4 implements pw5 {
    public final Context a;
    public final uh7 b;

    public vd4(Context context, uh7 uh7Var) {
        this.a = context;
        this.b = uh7Var;
    }

    @Override // defpackage.pw5
    public final lx5 a(pq5 pq5Var) {
        pq5Var.getClass();
        try {
            InputStream openInputStream = this.a.getContentResolver().openInputStream(pq5Var.d);
            if (openInputStream == null) {
                return null;
            }
            lx5 J = kn2.J(pq5Var, openInputStream);
            openInputStream.close();
            return J;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // defpackage.pw5
    public final Object b(pq5 pq5Var, dh dhVar) {
        return pq5Var.d;
    }

    @Override // defpackage.pw5
    public final Bitmap c(pq5 pq5Var) {
        pq5Var.getClass();
        try {
            InputStream openInputStream = this.a.getContentResolver().openInputStream(pq5Var.d);
            if (openInputStream == null) {
                return null;
            }
            Bitmap I = kn2.I(openInputStream);
            openInputStream.close();
            return I;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0065, code lost:
        if (r5 == null) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a A[Catch: Exception -> 0x0040, TryCatch #2 {Exception -> 0x0040, blocks: (B:3:0x0008, B:6:0x0018, B:15:0x0026, B:17:0x002e, B:19:0x0034, B:32:0x005a, B:39:0x006a, B:43:0x0076, B:46:0x007d, B:49:0x0083, B:52:0x0089, B:55:0x00d9, B:60:0x00e1, B:53:0x00b3, B:41:0x0070, B:27:0x0043, B:29:0x0049, B:5:0x0014), top: B:64:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076 A[Catch: Exception -> 0x0040, TryCatch #2 {Exception -> 0x0040, blocks: (B:3:0x0008, B:6:0x0018, B:15:0x0026, B:17:0x002e, B:19:0x0034, B:32:0x005a, B:39:0x006a, B:43:0x0076, B:46:0x007d, B:49:0x0083, B:52:0x0089, B:55:0x00d9, B:60:0x00e1, B:53:0x00b3, B:41:0x0070, B:27:0x0043, B:29:0x0049, B:5:0x0014), top: B:64:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083 A[Catch: Exception -> 0x0040, TRY_ENTER, TryCatch #2 {Exception -> 0x0040, blocks: (B:3:0x0008, B:6:0x0018, B:15:0x0026, B:17:0x002e, B:19:0x0034, B:32:0x005a, B:39:0x006a, B:43:0x0076, B:46:0x007d, B:49:0x0083, B:52:0x0089, B:55:0x00d9, B:60:0x00e1, B:53:0x00b3, B:41:0x0070, B:27:0x0043, B:29:0x0049, B:5:0x0014), top: B:64:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0089 A[Catch: Exception -> 0x0040, TryCatch #2 {Exception -> 0x0040, blocks: (B:3:0x0008, B:6:0x0018, B:15:0x0026, B:17:0x002e, B:19:0x0034, B:32:0x005a, B:39:0x006a, B:43:0x0076, B:46:0x007d, B:49:0x0083, B:52:0x0089, B:55:0x00d9, B:60:0x00e1, B:53:0x00b3, B:41:0x0070, B:27:0x0043, B:29:0x0049, B:5:0x0014), top: B:64:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b3 A[Catch: Exception -> 0x0040, TryCatch #2 {Exception -> 0x0040, blocks: (B:3:0x0008, B:6:0x0018, B:15:0x0026, B:17:0x002e, B:19:0x0034, B:32:0x005a, B:39:0x006a, B:43:0x0076, B:46:0x007d, B:49:0x0083, B:52:0x0089, B:55:0x00d9, B:60:0x00e1, B:53:0x00b3, B:41:0x0070, B:27:0x0043, B:29:0x0049, B:5:0x0014), top: B:64:0x0008 }] */
    @Override // defpackage.pw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pq5 d(Uri uri, Uri uri2) {
        uz5 uz5Var;
        String str;
        String str2;
        boolean z;
        boolean z2;
        String str3;
        jt5 jt5Var;
        String str4;
        String str5;
        try {
            InputStream openInputStream = this.a.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                uz5Var = kn2.K(openInputStream);
                openInputStream.close();
            } else {
                uz5Var = null;
            }
            zl1 a = this.b.a(uri);
            if (a != null && (str = hf.V(a)) != null) {
                if (ln2.G(str)) {
                    str = null;
                }
                if (str == null) {
                }
                if (uz5Var != null) {
                    str2 = uz5Var.a;
                    if (ln2.G(str2)) {
                        str2 = null;
                    }
                }
                str2 = str;
                if (a != null || (r0 = a.i()) == null) {
                    String concat = str.concat(".nds");
                }
                if (uz5Var == null) {
                    z = uz5Var.c;
                } else {
                    z = false;
                }
                z2 = z;
                String str6 = concat;
                if (uz5Var != null) {
                    str3 = "";
                } else {
                    str3 = uz5Var.b;
                }
                if (!z2) {
                    jt5Var = new jt5(u26.DSi, a36.DEFAULT, null, uw5.o, null, false, nx5.GLOBAL, null, null, null, null, null, null, null, null, null, null, null);
                } else {
                    jt5Var = new jt5(null, null, null, null, null, false, null, null, null, null, null, null, null, null, RarVM.VM_MEMMASK);
                }
                if (uz5Var != null && (str5 = uz5Var.d) != null) {
                    str4 = str5;
                    return new pq5(str2, str3, str6, uri, uri2, jt5Var, null, z2, str4, 0L, false, null, null, 7680);
                }
                str4 = "";
                return new pq5(str2, str3, str6, uri, uri2, jt5Var, null, z2, str4, 0L, false, null, null, 7680);
            }
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                String O0 = qs6.O0('/', lastPathSegment, lastPathSegment);
                str = qs6.R0('.', O0, O0);
            } else {
                str = "NDS Game";
            }
            if (uz5Var != null) {
            }
            str2 = str;
            if (a != null) {
            }
            String concat2 = str.concat(".nds");
            if (uz5Var == null) {
            }
            z2 = z;
            String str62 = concat2;
            if (uz5Var != null) {
            }
            if (!z2) {
            }
            if (uz5Var != null) {
                str4 = str5;
                return new pq5(str2, str3, str62, uri, uri2, jt5Var, null, z2, str4, 0L, false, null, null, 7680);
            }
            str4 = "";
            return new pq5(str2, str3, str62, uri, uri2, jt5Var, null, z2, str4, 0L, false, null, null, 7680);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
