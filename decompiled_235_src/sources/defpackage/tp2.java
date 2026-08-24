package defpackage;

import android.graphics.Bitmap;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.text.Text;
import com.google.mlkit.vision.text.TextRecognizer;
import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tp2  reason: default package */
/* loaded from: classes.dex */
public final class tp2 extends s41 {
    public Bitmap R;
    public InputImage X;
    public Text Y;
    public Iterator Z;
    public TextRecognizer d0;
    public /* synthetic */ Object e0;
    public final /* synthetic */ wp2 f0;
    public int g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp2(wp2 wp2Var, s41 s41Var) {
        super(s41Var);
        this.f0 = wp2Var;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.e0 = obj;
        this.g0 |= Integer.MIN_VALUE;
        return this.f0.d(null, null, this);
    }
}
