package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zo2  reason: default package */
/* loaded from: classes.dex */
public abstract class zo2 {
    public final int a;
    public int b = -1;
    public int c = -1;
    public int d = -1;

    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zo2(String str, String str2) {
        int i;
        int i2;
        int i3;
        try {
            i = bp2.k(35633, str);
        } catch (IllegalArgumentException | IllegalStateException e) {
            e = e;
            i = -1;
            i2 = -1;
        }
        try {
            i2 = bp2.k(35632, str2);
            try {
                i3 = GLES20.glCreateProgram();
            } catch (IllegalArgumentException | IllegalStateException e2) {
                e = e2;
                i3 = -1;
            }
            try {
                bp2.b("glCreateProgram");
                GLES20.glAttachShader(i3, i);
                bp2.b("glAttachShader");
                GLES20.glAttachShader(i3, i2);
                bp2.b("glAttachShader");
                GLES20.glLinkProgram(i3);
                int[] iArr = new int[1];
                GLES20.glGetProgramiv(i3, 35714, iArr, 0);
                if (iArr[0] == 1) {
                    this.a = i3;
                    a();
                    return;
                }
                throw new IllegalStateException("Could not link program: " + GLES20.glGetProgramInfoLog(i3));
            } catch (IllegalArgumentException e3) {
                e = e3;
                if (i != -1) {
                    GLES20.glDeleteShader(i);
                }
                if (i2 != -1) {
                    GLES20.glDeleteShader(i2);
                }
                if (i3 != -1) {
                    GLES20.glDeleteProgram(i3);
                }
                throw e;
            } catch (IllegalStateException e4) {
                e = e4;
                if (i != -1) {
                }
                if (i2 != -1) {
                }
                if (i3 != -1) {
                }
                throw e;
            }
        } catch (IllegalArgumentException | IllegalStateException e5) {
            e = e5;
            i2 = -1;
            i3 = i2;
            if (i != -1) {
            }
            if (i2 != -1) {
            }
            if (i3 != -1) {
            }
            throw e;
        }
    }

    public final void a() {
        int i = this.a;
        int glGetAttribLocation = GLES20.glGetAttribLocation(i, "aPosition");
        this.d = glGetAttribLocation;
        bp2.e(glGetAttribLocation, "aPosition");
        int glGetUniformLocation = GLES20.glGetUniformLocation(i, "uTransMatrix");
        this.b = glGetUniformLocation;
        bp2.e(glGetUniformLocation, "uTransMatrix");
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(i, "uAlphaScale");
        this.c = glGetUniformLocation2;
        bp2.e(glGetUniformLocation2, "uAlphaScale");
    }

    public void b() {
        GLES20.glUseProgram(this.a);
        bp2.b("glUseProgram");
        GLES20.glEnableVertexAttribArray(this.d);
        bp2.b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.d, 2, 5126, false, 0, (Buffer) bp2.h);
        bp2.b("glVertexAttribPointer");
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        GLES20.glUniformMatrix4fv(this.b, 1, false, fArr, 0);
        bp2.b("glUniformMatrix4fv");
        GLES20.glUniform1f(this.c, 1.0f);
        bp2.b("glUniform1f");
    }
}
