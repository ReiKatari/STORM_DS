package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Map;
import me.magnum.melonds.domain.model.Rect;
import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.layout.BackgroundMode;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c91  reason: default package */
/* loaded from: classes.dex */
public final class c91 implements fx1 {
    public float A;
    public float B;
    public int C;
    public int D;
    public final EmulatorActivity a;
    public b36 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public wd6 h;
    public wd6 i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public t26 p;
    public boolean q;
    public Rect r;
    public Rect s;
    public boolean v;
    public Rect w;
    public Rect x;
    public boolean z;
    public final Object b = new Object();
    public final Object o = new Object();
    public float t = 1.0f;
    public float u = 1.0f;
    public float y = 1.0f;

    public c91(EmulatorActivity emulatorActivity) {
        this.a = emulatorActivity;
    }

    public static final void f(ArrayList arrayList, ArrayList arrayList2, b91 b91Var) {
        if (b91Var.d) {
            arrayList.add(b91Var);
        } else {
            arrayList2.add(b91Var);
        }
    }

    public final void a() {
        VideoFiltering videoFiltering;
        float f;
        float f2;
        float f3;
        char c = '\f';
        float[] fArr = {RecyclerView.B1, 0.4974093f, RecyclerView.B1, RecyclerView.B1, 1.0f, RecyclerView.B1, RecyclerView.B1, 0.4974093f, 1.0f, RecyclerView.B1, 1.0f, 0.4974093f};
        float[] fArr2 = {RecyclerView.B1, 1.0f, RecyclerView.B1, 0.50259066f, 1.0f, 0.50259066f, RecyclerView.B1, 1.0f, 1.0f, 0.50259066f, 1.0f, 1.0f};
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (this.v) {
            Rect rect = this.r;
            if (rect != null) {
                f(arrayList2, arrayList, new b91(rect, fArr, this.t, false));
            }
            Rect rect2 = this.s;
            if (rect2 != null) {
                f(arrayList2, arrayList, new b91(rect2, fArr2, this.u, true));
            }
        } else {
            Rect rect3 = this.s;
            if (rect3 != null) {
                f(arrayList2, arrayList, new b91(rect3, fArr2, this.u, false));
            }
            Rect rect4 = this.r;
            if (rect4 != null) {
                f(arrayList2, arrayList, new b91(rect4, fArr, this.t, true));
            }
        }
        Rect rect5 = this.w;
        if (rect5 != null) {
            f(arrayList2, arrayList, new b91(rect5, fArr, this.y, this.z));
        }
        Rect rect6 = this.x;
        if (rect6 != null) {
            f(arrayList2, arrayList, new b91(rect6, fArr2, this.y, this.z));
        }
        ArrayList V0 = gt0.V0(arrayList, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        int size = V0.size();
        int i = 0;
        while (i < size) {
            Object obj = V0.get(i);
            i++;
            b91 b91Var = (b91) obj;
            Rect rect7 = b91Var.a;
            float[] fArr3 = b91Var.b;
            float f4 = b91Var.c;
            int x = rect7.getX();
            float f5 = this.A;
            float f6 = RecyclerView.B1;
            if (f5 <= RecyclerView.B1) {
                f = 0.0f;
            } else {
                f = ((x / f5) * 2.0f) - 1.0f;
            }
            int width = rect7.getWidth() + rect7.getX();
            char c2 = c;
            float f7 = this.A;
            if (f7 <= RecyclerView.B1) {
                f2 = 0.0f;
            } else {
                f2 = ((width / f7) * 2.0f) - 1.0f;
            }
            int y = rect7.getY();
            float f8 = this.B;
            if (f8 <= RecyclerView.B1) {
                f3 = 0.0f;
            } else {
                f3 = 1.0f - ((y / f8) * 2.0f);
            }
            int height = rect7.getHeight() + rect7.getY();
            float f9 = this.B;
            if (f9 > RecyclerView.B1) {
                f6 = 1.0f - ((height / f9) * 2.0f);
            }
            float f10 = fArr3[0];
            float f11 = fArr3[1];
            float f12 = fArr3[2];
            float f13 = fArr3[3];
            float f14 = fArr3[4];
            float f15 = fArr3[5];
            float f16 = fArr3[6];
            float f17 = fArr3[7];
            float f18 = fArr3[8];
            float f19 = fArr3[9];
            float f20 = fArr3[10];
            float f21 = fArr3[11];
            float[] fArr4 = new float[30];
            fArr4[0] = f;
            fArr4[1] = f6;
            fArr4[2] = f10;
            fArr4[3] = f11;
            fArr4[4] = f4;
            fArr4[5] = f;
            fArr4[6] = f3;
            fArr4[7] = f12;
            fArr4[8] = f13;
            fArr4[9] = f4;
            fArr4[10] = f2;
            fArr4[11] = f3;
            fArr4[c2] = f14;
            fArr4[13] = f15;
            fArr4[14] = f4;
            fArr4[15] = f;
            fArr4[16] = f6;
            fArr4[17] = f16;
            fArr4[18] = f17;
            fArr4[19] = f4;
            fArr4[20] = f2;
            fArr4[21] = f3;
            fArr4[22] = f18;
            fArr4[23] = f19;
            fArr4[24] = f4;
            fArr4[25] = f2;
            fArr4[26] = f6;
            fArr4[27] = f20;
            fArr4[28] = f21;
            fArr4[29] = f4;
            gt0.A0(arrayList3, new dv(fArr4, 1));
            c = c2;
        }
        float[] i1 = gt0.i1(arrayList3);
        if (i1.length == 0) {
            this.l = 0;
        } else {
            int length = i1.length * 4;
            FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder()).asFloatBuffer();
            asFloatBuffer.put(i1);
            asFloatBuffer.position(0);
            GLES30.glBindVertexArray(this.k);
            GLES20.glBindBuffer(34962, this.j);
            GLES20.glBufferData(34962, length, asFloatBuffer, 35044);
            this.l = asFloatBuffer.capacity() / 5;
        }
        wd6 wd6Var = this.h;
        if (wd6Var != null) {
            GLES20.glDeleteShader(wd6Var.a);
            GLES20.glDeleteShader(wd6Var.b);
            GLES20.glDeleteProgram(wd6Var.c);
        }
        b36 b36Var = this.c;
        if (b36Var == null || (videoFiltering = b36Var.b) == null) {
            videoFiltering = VideoFiltering.NONE;
        }
        Map map = mm7.a;
        videoFiltering.getClass();
        fe6 fe6Var = (fe6) mm7.a.get(videoFiltering);
        if (fe6Var == null) {
            fe6Var = fe6.e;
        }
        this.h = ej2.v(fe6Var);
    }

