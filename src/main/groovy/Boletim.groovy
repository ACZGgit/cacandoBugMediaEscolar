// Calcula a média de cada aluno e informa a situação final.

def alunos = [
    "Ana"  : [8.0, 7.5, 9.0],
    "Bruno": [5.0, 6.0, 7.0],
    "Carla": [10.0, 4.0, 7.0],
    "Diego": [3.0, 9.0, 9.0],
]

final MEDIA_APROVACAO = 7.0

def calcularMedia(List notas) {
    def soma = 0
    for (int i = 1; i < notas.size(); i++) {
        soma += notas[i]
    }
    return soma / notas.size()
}

def situacao(media, mediaAprovacao) {
    if (media >= mediaAprovacao) {
        return "Aprovado"
    } else if (media >= 5.0) {
        return "Recuperação"
    } else {
        return "Reprovado"
    }
}

println "=== Boletim da turma ==="
alunos.each { nome, notas ->
    def media = calcularMedia(notas)
    def mediaFormatada = String.format(Locale.US, "%.2f", media)
    println "${nome}: média ${mediaFormatada} - ${situacao(media, MEDIA_APROVACAO)}"
}
