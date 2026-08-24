package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xs0  reason: default package */
/* loaded from: classes.dex */
public final class xs0 implements la2 {
    public final /* synthetic */ int a = 0;
    public final fo4 b;
    public final Object c;
    public final Object d;

    public xs0(k10 k10Var, n00 n00Var, fo4 fo4Var) {
        fo4Var.getClass();
        this.c = k10Var;
        this.d = n00Var;
        this.b = fo4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0136 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.la2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(r41 r41Var) {
        Bitmap bitmap;
        int i;
        int i2;
        vr4 vr4Var;
        InputStream openInputStream;
        ys0 ys0Var;
        int i3;
        Bitmap bitmap2;
        int i4 = this.a;
        fo4 fo4Var = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        int i5 = 1;
        switch (i4) {
            case 0:
                k10 k10Var = (k10) obj2;
                n00 n00Var = (n00) obj;
                Uri uri = n00Var.c;
                File a = k10Var.a(n00Var);
                if (a != null && a.isFile()) {
                    bitmap = BitmapFactory.decodeFile(a.getAbsolutePath());
                } else {
                    Context context = k10Var.a;
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    try {
                        InputStream openInputStream2 = context.getContentResolver().openInputStream(uri);
                        if (openInputStream2 != null) {
                            BitmapFactory.decodeStream(openInputStream2, null, options);
                            openInputStream2.close();
                        }
                        i = options.outWidth;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (i != -1 && (i2 = options.outHeight) != -1) {
                        if (i > i2) {
                            vr4Var = new vr4(256, Integer.valueOf((int) ((i2 / i) * 256.0f)));
                        } else {
                            vr4Var = new vr4(Integer.valueOf((int) ((i / i2) * 256.0f)), 256);
                        }
                        int intValue = ((Number) vr4Var.A).intValue();
                        int intValue2 = ((Number) vr4Var.B).intValue();
                        int i6 = options.outWidth;
                        int i7 = options.outHeight;
                        if (i7 > intValue2 || i6 > intValue) {
                            int i8 = i7 / 2;
                            int i9 = i6 / 2;
                            while (i8 / i5 >= intValue2 && i9 / i5 >= intValue) {
                                i5 *= 2;
                            }
                        }
                        options.inJustDecodeBounds = false;
                        options.inSampleSize = i5;
                        try {
                            openInputStream = context.getContentResolver().openInputStream(uri);
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        if (openInputStream != null) {
                            Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream, null, options);
                            openInputStream.close();
                            bitmap = decodeStream;
                            if (bitmap != null) {
                                try {
                                    File a2 = k10Var.a(n00Var);
                                    if (a2 != null) {
                                        FileOutputStream fileOutputStream = new FileOutputStream(a2);
                                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                                        fileOutputStream.close();
                                    }
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }
                    bitmap = null;
                    if (bitmap != null) {
                    }
                }
                if (bitmap == null) {
                    return null;
                }
                Resources resources = fo4Var.a.getResources();
                resources.getClass();
                return new wo1(new BitmapDrawable(resources, bitmap), false, zb1.DISK);
            default:
                if (r41Var instanceof ys0) {
                    ys0Var = (ys0) r41Var;
                    int i10 = ys0Var.Y;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        ys0Var.Y = i10 - Integer.MIN_VALUE;
                        Object obj3 = ys0Var.R;
                        x61 x61Var = x61.COROUTINE_SUSPENDED;
                        i3 = ys0Var.Y;
                        if (i3 == 0) {
                            if (i3 == 1) {
                                oi2.Y(obj3);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj3);
                            ys0Var.Y = 1;
                            xe1 xe1Var = xk1.a;
                            obj3 = hv.d0(de1.L, new m5((pq5) obj, (kx5) obj2, (r41) null, 28), ys0Var);
                            if (obj3 == x61Var) {
                                return x61Var;
                            }
                        }
                        bitmap2 = (Bitmap) obj3;
                        if (bitmap2 != null) {
                            return null;
                        }
                        Resources resources2 = fo4Var.a.getResources();
                        resources2.getClass();
                        return new wo1(new BitmapDrawable(resources2, bitmap2), false, zb1.MEMORY);
                    }
                }
                ys0Var = new ys0(this, (s41) r41Var);
                Object obj32 = ys0Var.R;
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                i3 = ys0Var.Y;
                if (i3 == 0) {
                }
                bitmap2 = (Bitmap) obj32;
                if (bitmap2 != null) {
                }
        }
    }

    public xs0(kx5 kx5Var, fo4 fo4Var, pq5 pq5Var) {
        fo4Var.getClass();
        this.c = kx5Var;
        this.b = fo4Var;
        this.d = pq5Var;
    }
}