    public final void b(e25 e25Var) {
        e25Var.getClass();
        synchronized (this.b) {
            if (this.d) {
                a();
                this.d = false;
            }
        }
        float f = this.A;
        if (f > RecyclerView.B1) {
            float f2 = this.B;
            if (f2 > RecyclerView.B1) {
                GLES20.glViewport(0, 0, (int) f, (int) f2);
            }
        }
        GLES20.glClear(16640);
        if (e25Var.a) {
            synchronized (this.o) {
                d();
            }
            wd6 wd6Var = this.h;
            if (wd6Var != null) {
                GLES20.glDisable(2929);
                GLES20.glEnable(3042);
                GLES20.glBlendFunc(770, 771);
                GLES30.glBindVertexArray(this.k);
                GLES20.glBindBuffer(34962, this.j);
                GLES20.glUseProgram(wd6Var.c);
                GLES20.glEnableVertexAttribArray(wd6Var.e);
                GLES20.glEnableVertexAttribArray(wd6Var.f);
                int i = wd6Var.g;
                if (i != -1) {
                    GLES20.glEnableVertexAttribArray(i);
                }
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, e25Var.b);
                GLES20.glTexParameteri(3553, 10241, wd6Var.d);
                GLES20.glTexParameteri(3553, 10240, wd6Var.d);
                GLES20.glVertexAttribPointer(wd6Var.f, 2, 5126, false, 20, 0);
                GLES20.glVertexAttribPointer(wd6Var.e, 2, 5126, false, 20, 8);
                GLES20.glVertexAttribPointer(wd6Var.g, 1, 5126, false, 20, 16);
                GLES20.glUniform1i(wd6Var.h, 0);
                GLES20.glDrawArrays(4, 0, this.l);
                GLES30.glBindVertexArray(0);
                GLES20.glBindBuffer(34962, 0);
            }
        }
    }

    public final void c() {
        GLES20.glClearColor(RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 1.0f);
        GLES20.glClear(16640);
        GLES20.glDisable(2884);
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        this.g = i;
        GLES20.glBindTexture(3553, i);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        int[] iArr2 = new int[2];
        int[] iArr3 = new int[2];
        GLES20.glGenBuffers(2, iArr2, 0);
        GLES30.glGenVertexArrays(2, iArr3, 0);
        this.j = iArr2[0];
        this.k = iArr3[0];
        this.m = iArr2[1];
        this.n = iArr3[1];
        this.i = ej2.v(fe6.d);
        synchronized (this.b) {
            this.d = true;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:9|(4:10|11|(2:13|14)|16)|(9:22|(2:27|23)|28|29|(1:31)(1:39)|32|(1:34)|35|(1:37))|42|28|29|(0)(0)|32|(0)|35|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0082, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0086, code lost:
        r0 = new defpackage.em5(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076 A[Catch: all -> 0x0082, TRY_LEAVE, TryCatch #0 {all -> 0x0082, blocks: (B:40:0x006c, B:42:0x0076), top: B:111:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        t26 t26Var;
        Float[] fArr;
        n00 n00Var;
        Uri uri;
        int i;
        Object em5Var;
        Bitmap bitmap;
        InputStream openInputStream;
        int i2;
        int i3;
        if (this.q) {
            EmulatorActivity emulatorActivity = this.a;
            t26 t26Var2 = this.p;
            if (t26Var2 != null && (n00Var = t26Var2.a) != null && (uri = n00Var.c) != null) {
                int E = u24.E(this.A);
                int E2 = u24.E(this.B);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                try {
                    InputStream openInputStream2 = emulatorActivity.getContentResolver().openInputStream(uri);
                    if (openInputStream2 != null) {
                        BitmapFactory.decodeStream(openInputStream2, null, options);
                        openInputStream2.close();
                    }
                    i2 = options.outWidth;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (i2 != -1 && (i3 = options.outHeight) != -1 && (i3 > E2 || i2 > E)) {
                    int i4 = i3 / 2;
                    int i5 = i2 / 2;
                    i = 1;
                    while (i4 / i >= E2 && i5 / i >= E) {
                        i *= 2;
                    }
                    openInputStream = emulatorActivity.getContentResolver().openInputStream(uri);
                    if (openInputStream == null) {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inSampleSize = i;
                        em5Var = BitmapFactory.decodeStream(openInputStream, null, options2);
                    } else {
                        em5Var = null;
                    }
                    if (em5Var instanceof em5) {
                        em5Var = null;
                    }
                    bitmap = (Bitmap) em5Var;
                    if (bitmap != null) {
                        GLES20.glBindTexture(3553, this.g);
                        GLUtils.texImage2D(3553, 0, bitmap, 0);
                        bitmap.recycle();
                        this.C = bitmap.getWidth();
                        this.D = bitmap.getHeight();
                        this.f = true;
                        this.e = true;
                    }
                }
                i = 1;
                openInputStream = emulatorActivity.getContentResolver().openInputStream(uri);
                if (openInputStream == null) {
                }
                if (em5Var instanceof em5) {
                }
                bitmap = (Bitmap) em5Var;
                if (bitmap != null) {
                }
            }
            this.q = false;
        }
        if (!this.f) {
            return;
        }
        if (this.e && (t26Var = this.p) != null) {
            BackgroundMode backgroundMode = t26Var.b;
            int i6 = this.C;
            int i7 = this.D;
            Float valueOf = Float.valueOf(1.0f);
            Float valueOf2 = Float.valueOf(-1.0f);
            float f = i6;
            float f2 = i7;
            float f3 = f / f2;
            float f4 = this.A / this.B;
            switch (a91.a[backgroundMode.ordinal()]) {
                case 1:
                    fArr = new Float[]{valueOf2, valueOf2, valueOf2, valueOf, valueOf, valueOf, valueOf2, valueOf2, valueOf, valueOf, valueOf, valueOf2};
                    break;
                case 2:
                    if (f4 > f3) {
                        float f5 = ((this.B / (f2 * (this.A / f))) * 2.0f) / 2.0f;
                        float f6 = -f5;
                        fArr = new Float[]{Float.valueOf(f6), valueOf2, Float.valueOf(f6), valueOf, Float.valueOf(f5), valueOf, Float.valueOf(f6), valueOf2, Float.valueOf(f5), valueOf, Float.valueOf(f5), valueOf2};
                        break;
                    } else {
                        float f7 = ((this.A / (f * (this.B / f2))) * 2.0f) / 2.0f;
                        float f8 = -f7;
                        fArr = new Float[]{valueOf2, Float.valueOf(f8), valueOf2, Float.valueOf(f7), valueOf, Float.valueOf(f7), valueOf2, Float.valueOf(f8), valueOf, Float.valueOf(f7), valueOf, Float.valueOf(f8)};
                        break;
                    }
                case 3:
                    if (f4 > f3) {
                        float f9 = (-1.0f) + ((this.B / (f2 * (this.A / f))) * 2.0f);
                        fArr = new Float[]{valueOf2, valueOf2, valueOf2, valueOf, Float.valueOf(f9), valueOf, valueOf2, valueOf2, Float.valueOf(f9), valueOf, Float.valueOf(f9), valueOf2};
                        break;
                    } else {
                        float f10 = ((this.A / (f * (this.B / f2))) * 2.0f) / 2.0f;
                        float f11 = -f10;
                        fArr = new Float[]{valueOf2, Float.valueOf(f11), valueOf2, Float.valueOf(f10), valueOf, Float.valueOf(f10), valueOf2, Float.valueOf(f11), valueOf, Float.valueOf(f10), valueOf, Float.valueOf(f11)};
                        break;
                    }
                case 4:
                    if (f4 > f3) {
                        float f12 = 1.0f - ((this.B / (f2 * (this.A / f))) * 2.0f);
                        fArr = new Float[]{Float.valueOf(f12), valueOf2, Float.valueOf(f12), valueOf, valueOf, valueOf, Float.valueOf(f12), valueOf2, valueOf, valueOf, valueOf, valueOf2};
                        break;
                    } else {
                        float f13 = ((this.A / (f * (this.B / f2))) * 2.0f) / 2.0f;
                        float f14 = -f13;
                        fArr = new Float[]{valueOf2, Float.valueOf(f14), valueOf2, Float.valueOf(f13), valueOf, Float.valueOf(f13), valueOf2, Float.valueOf(f14), valueOf, Float.valueOf(f13), valueOf, Float.valueOf(f14)};
                        break;
                    }
                case 5:
                    if (f4 > f3) {
                        float f15 = ((this.B / (f2 * (this.A / f))) * 2.0f) / 2.0f;
                        float f16 = -f15;
                        fArr = new Float[]{Float.valueOf(f16), valueOf2, Float.valueOf(f16), valueOf, Float.valueOf(f15), valueOf, Float.valueOf(f16), valueOf2, Float.valueOf(f15), valueOf, Float.valueOf(f15), valueOf2};
                        break;
                    } else {
                        float f17 = 1.0f - ((this.A / (f * (this.B / f2))) * 2.0f);
                        fArr = new Float[]{valueOf2, Float.valueOf(f17), valueOf2, valueOf, valueOf, valueOf, valueOf2, Float.valueOf(f17), valueOf, valueOf, valueOf, Float.valueOf(f17)};
                        break;
                    }
                case 6:
                    if (f4 > f3) {
                        float f18 = ((this.B / (f2 * (this.A / f))) * 2.0f) / 2.0f;
                        float f19 = -f18;
                        fArr = new Float[]{Float.valueOf(f19), valueOf2, Float.valueOf(f19), valueOf, Float.valueOf(f18), valueOf, Float.valueOf(f19), valueOf2, Float.valueOf(f18), valueOf, Float.valueOf(f18), valueOf2};
                        break;
                    } else {
                        float f20 = ((this.A / (f * (this.B / f2))) * 2.0f) - 1.0f;
                        fArr = new Float[]{valueOf2, valueOf2, valueOf2, Float.valueOf(f20), valueOf, Float.valueOf(f20), valueOf2, valueOf2, valueOf, Float.valueOf(f20), valueOf, valueOf2};
                        break;
                    }
                default:
                    i.d();
                    return;
            }
            Buffer position = ByteBuffer.allocateDirect(96).order(ByteOrder.nativeOrder()).asFloatBuffer().put(new float[]{fArr[0].floatValue(), fArr[1].floatValue(), RecyclerView.B1, 1.0f, fArr[2].floatValue(), fArr[3].floatValue(), RecyclerView.B1, RecyclerView.B1, fArr[4].floatValue(), fArr[5].floatValue(), 1.0f, RecyclerView.B1, fArr[6].floatValue(), fArr[7].floatValue(), RecyclerView.B1, 1.0f, fArr[8].floatValue(), fArr[9].floatValue(), 1.0f, RecyclerView.B1, fArr[10].floatValue(), fArr[11].floatValue(), 1.0f, 1.0f}).position(0);
            GLES30.glBindVertexArray(this.n);
            GLES20.glBindBuffer(34962, this.m);
            GLES20.glBufferData(34962, 96, position, 35044);
            this.e = false;
        }
        GLES30.glBindVertexArray(this.n);
        GLES20.glBindBuffer(34962, this.m);
        wd6 wd6Var = this.i;
        if (wd6Var != null) {
            GLES20.glUseProgram(wd6Var.c);
            GLES20.glEnableVertexAttribArray(wd6Var.e);
            GLES20.glEnableVertexAttribArray(wd6Var.f);
            int i8 = wd6Var.g;
            if (i8 != -1) {
                GLES20.glEnableVertexAttribArray(i8);
            }
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.g);
            wd6 wd6Var2 = this.i;
            if (wd6Var2 != null) {
                GLES20.glVertexAttribPointer(wd6Var2.f, 2, 5126, false, 16, 0);
                wd6 wd6Var3 = this.i;
                if (wd6Var3 != null) {
                    GLES20.glVertexAttribPointer(wd6Var3.e, 2, 5126, false, 16, 8);
                    wd6 wd6Var4 = this.i;
                    if (wd6Var4 != null) {
                        GLES20.glUniform1i(wd6Var4.h, 0);
                        GLES20.glDrawArrays(4, 0, 6);
                        return;
                    }
                    nb3.a0("backgroundShader");
                    throw null;
                }
                nb3.a0("backgroundShader");
                throw null;
            }
            nb3.a0("backgroundShader");
            throw null;
        }
        nb3.a0("backgroundShader");
        throw null;
    }

    public final void e(Rect rect, Rect rect2, float f, float f2, boolean z, Rect rect3, Rect rect4, float f3, boolean z2) {
        synchronized (this.b) {
            this.r = rect;
            this.s = rect2;
            this.t = f;
            this.u = f2;
            this.v = z;
            this.w = rect3;
            this.x = rect4;
            this.y = f3;
            this.z = z2;
            this.d = true;
        }
    }
}
