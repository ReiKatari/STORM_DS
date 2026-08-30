package o6;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends aj.g {

    /* renamed from: l  reason: collision with root package name */
    public final TextView f10856l;
    public final d m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f10857n = true;

    public f(TextView textView) {
        this.f10856l = textView;
        this.m = new d(textView);
    }

    @Override // aj.g
    public final TransformationMethod B0(TransformationMethod transformationMethod) {
        if (this.f10857n) {
            if (transformationMethod instanceof j) {
                return transformationMethod;
            }
            if (transformationMethod instanceof PasswordTransformationMethod) {
                return transformationMethod;
            }
            return new j(transformationMethod);
        } else if (transformationMethod instanceof j) {
            return ((j) transformationMethod).A;
        } else {
            return transformationMethod;
        }
    }

    @Override // aj.g
    public final InputFilter[] C(InputFilter[] inputFilterArr) {
        if (!this.f10857n) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i2 = 0; i2 < inputFilterArr.length; i2++) {
                InputFilter inputFilter = inputFilterArr[i2];
                if (inputFilter instanceof d) {
                    sparseArray.put(i2, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (sparseArray.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i12 = 0;
        while (true) {
            d dVar = this.m;
            if (i12 < length2) {
                if (inputFilterArr[i12] == dVar) {
                    return inputFilterArr;
                }
                i12++;
            } else {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
        }
    }

    @Override // aj.g
    public final boolean M() {
        return this.f10857n;
    }

    @Override // aj.g
    public final void c0(boolean z10) {
        if (z10) {
            TextView textView = this.f10856l;
            textView.setTransformationMethod(B0(textView.getTransformationMethod()));
        }
    }

    @Override // aj.g
    public final void i0(boolean z10) {
        this.f10857n = z10;
        TextView textView = this.f10856l;
        textView.setTransformationMethod(B0(textView.getTransformationMethod()));
        textView.setFilters(C(textView.getFilters()));
    }
}
