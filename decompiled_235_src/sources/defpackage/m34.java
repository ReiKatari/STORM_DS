package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m34  reason: default package */
/* loaded from: classes.dex */
public final class m34 extends a41 {
    public static final String[] d = {"orientation"};
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m34(Context context, int i) {
        super(context, 0);
        this.c = i;
    }

    @Override // defpackage.a41, defpackage.xk5
    public final boolean a(m44 m44Var) {
        switch (this.c) {
            case 0:
                Uri uri = (Uri) m44Var.B;
                if ("content".equals(uri.getScheme()) && "media".equals(uri.getAuthority())) {
                    return true;
                }
                return false;
            default:
                return "file".equals(((Uri) m44Var.B).getScheme());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
        if (r4 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
        if (r4 == null) goto L17;
     */
    @Override // defpackage.a41, defpackage.xk5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final aj c(m44 m44Var, int i) {
        Throwable th;
        Cursor cursor;
        int i2;
        int i3 = this.c;
        Cursor cursor2 = null;
        Context context = this.b;
        switch (i3) {
            case 0:
                ContentResolver contentResolver = context.getContentResolver();
                Uri uri = (Uri) m44Var.B;
                int i4 = 0;
                try {
                    cursor = contentResolver.query(uri, d, null, null, null);
                } catch (RuntimeException unused) {
                    cursor = null;
                    break;
                } catch (Throwable th2) {
                    th = th2;
                }
                if (cursor != null) {
                    try {
                    } catch (RuntimeException unused2) {
                        break;
                    } catch (Throwable th3) {
                        th = th3;
                        cursor2 = cursor;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        throw th;
                    }
                    if (!cursor.moveToFirst()) {
                        break;
                    } else {
                        i4 = cursor.getInt(0);
                        cursor.close();
                        String type = contentResolver.getType(uri);
                        if (type != null) {
                            type.startsWith("video/");
                        }
                        return new aj((Bitmap) null, hi2.P(context.getContentResolver().openInputStream((Uri) m44Var.B)), qw4.DISK, i4);
                    }
                }
                break;
            default:
                a83 P = hi2.P(context.getContentResolver().openInputStream((Uri) m44Var.B));
                qw4 qw4Var = qw4.DISK;
                s72 s72Var = new s72(((Uri) m44Var.B).getPath());
                l72 d2 = s72Var.d("Orientation");
                if (d2 != null) {
                    try {
                        i2 = d2.e(s72Var.d);
                    } catch (NumberFormatException unused3) {
                        i2 = 1;
                    }
                    return new aj((Bitmap) null, P, qw4Var, i2);
                }
                i2 = 1;
                return new aj((Bitmap) null, P, qw4Var, i2);
        }
    }
}
