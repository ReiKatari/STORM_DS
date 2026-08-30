package q;

import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class z {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f12064d = {16843067, 16843068};

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12065a = 2;

    /* renamed from: b  reason: collision with root package name */
    public View f12066b;

    /* renamed from: c  reason: collision with root package name */
    public Object f12067c;

    public z(EditText editText) {
        this.f12066b = editText;
        this.f12067c = new l.i0(editText);
    }

    public KeyListener a(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            ((jb.c) ((l.i0) this.f12067c).B).getClass();
            if (keyListener instanceof o6.e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            if (keyListener instanceof NumberKeyListener) {
                return keyListener;
            }
            return new o6.e(keyListener);
        }
        return keyListener;
    }

    public void b(AttributeSet attributeSet, int i2) {
        switch (this.f12065a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f12066b;
                p1.c1 o5 = p1.c1.o(absSeekBar.getContext(), attributeSet, f12064d, i2);
                Drawable i10 = o5.i(0);
                if (i10 != null) {
                    if (i10 instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) i10;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i11 = 0; i11 < numberOfFrames; i11++) {
                            Drawable e6 = e(animationDrawable.getFrame(i11), true);
                            e6.setLevel(10000);
                            animationDrawable2.addFrame(e6, animationDrawable.getDuration(i11));
                        }
                        animationDrawable2.setLevel(10000);
                        i10 = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(i10);
                }
                Drawable i12 = o5.i(1);
                if (i12 != null) {
                    absSeekBar.setProgressDrawable(e(i12, false));
                }
                o5.p();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.f12066b).getContext().obtainStyledAttributes(attributeSet, k.a.f7919i, i2, 0);
                try {
                    boolean z10 = true;
                    if (obtainStyledAttributes.hasValue(14)) {
                        z10 = obtainStyledAttributes.getBoolean(14, true);
                    }
                    obtainStyledAttributes.recycle();
                    d(z10);
                    return;
                } catch (Throwable th2) {
                    obtainStyledAttributes.recycle();
                    throw th2;
                }
        }
    }

    public o6.b c(InputConnection inputConnection, EditorInfo editorInfo) {
        l.i0 i0Var = (l.i0) this.f12067c;
        if (inputConnection == null) {
            i0Var.getClass();
            inputConnection = null;
        } else {
            jb.c cVar = (jb.c) i0Var.B;
            cVar.getClass();
            if (!(inputConnection instanceof o6.b)) {
                inputConnection = new o6.b(editorInfo, inputConnection, (EditText) cVar.B);
            }
        }
        return (o6.b) inputConnection;
    }

    public void d(boolean z10) {
        o6.i iVar = (o6.i) ((jb.c) ((l.i0) this.f12067c).B).L;
        if (iVar.L != z10) {
            if (iVar.B != null) {
                m6.i a10 = m6.i.a();
                o6.h hVar = iVar.B;
                a10.getClass();
                p7.m.l(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a10.f9276a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a10.f9277b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.L = z10;
            if (z10) {
                o6.i.a(iVar.A, m6.i.a().c());
            }
        }
    }

    public Drawable e(Drawable drawable, boolean z10) {
        boolean z11;
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                int id2 = layerDrawable.getId(i2);
                Drawable drawable2 = layerDrawable.getDrawable(i2);
                if (id2 != 16908301 && id2 != 16908303) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                drawableArr[i2] = e(drawable2, z11);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                layerDrawable2.setId(i10, layerDrawable.getId(i10));
                layerDrawable2.setLayerGravity(i10, layerDrawable.getLayerGravity(i10));
                layerDrawable2.setLayerWidth(i10, layerDrawable.getLayerWidth(i10));
                layerDrawable2.setLayerHeight(i10, layerDrawable.getLayerHeight(i10));
                layerDrawable2.setLayerInsetLeft(i10, layerDrawable.getLayerInsetLeft(i10));
                layerDrawable2.setLayerInsetRight(i10, layerDrawable.getLayerInsetRight(i10));
                layerDrawable2.setLayerInsetTop(i10, layerDrawable.getLayerInsetTop(i10));
                layerDrawable2.setLayerInsetBottom(i10, layerDrawable.getLayerInsetBottom(i10));
                layerDrawable2.setLayerInsetStart(i10, layerDrawable.getLayerInsetStart(i10));
                layerDrawable2.setLayerInsetEnd(i10, layerDrawable.getLayerInsetEnd(i10));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.f12067c) == null) {
                this.f12067c = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            if (z10) {
                return new ClipDrawable(shapeDrawable, 3, 1);
            }
            return shapeDrawable;
        } else {
            return drawable;
        }
    }

    public z(AbsSeekBar absSeekBar) {
        this.f12066b = absSeekBar;
    }

    public /* synthetic */ z() {
    }
}
