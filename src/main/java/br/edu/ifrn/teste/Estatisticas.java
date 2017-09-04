/*
 * MIT License
 *
 * Copyright (c) 2017 José Nascimento <joseaugustodearaujonascimento@gmail.com>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package br.edu.ifrn.teste;

/**
 * @author José Nascimento <joseaugustodearaujonascimento@gmail.com>
 */
public class Estatisticas {

    public static Estatisticas estatisticas(Object[] args) {

        if (!args.getClass().equals(Integer[].class))
            throw new IllegalArgumentException("Tipo deve ser Int[]");

        return new Estatisticas(1, 1, 1, 1);
    }

    private int menor;
    private int maior;
    private int media;
    private int tamanho;

    Estatisticas(int menor, int maior, int media, int tamanho) {

        this.menor = menor;
        this.maior = maior;
        this.media = media;
        this.tamanho = tamanho;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) {

            return false;
        }

        if (obj.getClass().equals(Estatisticas.class)) {

            Estatisticas other = (Estatisticas) obj;

            return other.menor == this.menor
                && other.maior == this.maior
                && other.media == this.media
                && other.tamanho == this.tamanho;

        } else {

            return false;
        }

    }

    public int getMaior() {

        return this.maior;
    }

    public int getMedia() {

        return this.media;
    }

    public int getMenor() {

        return this.menor;
    }

    public int getTamanho() {

        return this.tamanho;
    }

    public void setMaior(int maior) {

        this.maior = maior;
    }

    public void setMedia(int media) {

        this.media = media;
    }

    public void setMenor(int menor) {

        this.menor = menor;
    }

    public void setTamanho(int tamanho) {

        this.tamanho = tamanho;
    }

}
